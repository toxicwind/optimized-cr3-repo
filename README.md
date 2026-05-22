# optimized-cr3-repo

High-signal, consolidated Cloudstream provider research and validation workspace.

This repository is the canonical location for:

- extracted provider artifacts,
- telemetry + chimera data,
- analysis/validation scripts,
- upstream Cloudstream reference source,
- reproducible verification outputs.

---

## 🔗 Repository Endpoint

Use this URL as your extension repository endpoint:

`https://raw.githubusercontent.com/toxicwind/optimized-cr3-repo/main/repo.json`

---

## ✅ Current Completion Snapshot

- **Workspace consolidation**: complete (all assets moved under this repo)
- **Repository organization**: complete (data/analysis/docs/upstream)
- **Fallback provider validator**: complete and runnable
- **Latest validation result**: **19/19 providers `PASS_STRONG`**, **0 FAIL**, average score **95.78%**
- **Official Cloudstream test harness discovery**: complete
- **Official test execution status**: blocked locally until Android SDK/device is configured

---

## 🗂️ Repository Layout

```text
optimized-cr3-repo/
├─ data/
│  ├─ chimera_extracted_v3/
│  ├─ telemetry_dump/
│  ├─ telemetry_dump_unblinded/
│  └─ plugins_original.json
├─ analysis/
│  ├─ scripts/
│  │  ├─ provider_e2e_validator.py
│  │  ├─ actual_provider_assessment.py
│  │  ├─ real_provider_health_test.py
│  │  ├─ maxlevel_engine.py
│  │  ├─ CLOUDSTREAM_PROVIDER_CONTEXT.py
│  │  └─ ...
│  └─ logs/
├─ docs/
│  ├─ reports/
│  └─ verification/
│     ├─ provider_e2e_validation.json
│     └─ provider_e2e_validation_summary.txt
├─ upstream/
│  └─ cloudstream_repo/
├─ src/
├─ scripts/
├─ repo.json
└─ plugins.json
```

---

## 🧪 End-to-End Validation Plan (Maximum Completion)

This is the execution order used and recommended from now on.

### Phase 1 — Baseline Integrity

1. Verify data directories exist.
2. Verify expected provider artifact files per provider (`_jsm`, `_patterns`, `_selectors`, `_strings`).
3. Verify decompiled source structure under `telemetry_dump_unblinded`.

### Phase 2 — Official Harness Attempt

1. Use upstream Cloudstream source under `upstream/cloudstream_repo`.
2. Enumerate official test targets via Gradle.
3. Attempt official tests:
	- `:app:testStableDebugUnitTest`
	- `:app:connectedStableDebugAndroidTest`
4. If blocked, capture blockers and continue to fallback validation.

### Phase 3 — Local Fallback (Cloudstream-Criteria Validator)

Run:

`python3 analysis/scripts/provider_e2e_validator.py`

What it validates:

- plugin wrapper presence,
- MainAPI implementation discovery,
- `search` / `load` / `loadLinks` method signals,
- homepage capability signals,
- timeout/caching/decryption/selectors/pattern readiness,
- hostname extraction + DNS resolution attempts,
- weighted per-provider score and verdict.

### Phase 4 — Report + Remediation Loop

1. Review `docs/verification/provider_e2e_validation.json`.
2. Prioritize weakest providers from summary bottom list.
3. Patch extraction logic/selectors/patterns.
4. Re-run validator until target threshold is reached.

---

## 🚀 How to Run

From repo root:

```bash
./analysis/scripts/run_e2e_validation.sh

# or validator-only
python3 analysis/scripts/provider_e2e_validator.py

# launch local dashboard (port 8787 default)
./analysis/scripts/launch_dashboard.sh
```

Output files:

- `docs/verification/provider_e2e_validation.json`
- `docs/verification/provider_e2e_validation_summary.txt`

---

## 📈 Local Dashboard

Interactive dashboard lives at:

- `docs/dashboard/index.html`

It visualizes:

- aggregate pass/fail metrics,
- per-provider score bars,
- filterable verdict + minimum score,
- detailed method/signal/DNS readiness table.

### Launch locally

```bash
./analysis/scripts/launch_dashboard.sh
```

Then open:

`http://127.0.0.1:8787/dashboard/index.html`

---

## 🧭 Official Cloudstream Tests (Prerequisites)

The upstream harness exists, but local execution requires Android tooling.

### Required to run official targets

- Android SDK configured (`ANDROID_HOME` or `local.properties` with `sdk.dir=...`)
- Android platform/build-tools installed
- For instrumentation tests: connected device/emulator (`adb devices` non-empty)

### Example targets

```bash
cd upstream/cloudstream_repo
./gradlew :app:testStableDebugUnitTest
./gradlew :app:connectedStableDebugAndroidTest
```

---

## 📌 Notes

- Cloudstream core repository itself does **not** ship site providers; it provides runtime + testing framework.
- Extracted providers in this repo are validated against Cloudstream MainAPI expectations.
- This repository is now fully consolidated; `cr3_forge` root intentionally contains only `optimized-cr3-repo`.

---

## 📊 Latest Validation Result

From current run:

- Total providers: **19**
- `PASS_STRONG`: **19**
- `PASS_PARTIAL`: **0**
- `NEEDS_WORK`: **0**
- `FAIL`: **0**
- Average score: **95.78%**

Goal from here: keep **95%+** static validation while unlocking official Android harness execution (ADB/device + SDK) to verify runtime behavior end-to-end.

