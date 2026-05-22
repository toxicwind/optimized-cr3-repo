#!/usr/bin/env python3
"""End-to-end-ish local provider validator for extracted Cloudstream providers.

This script is designed for environments where full Android instrumentation tests
cannot run (missing SDK/emulator/device). It validates provider artifacts against
Cloudstream MainAPI expectations and performs lightweight network readiness checks.
"""

from __future__ import annotations

import json
import re
import socket
from dataclasses import dataclass, asdict
from pathlib import Path
from typing import Dict, List, Tuple

ROOT = Path("/home/toxic/cr3_forge/optimized-cr3-repo")
DATA = ROOT / "data"
TELEMETRY = DATA / "telemetry_dump_unblinded"
CHIMERA = DATA / "chimera_extracted_v3"
OUT_DIR = ROOT / "docs" / "verification"


@dataclass
class ProviderResult:
    name: str
    source_present: bool
    plugin_wrapper_present: bool
    mainapi_extends: bool
    has_search: bool
    has_load: bool
    has_loadlinks: bool
    has_mainpage_support: bool
    timeout_signals: int
    cache_signals: int
    decrypt_signals: int
    selector_signals: int
    pattern_signals: int
    hostname_count: int
    host_resolve_ok: int
    host_resolve_fail: int
    score: float
    verdict: str
    notes: List[str]


MAINAPI_METHODS = {
    "has_search": [r"\bsearch\s*\(", r'"search"'],
    "has_load": [r"\bload\s*\(", r"LoadResponse", r"dataUrl"],
    "has_loadlinks": [r"\bloadLinks\s*\(", r"ExtractorLink", r"loadLinksTimeoutMs"],
    "has_mainpage_support": [r"hasMainPage", r"getMainPage\s*\("],
}

SIGNAL_PATTERNS = {
    "timeout": [r"timeout", r"withTimeout", r"loadLinksTimeoutMs", r"getMainPageTimeoutMs"],
    "cache": [r"cache", r"cached", r"memo", r"LRU", r"Map<"],
    "decrypt": [r"decrypt", r"AES", r"Cipher", r"Base64", r"signature", r"token"],
    "selector": [r"select\(", r"querySelector", r"getElementById", r"\.class", r"#"],
    "pattern": [r"regex", r"Pattern", r"matches", r"https?://", r"url"],
}


def _read_text(path: Path) -> str:
    return path.read_text(encoding="utf-8", errors="ignore")


def _find_provider_source(provider: str) -> Tuple[Path | None, Path | None]:
    base = TELEMETRY / provider / "source" / "sources"
    if not base.exists():
        return None, None

    java_files = list(base.rglob("*.java"))
    provider_lower = provider.lower()

    provider_java = None
    impl_java = None

    for p in java_files:
        stem_lower = p.stem.lower()
        # wrapper class: e.g. FooProvider.java, GEpornerProvider.java
        if stem_lower == f"{provider_lower}provider":
            provider_java = p
            break

    # Alternate wrapper naming in some providers (e.g. JayboysPlugin)
    if provider_java is None:
        for p in java_files:
            stem_lower = p.stem.lower()
            if stem_lower == f"{provider_lower}plugin":
                provider_java = p
                break

    for p in java_files:
        stem_lower = p.stem.lower()
        # implementation class: e.g. Foo.java, GEporner.java
        if stem_lower == provider_lower:
            impl_java = p
            break

    # Fallback for slight naming drift in decompilation output
    if provider_java is None:
        for p in java_files:
            stem_lower = p.stem.lower()
            if (stem_lower.endswith("provider") or stem_lower.endswith("plugin")) and provider_lower in stem_lower:
                provider_java = p
                break

    # Final fallback: parse wrapper for classes registered via registerMainAPI()
    if impl_java is None and provider_java is not None:
        try:
            wrapper_text = _read_text(provider_java)
            candidates = re.findall(
                r"com\.[A-Za-z0-9_$.]+\.([A-Za-z0-9_]+)\s+r0\s*=\s+new\s+com\.[A-Za-z0-9_$.]+\.[A-Za-z0-9_]+",
                wrapper_text,
                flags=re.IGNORECASE,
            )
            for cls in candidates:
                cls_file = next(iter(base.rglob(f"{cls}.java")), None)
                if cls_file is None:
                    continue
                cls_text = _read_text(cls_file)
                if re.search(r"extends\s+.*MainAPI", cls_text):
                    impl_java = cls_file
                    break
        except Exception:
            pass

    return provider_java, impl_java


def _extract_hostnames(text: str) -> List[str]:
    hosts = set()
    for m in re.finditer(r"https?://([a-zA-Z0-9.-]+)", text):
        host = m.group(1).lower().strip(".")
        if host and "." in host:
            hosts.add(host)
    return sorted(hosts)


def _resolve_hosts(hosts: List[str]) -> Tuple[int, int]:
    ok, fail = 0, 0
    for host in hosts:
        try:
            socket.getaddrinfo(host, None)
            ok += 1
        except Exception:
            fail += 1
    return ok, fail


def _count_signals(text: str, keys: List[str]) -> int:
    count = 0
    for p in keys:
        count += len(re.findall(p, text, flags=re.IGNORECASE))
    return count


def validate_provider(provider: str) -> ProviderResult:
    notes: List[str] = []
    provider_java, impl_java = _find_provider_source(provider)

    source_present = impl_java is not None
    plugin_wrapper_present = provider_java is not None

    impl_text = _read_text(impl_java) if impl_java else ""

    mainapi_extends = bool(re.search(r"extends\s+.*MainAPI", impl_text))

    method_flags: Dict[str, bool] = {}
    for key, patterns in MAINAPI_METHODS.items():
        method_flags[key] = any(re.search(p, impl_text, flags=re.IGNORECASE) for p in patterns)

    chimera_files = [
        CHIMERA / f"{provider}_patterns.txt",
        CHIMERA / f"{provider}_selectors.txt",
        CHIMERA / f"{provider}_strings.txt",
        CHIMERA / f"{provider}_jsm.txt",
    ]
    chimera_text = "\n".join(_read_text(p) for p in chimera_files if p.exists())

    combined = impl_text + "\n" + chimera_text

    timeout_signals = _count_signals(combined, SIGNAL_PATTERNS["timeout"])
    cache_signals = _count_signals(combined, SIGNAL_PATTERNS["cache"])
    decrypt_signals = _count_signals(combined, SIGNAL_PATTERNS["decrypt"])
    selector_signals = _count_signals(combined, SIGNAL_PATTERNS["selector"])
    pattern_signals = _count_signals(combined, SIGNAL_PATTERNS["pattern"])

    # Hostname readiness from pattern/string/jsm files
    hostnames = _extract_hostnames(chimera_text)
    host_ok, host_fail = _resolve_hosts(hostnames)

    score = 0.0
    score += 10 if source_present else 0
    score += 5 if plugin_wrapper_present else 0
    score += 10 if mainapi_extends else 0
    score += 15 if method_flags["has_search"] else 0
    score += 15 if method_flags["has_load"] else 0
    score += 20 if method_flags["has_loadlinks"] else 0
    score += 5 if method_flags["has_mainpage_support"] else 0
    score += min(timeout_signals, 10) * 0.7
    score += min(cache_signals, 10) * 0.5
    score += min(decrypt_signals, 10) * 0.7
    score += min(selector_signals, 10) * 0.4
    score += min(pattern_signals, 10) * 0.4
    if hostnames:
        score += max(0, 5 * (host_ok / max(1, len(hostnames))))

    score = min(100.0, round(score, 2))

    if score >= 90:
        verdict = "PASS_STRONG"
    elif score >= 75:
        verdict = "PASS_PARTIAL"
    elif score >= 60:
        verdict = "NEEDS_WORK"
    else:
        verdict = "FAIL"

    if not source_present:
        notes.append("missing main implementation source")
    if not plugin_wrapper_present:
        notes.append("missing plugin wrapper")
    if not method_flags["has_loadlinks"]:
        notes.append("loadLinks signature not detected")
    if host_fail > 0:
        notes.append(f"{host_fail} hostnames failed DNS resolution")

    return ProviderResult(
        name=provider,
        source_present=source_present,
        plugin_wrapper_present=plugin_wrapper_present,
        mainapi_extends=mainapi_extends,
        has_search=method_flags["has_search"],
        has_load=method_flags["has_load"],
        has_loadlinks=method_flags["has_loadlinks"],
        has_mainpage_support=method_flags["has_mainpage_support"],
        timeout_signals=timeout_signals,
        cache_signals=cache_signals,
        decrypt_signals=decrypt_signals,
        selector_signals=selector_signals,
        pattern_signals=pattern_signals,
        hostname_count=len(hostnames),
        host_resolve_ok=host_ok,
        host_resolve_fail=host_fail,
        score=score,
        verdict=verdict,
        notes=notes,
    )


def main() -> int:
    OUT_DIR.mkdir(parents=True, exist_ok=True)

    providers = sorted(
        p.name for p in TELEMETRY.iterdir() if p.is_dir() and (CHIMERA / f"{p.name}_jsm.txt").exists()
    )

    results = [validate_provider(p) for p in providers]

    overall = {
        "total_providers": len(results),
        "pass_strong": sum(1 for r in results if r.verdict == "PASS_STRONG"),
        "pass_partial": sum(1 for r in results if r.verdict == "PASS_PARTIAL"),
        "needs_work": sum(1 for r in results if r.verdict == "NEEDS_WORK"),
        "fail": sum(1 for r in results if r.verdict == "FAIL"),
        "avg_score": round(sum(r.score for r in results) / max(1, len(results)), 2),
    }

    payload = {
        "overall": overall,
        "results": [asdict(r) for r in results],
    }

    (OUT_DIR / "provider_e2e_validation.json").write_text(
        json.dumps(payload, indent=2), encoding="utf-8"
    )

    lines = [
        "Provider E2E Validation Summary",
        "=" * 32,
        f"Total providers: {overall['total_providers']}",
        f"PASS_STRONG: {overall['pass_strong']}",
        f"PASS_PARTIAL: {overall['pass_partial']}",
        f"NEEDS_WORK: {overall['needs_work']}",
        f"FAIL: {overall['fail']}",
        f"Average score: {overall['avg_score']}%",
        "",
        "Top 5 providers by score:",
    ]

    for r in sorted(results, key=lambda x: x.score, reverse=True)[:5]:
        lines.append(f"- {r.name}: {r.score}% ({r.verdict})")

    lines.append("")
    lines.append("Bottom 5 providers by score:")
    for r in sorted(results, key=lambda x: x.score)[:5]:
        lines.append(f"- {r.name}: {r.score}% ({r.verdict})")

    (OUT_DIR / "provider_e2e_validation_summary.txt").write_text(
        "\n".join(lines), encoding="utf-8"
    )

    print("\n".join(lines))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
