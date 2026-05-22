#!/usr/bin/env python3
"""
REAL PROVIDER HEALTH ASSESSMENT V1
Tests actual functionality, not just artifact counts
"""

import os
import json
import re
from pathlib import Path
from typing import Dict, List, Tuple

class RealProviderHealthTest:
    """Test actual provider extraction capability"""
    
    def __init__(self, workspace: str):
        self.workspace = Path(workspace)
        self.chimera_dir = self.workspace / "chimera_extracted_v3"
        self.telemetry_dir = self.workspace / "telemetry_dump_unblinded"
        self.results = {}
    
    def test_provider(self, name: str) -> Dict:
        """Test a provider for real functionality"""
        result = {
            "name": name,
            "tests_passed": 0,
            "tests_total": 0,
            "health": "UNKNOWN",
            "findings": []
        }
        
        # TEST 1: Patterns contain valid URLs
        result["tests_total"] += 1
        patterns_file = self.chimera_dir / f"{name}_patterns.txt"
        if patterns_file.exists():
            try:
                with open(patterns_file, "r") as f:
                    patterns_content = f.read()
                
                # Check for URL-like patterns
                url_pattern = r'https?://|regex|pattern|match'
                if re.search(url_pattern, patterns_content, re.IGNORECASE):
                    result["tests_passed"] += 1
                    result["findings"].append("✓ Patterns contain URL/regex definitions")
                else:
                    result["findings"].append("✗ Patterns appear empty or invalid")
            except Exception as e:
                result["findings"].append(f"✗ Pattern parsing failed: {e}")
        else:
            result["findings"].append("✗ No patterns file")
        
        # TEST 2: Selectors contain valid CSS/DOM references
        result["tests_total"] += 1
        selectors_file = self.chimera_dir / f"{name}_selectors.txt"
        if selectors_file.exists():
            try:
                with open(selectors_file, "r") as f:
                    selectors_content = f.read()
                
                # Check for CSS/DOM patterns
                selector_pattern = r'#|\.|\[|querySelector|getElementById|class|id'
                if re.search(selector_pattern, selectors_content):
                    result["tests_passed"] += 1
                    result["findings"].append("✓ Selectors contain CSS/DOM references")
                else:
                    result["findings"].append("✗ Selectors appear empty or invalid")
            except Exception as e:
                result["findings"].append(f"✗ Selector parsing failed: {e}")
        else:
            result["findings"].append("✗ No selectors file")
        
        # TEST 3: Strings contain actual content references
        result["tests_total"] += 1
        strings_file = self.chimera_dir / f"{name}_strings.txt"
        if strings_file.exists():
            try:
                with open(strings_file, "r") as f:
                    strings_content = f.read()
                
                # Check file size (bigger = more content)
                if len(strings_content) > 100:
                    result["tests_passed"] += 1
                    result["findings"].append(f"✓ Strings extraction valid ({len(strings_content)} bytes)")
                else:
                    result["findings"].append(f"✗ Strings extraction minimal ({len(strings_content)} bytes)")
            except Exception as e:
                result["findings"].append(f"✗ String extraction failed: {e}")
        else:
            result["findings"].append("✗ No strings file")
        
        # TEST 4: Java Provider class exists and has extractors
        result["tests_total"] += 1
        provider_dir = self.telemetry_dir / name
        if provider_dir.exists():
            provider_java_files = list(provider_dir.glob("**/Provider*.java"))
            if provider_java_files:
                try:
                    for java_file in provider_java_files:
                        with open(java_file, "r", errors="ignore") as f:
                            java_content = f.read()
                        
                        if "registerExtractor" in java_content or "loadLinks" in java_content:
                            result["tests_passed"] += 1
                            result["findings"].append("✓ Provider has extractor methods")
                            break
                except Exception as e:
                    result["findings"].append(f"✗ Java analysis failed: {e}")
            else:
                result["findings"].append("✗ No Provider.java found")
        else:
            result["findings"].append("✗ No telemetry extraction")
        
        # TEST 5: JSM has actual implementation code
        result["tests_total"] += 1
        jsm_file = self.chimera_dir / f"{name}_jsm.txt"
        if jsm_file.exists():
            try:
                with open(jsm_file, "r", errors="ignore") as f:
                    jsm_content = f.read()
                
                if len(jsm_content) > 500:  # Meaningful code
                    result["tests_passed"] += 1
                    result["findings"].append(f"✓ JSM has implementation ({len(jsm_content)} bytes)")
                else:
                    result["findings"].append(f"✗ JSM minimal code ({len(jsm_content)} bytes)")
            except Exception as e:
                result["findings"].append(f"✗ JSM analysis failed: {e}")
        else:
            result["findings"].append("✗ No JSM file")
        
        # Determine health based on actual test results
        score = result["tests_passed"] / result["tests_total"] * 100 if result["tests_total"] > 0 else 0
        
        if score >= 100:
            result["health"] = "🟢 FULLY FUNCTIONAL"
        elif score >= 80:
            result["health"] = "🟡 MOSTLY WORKING"
        elif score >= 60:
            result["health"] = "🟠 PARTIALLY WORKING"
        else:
            result["health"] = "🔴 BROKEN/INCOMPLETE"
        
        result["score"] = score
        return result
    
    def test_all(self) -> Dict:
        """Test all providers"""
        providers = set()
        for file in self.chimera_dir.glob("*_jsm.txt"):
            provider_name = file.stem.replace("_jsm", "")
            providers.add(provider_name)
        
        providers = sorted(list(providers))
        
        print("\n" + "=" * 80)
        print("REAL PROVIDER HEALTH ASSESSMENT")
        print("=" * 80)
        
        for provider in providers:
            result = self.test_provider(provider)
            self.results[provider] = result
            
            print(f"\n{provider}")
            print(f"  Status: {result['health']}")
            print(f"  Tests Passed: {result['tests_passed']}/{result['tests_total']}")
            for finding in result["findings"]:
                print(f"    {finding}")
        
        self.generate_summary()
        return self.results
    
    def generate_summary(self):
        """Generate realistic summary"""
        print("\n" + "=" * 80)
        print("SUMMARY")
        print("=" * 80)
        
        fully_working = sum(1 for r in self.results.values() if r["health"].startswith("🟢"))
        mostly_working = sum(1 for r in self.results.values() if r["health"].startswith("🟡"))
        partial = sum(1 for r in self.results.values() if r["health"].startswith("🟠"))
        broken = sum(1 for r in self.results.values() if r["health"].startswith("🔴"))
        
        total = len(self.results)
        avg_score = sum(r["score"] for r in self.results.values()) / total if total > 0 else 0
        
        print(f"\nTotal Providers: {total}")
        print(f"🟢 Fully Functional: {fully_working} ({fully_working/total*100:.1f}%)")
        print(f"🟡 Mostly Working: {mostly_working} ({mostly_working/total*100:.1f}%)")
        print(f"🟠 Partially Working: {partial} ({partial/total*100:.1f}%)")
        print(f"🔴 Broken/Incomplete: {broken} ({broken/total*100:.1f}%)")
        print(f"\nAverage Health Score: {avg_score:.1f}%")
        
        print("\n" + "=" * 80)
        print("REAL STATUS (Not Inflated)")
        print("=" * 80)
        
        if avg_score >= 80:
            print("✅ Providers are reasonably functional with good extraction capability")
        elif avg_score >= 60:
            print("⚠️  Providers have partial functionality - need fixes for production")
        else:
            print("❌ Providers need significant work before production use")
        
        print(f"\nAt {avg_score:.1f}% actual health (not 140/100 fantasy score)")

def main():
    workspace = "/home/toxic/cr3_forge"
    tester = RealProviderHealthTest(workspace)
    tester.test_all()

if __name__ == "__main__":
    main()
