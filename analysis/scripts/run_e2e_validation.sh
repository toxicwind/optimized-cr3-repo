#!/usr/bin/env bash
set -euo pipefail

ROOT="/home/toxic/cr3_forge/optimized-cr3-repo"
UPSTREAM="$ROOT/upstream/cloudstream_repo"
VALIDATOR="$ROOT/analysis/scripts/provider_e2e_validator.py"

echo "== E2E Validation Orchestrator =="
echo "Repo: $ROOT"

# Phase 1: baseline checks
[[ -d "$ROOT/data/chimera_extracted_v3" ]] || { echo "Missing chimera data"; exit 1; }
[[ -d "$ROOT/data/telemetry_dump_unblinded" ]] || { echo "Missing telemetry dump"; exit 1; }
[[ -f "$VALIDATOR" ]] || { echo "Missing validator script"; exit 1; }

echo "[1/3] Baseline checks passed"

# Phase 2: official cloudstream test attempt
if [[ -d "$UPSTREAM" ]]; then
  echo "[2/3] Attempting official Cloudstream tests..."
  pushd "$UPSTREAM" >/dev/null

  OFFICIAL_STATUS="ok"
  if [[ -z "${ANDROID_HOME:-}" && ! -f "$UPSTREAM/local.properties" ]]; then
    OFFICIAL_STATUS="blocked_sdk"
  fi

  if ! command -v adb >/dev/null 2>&1; then
    OFFICIAL_STATUS="blocked_adb"
  fi

  if [[ "$OFFICIAL_STATUS" == "ok" ]]; then
    set +e
    ./gradlew :app:testStableDebugUnitTest
    UNIT_RC=$?
    ./gradlew :app:connectedStableDebugAndroidTest
    ANDROID_RC=$?
    set -e
    echo "Official tests -> unit:$UNIT_RC android:$ANDROID_RC"
  else
    echo "Official tests blocked: $OFFICIAL_STATUS"
    echo "Reason: Android SDK/device prerequisites not satisfied in this environment"
  fi

  popd >/dev/null
else
  echo "[2/3] Upstream cloudstream repo missing, skipping official tests"
fi

# Phase 3: fallback validator (always run)
echo "[3/3] Running local provider validator..."
python3 "$VALIDATOR"

echo "\nDone. Reports:"
echo "- $ROOT/docs/verification/provider_e2e_validation.json"
echo "- $ROOT/docs/verification/provider_e2e_validation_summary.txt"
