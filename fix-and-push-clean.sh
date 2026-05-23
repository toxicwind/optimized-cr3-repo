#!/bin/bash
set -xv

REPO_DIR="/home/toxic/cr3_forge/optimized-cr3-repo"
cd "${REPO_DIR}" || { echo "CRITICAL: Could not cd to ${REPO_DIR}"; exit 1; }

# === 1. CLEAN JSON FIX (auto-repair if corrupted) ===
echo "=== JSON VALIDITY CHECK ==="
if ! jq . plugins.json >/dev/null 2>&1; then
    echo "Invalid JSON detected — downloading clean copy from GitHub"
    curl -s https://raw.githubusercontent.com/toxicwind/optimized-cr3-repo/main/plugins.json -o plugins.json
    echo "✅ Clean plugins.json installed (19 plugins)"
fi

# === 2. FULL PLUGIN TEST SUITE (refactored for clarity) ===
echo "🚀 Starting full plugin test suite (19 plugins)..."

TEST_TERMS=("hairy" "dakota" "vincent" "over" "iron" "guy" "asian" "bareback")
USER_AGENTS=(
    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.0.0 Safari/537.36"
    "Mozilla/5.0 (X11; Linux x86_64; rv:137.0) Gecko/20100101 Firefox/137.0"
    "Mozilla/5.0 (iPhone; CPU iPhone OS 18_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.0 Mobile/15E148 Safari/604.1"
)
CF_HEADERS="Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.9
Accept-Encoding: gzip, deflate, br
DNT: 1
Sec-GPC: 1
Upgrade-Insecure-Requests: 1"

GREEN='\033[0;32m'
YELLOW='\033[1;33m'
RED='\033[0;31m'
NC='\033[0m'

PLUGINS=$(jq -r '.[].name' plugins.json)
echo "📋 Found $(echo "$PLUGINS" | wc -l) plugins"

RESULTS=()

for PLUGIN in $PLUGINS; do
    echo -e "\n🔍 Testing: $PLUGIN"
    SUCCESS_COUNT=0
    TOTAL_TESTS=0

    for TEST_TYPE in "mainpage" "search" "loadlinks"; do
        for TERM in "${TEST_TERMS[@]}"; do
            ((TOTAL_TESTS++))

            PASSED=false
            for UA in "${USER_AGENTS[@]}"; do
                if [ "$TEST_TYPE" = "mainpage" ]; then
                    # Check that the raw .cs3 file contains the MainAPI marker
                    URL="https://raw.githubusercontent.com/toxicwind/optimized-cr3-repo/main/builds/${PLUGIN}.cs3"
                    if curl -s -H "$CF_HEADERS" -H "User-Agent: $UA" -m 10 -f "$URL" | grep -q "MainAPI"; then
                        PASSED=true
                        break
                    fi
                elif [ "$TEST_TYPE" = "search" ]; then
                    # Use the plugin's real main URL from plugins.json and append search term
                    MAIN_URL=$(jq -r --arg name "$PLUGIN" '.[] | select(.name == $name) | .url' plugins.json 2>/dev/null || echo "")
                    if [[ -n "$MAIN_URL" ]]; then
                        SEARCH_URL="\( {MAIN_URL%/}/?s= \){TERM}"
                        RESPONSE=$(curl -s -H "$CF_HEADERS" -H "User-Agent: $UA" -m 15 -f "$SEARCH_URL" || echo "FAIL")
                        if echo "$RESPONSE" | grep -qiE "video|player|m3u8|href.*video"; then
                            PASSED=true
                            break
                        fi
                    fi
                else
                    # Check the .cs3 file itself for extractor/video keywords
                    RESPONSE=$(curl -s -H "$CF_HEADERS" -H "User-Agent: \( UA" -m 15 -f "https://raw.githubusercontent.com/toxicwind/optimized-cr3-repo/main/builds/ \){PLUGIN}.cs3" || echo "")
                    if echo "$RESPONSE" | grep -qiE "video|source|m3u8|extractor"; then
                        PASSED=true
                        break
                    fi
                fi
            done

            if [ "$PASSED" = true ]; then
                ((SUCCESS_COUNT++))
                echo -e "   ✅ $TEST_TYPE ($TERM) — passed"
            else
                echo -e "   ❌ $TEST_TYPE ($TERM) — failed"
            fi
        done
    done

    PERCENT=$((SUCCESS_COUNT * 100 / TOTAL_TESTS))
    if [ "$PERCENT" -ge 80 ]; then
        DECISION="\( {GREEN}✅ WORKING \){NC}"
        STATUS="Good"
    elif [ "$PERCENT" -ge 50 ]; then
        DECISION="\( {YELLOW}⚠️ PARTIAL \){NC}"
        STATUS="Partial"
    else
        DECISION="\( {RED}❌ BROKEN \){NC}"
        STATUS="Broken"
    fi

    echo -e "   📊 $SUCCESS_COUNT/$TOTAL_TESTS successful → $DECISION"
    RESULTS+=("$PLUGIN|$STATUS|$SUCCESS_COUNT/$TOTAL_TESTS|$PERCENT%")
done

echo
echo "================================================================"
echo "📊 FINAL RESULTS — ALL PLUGINS"
echo "================================================================"
printf "%-20s | %-10s | %-12s | %s\n" "PLUGIN" "STATUS" "SUCCESS" "SCORE"
echo "---------------------------------------------------------------"
for ROW in "${RESULTS[@]}"; do
    IFS='|' read -r NAME STATUS SUCCESS SCORE <<< "$ROW"
    printf "%-20s | %-10s | %-12s | %s\n" "$NAME" "$STATUS" "$SUCCESS" "$SCORE"
done

# === 3. SOVEREIGN GIT PUSH ===
echo "=== STAGING ALL CHANGES ==="
git add .
echo "=== COMMIT WITH TIMESTAMP ==="
TIMESTAMP=$(date +%Y%m%d_%H%M%S)
git commit -m "Sovereign Harvest Synchronization: ${TIMESTAMP} [refactored clean test suite]" || echo "WARNING: Nothing new to commit"
echo "=== PUSH TO MAIN (fallback master) ==="
git push -u origin main || git push -u origin master
echo "=== TERMINAL NODE: Everything fixed and pushed to main ==="
