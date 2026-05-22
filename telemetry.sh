#!/bin/bash
# -------------------------------------------------------------------------
# UNBLINDED TELEMETRY HARVESTER V5 (AGGRESSIVE TRACE-ENABLED)
# -------------------------------------------------------------------------
set -xv

# Define the absolute workspace
WORKSPACE="/home/toxic/cr3_forge"
TELEMETRY_DUMP="/home/toxic/cr3_forge/telemetry_dump_unblinded"
mkdir -p "${TELEMETRY_DUMP}"

# Initialize comprehensive audit log
AUDIT_LOG="${TELEMETRY_DUMP}/full_audit_trace.log"
> "${AUDIT_LOG}"

# 1. Surgical Decompilation & Source Exposure
# We iterate through the raw .cs3 binary blobs in the repository
for cs3file in "${WORKSPACE}/optimized-cr3-repo/builds/"*.cs3; do
    [ -f "$cs3file" ] || continue
    
    PLUGIN_NAME=$(basename "$cs3file" .cs3)
    echo ":: STARTING EXTRACTION FOR: ${PLUGIN_NAME} ::" | tee -a "${AUDIT_LOG}"
    
    # Create the landing pad for raw artifacts
    PLUGIN_DIR="${TELEMETRY_DUMP}/${PLUGIN_NAME}"
    mkdir -p "${PLUGIN_DIR}"/{source,artifacts,analysis,strings}
    
    # 2a. Bytecode Unpacking - Extract all content from CS3
    # No redirection. All unzip errors will bleed into the terminal trace
    unzip -l "${cs3file}" | tee -a "${AUDIT_LOG}"
    unzip "${cs3file}" -d "${PLUGIN_DIR}/artifacts" 2>&1 | tee -a "${AUDIT_LOG}"
    
    # 2b. Extract resources directly
    if [ -f "${PLUGIN_DIR}/artifacts/classes.dex" ]; then
        echo ":: DEX EXTRACTION SUCCESSFUL FOR: ${PLUGIN_NAME} ::" | tee -a "${AUDIT_LOG}"
    fi
    
    # 2c. Extract and catalog all binary resources
    find "${PLUGIN_DIR}/artifacts" -type f ! -name "*.dex" ! -name "*.so" | while read -r resource; do
        echo ":: RESOURCE FOUND: ${resource} ::" | tee -a "${AUDIT_LOG}"
        file "${resource}" | tee -a "${AUDIT_LOG}"
    done
    
    # 3. Full Decompilation with Maximum Verbosity
    # Jadx will dump every single Java class file discovered in the dex
    # This allows for manual auditing of the Provider logic
    echo ":: STARTING JADX DECOMPILATION FOR: ${PLUGIN_NAME} ::" | tee -a "${AUDIT_LOG}"
    jadx -d "${PLUGIN_DIR}/source" "${PLUGIN_DIR}/artifacts/classes.dex" \
        --deobf --deobf-min 2 --escape-unicode --show-bad-code \
        --decompilation-mode fallback --comments-level debug \
        --log-level debug 2>&1 | tee -a "${AUDIT_LOG}"
    
    # 3b. Extract and dump ALL Java files discovered
    echo ":: CATALOGING ALL DECOMPILED JAVA FILES FOR: ${PLUGIN_NAME} ::" | tee -a "${AUDIT_LOG}"
    find "${PLUGIN_DIR}/source" -name "*.java" -type f | sort | while read -r javafile; do
        echo ":: JAVA FILE: ${javafile} ::" | tee -a "${AUDIT_LOG}"
        wc -l "${javafile}" | tee -a "${AUDIT_LOG}"
    done
    
    # 4. Total Logic Exposure - Provider Classes (NO PIPED GREP SUPPRESSION)
    # We output the entire file content of ALL Provider classes to the terminal for direct audit
    echo ":: EXPOSING PROVIDER LOGIC: ${PLUGIN_NAME} ::" | tee -a "${AUDIT_LOG}"
    
    find "${PLUGIN_DIR}/source" -name "*Provider.java" | sort | while read -r PROVIDER_PATH; do
        if [ -n "${PROVIDER_PATH}" ]; then
            echo ":: DUMPING SOURCE CODE FOR: ${PROVIDER_PATH} ::" | tee -a "${AUDIT_LOG}"
            cat "${PROVIDER_PATH}" | tee -a "${AUDIT_LOG}"
            echo ":: END OF FILE: ${PROVIDER_PATH} ::" | tee -a "${AUDIT_LOG}"
        fi
    done
    
    # 5. Extract Network Endpoints & URLs
    echo ":: EXTRACTING NETWORK ENDPOINTS FOR: ${PLUGIN_NAME} ::" | tee -a "${AUDIT_LOG}"
    grep -r "http" "${PLUGIN_DIR}/source" --include="*.java" | tee -a "${AUDIT_LOG}"
    grep -r "socket\|SERVER\|HOST\|PORT\|ENDPOINT" "${PLUGIN_DIR}/source" --include="*.java" | tee -a "${AUDIT_LOG}"
    
    # 6. Extract String Constants & Configuration
    echo ":: EXTRACTING STRING CONSTANTS FOR: ${PLUGIN_NAME} ::" | tee -a "${AUDIT_LOG}"
    grep -r "\".*\"" "${PLUGIN_DIR}/source" --include="*.java" | grep -v "//.*\"" | tee -a "${AUDIT_LOG}"
    
    # 7. Extract Intent/Permission Declarations
    echo ":: EXTRACTING INTENTS & PERMISSIONS FOR: ${PLUGIN_NAME} ::" | tee -a "${AUDIT_LOG}"
    grep -r "Intent\|PERMISSION\|ACTION\|CATEGORY" "${PLUGIN_DIR}/source" --include="*.java" | tee -a "${AUDIT_LOG}"
    
    # 8. Extract Introspection & Reflection Calls
    echo ":: EXTRACTING REFLECTION CALLS FOR: ${PLUGIN_NAME} ::" | tee -a "${AUDIT_LOG}"
    grep -r "getClass\|forName\|getMethod\|invoke\|getDeclaredField\|newInstance" "${PLUGIN_DIR}/source" --include="*.java" | tee -a "${AUDIT_LOG}"
    
    # 9. Extract API Calls & External Libraries
    echo ":: EXTRACTING EXTERNAL API CALLS FOR: ${PLUGIN_NAME} ::" | tee -a "${AUDIT_LOG}"
    grep -r "\.get\|\.post\|\.request\|OkHttp\|Retrofit\|volley" "${PLUGIN_DIR}/source" --include="*.java" | tee -a "${AUDIT_LOG}"
    
    # 10. Generate comprehensive summary report
    echo ":: GENERATING SUMMARY REPORT FOR: ${PLUGIN_NAME} ::" | tee -a "${AUDIT_LOG}"
    {
        echo "==============================================="
        echo "PLUGIN: ${PLUGIN_NAME}"
        echo "==============================================="
        echo "Total Java Files: $(find "${PLUGIN_DIR}/source" -name "*.java" | wc -l)"
        echo "Total Lines of Code: $(find "${PLUGIN_DIR}/source" -name "*.java" -exec wc -l {} + | tail -1 | awk '{print $1}')"
        echo "Provider Classes: $(find "${PLUGIN_DIR}/source" -name "*Provider.java" | wc -l)"
        echo "==============================================="
        echo "FILES EXTRACTED:"
        find "${PLUGIN_DIR}/source" -name "*.java" | head -20
        echo "==============================================="
    } | tee -a "${AUDIT_LOG}"
    
    echo ":: END OF TELEMETRY: ${PLUGIN_NAME} ::" | tee -a "${AUDIT_LOG}"
    echo "" | tee -a "${AUDIT_LOG}"
done

echo ":: COMPREHENSIVE TELEMETRY HARVEST COMPLETE ::" | tee -a "${AUDIT_LOG}"
echo ":: AUDIT LOG WRITTEN TO: ${AUDIT_LOG} ::" | tee -a "${AUDIT_LOG}"

# The stream will terminate here, showing all file descriptors open, read, and closed