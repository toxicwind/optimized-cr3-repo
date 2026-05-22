#!/bin/bash
# =========================================================================
# COMPREHENSIVE TEST SUITE FOR TELEMETRY & REAVER PIPELINE
# =========================================================================
set -xv

WORKSPACE="/home/toxic/cr3_forge"
TEST_LOG="${WORKSPACE}/test_suite_results.log"
> "${TEST_LOG}"

function test_log() {
    echo "[TEST] $1" | tee -a "${TEST_LOG}"
}

function test_pass() {
    echo "✓ PASS: $1" | tee -a "${TEST_LOG}"
}

function test_fail() {
    echo "✗ FAIL: $1" | tee -a "${TEST_LOG}"
}

# =========================================================================
# TEST 1: Telemetry Script Exists & Is Executable
# =========================================================================
test_log "TEST 1: Telemetry Script Validation"
if [ -f "${WORKSPACE}/optimized-cr3-repo/telemetry.sh" ]; then
    test_pass "telemetry.sh exists"
else
    test_fail "telemetry.sh not found"
    exit 1
fi

if [ -x "${WORKSPACE}/optimized-cr3-repo/telemetry.sh" ]; then
    test_pass "telemetry.sh is executable"
else
    test_fail "telemetry.sh is not executable"
    chmod +x "${WORKSPACE}/optimized-cr3-repo/telemetry.sh"
    test_pass "telemetry.sh made executable"
fi

# =========================================================================
# TEST 2: Reaver Patcher Script Exists & Is Valid Python
# =========================================================================
test_log "TEST 2: Reaver Patcher Validation"
if [ -f "${WORKSPACE}/optimized-cr3-repo/reaver_patcher.py" ]; then
    test_pass "reaver_patcher.py exists"
else
    test_fail "reaver_patcher.py not found"
fi

if command -v python3 &> /dev/null; then
    if python3 -m py_compile "${WORKSPACE}/optimized-cr3-repo/reaver_patcher.py" 2>/dev/null; then
        test_pass "reaver_patcher.py is valid Python"
    else
        test_fail "reaver_patcher.py has syntax errors"
    fi
else
    test_fail "Python3 not found"
fi

# =========================================================================
# TEST 3: Chimera Extracted Directory Validation
# =========================================================================
test_log "TEST 3: Chimera Extracted Data Validation"
CHIMERA_DIR="${WORKSPACE}/chimera_extracted_v3"

if [ -d "${CHIMERA_DIR}" ]; then
    test_pass "chimera_extracted_v3 directory exists"
    
    # Count providers
    PROVIDER_COUNT=$(find "${CHIMERA_DIR}" -name "*_jsm.txt" | wc -l)
    test_pass "Found ${PROVIDER_COUNT} providers"
    
    # Check file structure
    PATTERN_COUNT=$(find "${CHIMERA_DIR}" -name "*_patterns.txt" | wc -l)
    SELECTOR_COUNT=$(find "${CHIMERA_DIR}" -name "*_selectors.txt" | wc -l)
    STRING_COUNT=$(find "${CHIMERA_DIR}" -name "*_strings.txt" | wc -l)
    
    if [ "${PATTERN_COUNT}" -eq "${PROVIDER_COUNT}" ] && \
       [ "${SELECTOR_COUNT}" -eq "${PROVIDER_COUNT}" ] && \
       [ "${STRING_COUNT}" -eq "${PROVIDER_COUNT}" ]; then
        test_pass "All providers have complete file sets"
    else
        test_fail "Incomplete provider file sets"
    fi
else
    test_fail "chimera_extracted_v3 directory not found"
fi

# =========================================================================
# TEST 4: Telemetry Output Directories Validation
# =========================================================================
test_log "TEST 4: Telemetry Output Directories"

if [ -d "${WORKSPACE}/telemetry_dump" ]; then
    test_pass "telemetry_dump directory exists"
    DUMP_SIZE=$(du -sh "${WORKSPACE}/telemetry_dump" 2>/dev/null | cut -f1)
    test_pass "telemetry_dump size: ${DUMP_SIZE}"
else
    test_pass "telemetry_dump not yet created (expected)"
fi

if [ -d "${WORKSPACE}/telemetry_dump_unblinded" ]; then
    test_pass "telemetry_dump_unblinded directory exists"
    UNBLINDED_SIZE=$(du -sh "${WORKSPACE}/telemetry_dump_unblinded" 2>/dev/null | cut -f1)
    test_pass "telemetry_dump_unblinded size: ${UNBLINDED_SIZE}"
else
    test_pass "telemetry_dump_unblinded not yet created (expected)"
fi

# =========================================================================
# TEST 5: Script Content Validation
# =========================================================================
test_log "TEST 5: Script Content Verification"

# Check telemetry.sh contains key functions
if grep -q "jadx" "${WORKSPACE}/optimized-cr3-repo/telemetry.sh"; then
    test_pass "telemetry.sh contains jadx decompilation"
else
    test_fail "telemetry.sh missing jadx decompilation"
fi

if grep -q "grep -r" "${WORKSPACE}/optimized-cr3-repo/telemetry.sh"; then
    test_pass "telemetry.sh contains extraction rules"
else
    test_fail "telemetry.sh missing extraction rules"
fi

if grep -q "AUDIT_LOG" "${WORKSPACE}/optimized-cr3-repo/telemetry.sh"; then
    test_pass "telemetry.sh includes audit logging"
else
    test_fail "telemetry.sh missing audit logging"
fi

# =========================================================================
# TEST 6: Dependencies Check
# =========================================================================
test_log "TEST 6: Dependencies Verification"

DEPS=("grep" "find" "python3")
for dep in "${DEPS[@]}"; do
    if command -v "$dep" &> /dev/null; then
        test_pass "Dependency found: $dep"
    else
        test_fail "Dependency missing: $dep"
    fi
done

# =========================================================================
# TEST 7: File Integrity Checks
# =========================================================================
test_log "TEST 7: File Integrity"

# Check that sample files are readable
SAMPLE_JSM="${CHIMERA_DIR}/Xhamster_jsm.txt"
if [ -f "${SAMPLE_JSM}" ]; then
    if [ -r "${SAMPLE_JSM}" ]; then
        test_pass "Sample JSM file is readable"
        LINES=$(wc -l < "${SAMPLE_JSM}")
        test_pass "Sample JSM contains ${LINES} lines"
    else
        test_fail "Sample JSM file not readable"
    fi
fi

# =========================================================================
# TEST 8: Configuration Validation
# =========================================================================
test_log "TEST 8: Configuration Files"

if [ -f "${WORKSPACE}/plugins_original.json" ]; then
    test_pass "plugins_original.json exists"
    if command -v python3 &> /dev/null; then
        if python3 -c "import json; json.load(open('${WORKSPACE}/plugins_original.json'))" 2>/dev/null; then
            test_pass "plugins_original.json is valid JSON"
        else
            test_fail "plugins_original.json is invalid JSON"
        fi
    fi
else
    test_fail "plugins_original.json not found"
fi

# =========================================================================
# TEST 9: Morphe PME Script Validation
# =========================================================================
test_log "TEST 9: Morphe PME Validation"

if [ -f "${WORKSPACE}/morphe_pme.py" ]; then
    test_pass "morphe_pme.py exists"
    if python3 -m py_compile "${WORKSPACE}/morphe_pme.py" 2>/dev/null; then
        test_pass "morphe_pme.py is valid Python"
    else
        test_fail "morphe_pme.py has syntax errors"
    fi
else
    test_fail "morphe_pme.py not found"
fi

# =========================================================================
# TEST 10: Execution Simulation with Reaver Patcher
# =========================================================================
test_log "TEST 10: Reaver Patcher Execution Test"

# Run reaver patcher if python3 available
if command -v python3 &> /dev/null; then
    test_log "Executing reaver_patcher.py..."
    cd "${WORKSPACE}"
    if python3 "${WORKSPACE}/optimized-cr3-repo/reaver_patcher.py" > "${WORKSPACE}/reaver_execution.log" 2>&1; then
        test_pass "reaver_patcher.py executed successfully"
        
        # Check for output files
        if [ -d "${WORKSPACE}/telemetry_dump_unblinded/reaver_patches" ]; then
            test_pass "Reaver patches output directory created"
            PATCH_FILES=$(find "${WORKSPACE}/telemetry_dump_unblinded/reaver_patches" -name "*_patched.txt" | wc -l)
            test_pass "Generated ${PATCH_FILES} patched files"
        fi
        
        # Check for report
        if [ -f "${WORKSPACE}/telemetry_dump_unblinded/reaver_patches/reaver_report.txt" ]; then
            test_pass "Reaver report generated"
            cat "${WORKSPACE}/telemetry_dump_unblinded/reaver_patches/reaver_report.txt" | tee -a "${TEST_LOG}"
        fi
    else
        test_fail "reaver_patcher.py execution failed"
        cat "${WORKSPACE}/reaver_execution.log" >> "${TEST_LOG}"
    fi
fi

# =========================================================================
# SUMMARY
# =========================================================================
echo ""
echo "=========================================================================="
echo "TEST SUITE COMPLETE"
echo "=========================================================================="
echo "Full log: ${TEST_LOG}"
echo ""
echo "Last 30 lines of test log:"
tail -30 "${TEST_LOG}"
