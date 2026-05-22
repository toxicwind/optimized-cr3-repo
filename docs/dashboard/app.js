const DATA_URL = "../verification/provider_e2e_validation.json";

const els = {
  status: document.getElementById("status"),
  summaryCards: document.getElementById("summaryCards"),
  verdictFilter: document.getElementById("verdictFilter"),
  minScore: document.getElementById("minScore"),
  scoreDisplay: document.getElementById("scoreDisplay"),
  searchFilter: document.getElementById("searchFilter"),
  reloadBtn: document.getElementById("reloadBtn"),
  resultsTable: document.getElementById("resultsTable"),
  detailModal: document.getElementById("detailModal"),
  modalTitle: document.getElementById("modalTitle"),
  modalBody: document.getElementById("modalBody"),
  modalClose: document.getElementById("modalClose"),
  insightBadges: document.getElementById("insightBadges"),
  insightNotes: document.getElementById("insightNotes"),
};

let state = { overall: null, rawResults: [], normalized: [] };
const charts = {};

const VERDICT_ORDER = ["PASS_STRONG", "PASS_PARTIAL", "NEEDS_WORK", "FAIL"];

function safePct(part, total) {
  if (!total || Number.isNaN(total)) return 0;
  return (part / total) * 100;
}

function percentile(values, p) {
  if (!values.length) return 0;
  const sorted = [...values].sort((a, b) => a - b);
  const idx = Math.max(0, Math.min(sorted.length - 1, Math.floor((p / 100) * (sorted.length - 1))));
  return sorted[idx];
}

function verdictClass(v) {
  if (v === "PASS_STRONG") return "bg-green-100 text-green-700 dark:bg-[rgba(22,163,74,0.2)] dark:text-green-300";
  if (v === "PASS_PARTIAL") return "bg-blue-100 text-blue-700 dark:bg-[rgba(37,99,235,0.2)] dark:text-blue-300";
  if (v === "NEEDS_WORK") return "bg-yellow-100 text-yellow-700 dark:bg-[rgba(202,138,4,0.2)] dark:text-yellow-300";
  return "bg-red-100 text-red-700 dark:bg-[rgba(220,38,38,0.2)] dark:text-red-300";
}

function badge(text, cls = "") {
  return `<span class="px-2 py-1 rounded-md text-xs font-medium ${cls}">${text}</span>`;
}

function deriveProviderModel(results) {
  const complexityBase = results.map((r) => Number(r.selector_signals || 0) + Number(r.pattern_signals || 0));
  const p33 = percentile(complexityBase, 33);
  const p66 = percentile(complexityBase, 66);

  return results.map((r) => {
    const methods = [r.has_search, r.has_load, r.has_loadlinks, r.has_mainpage_support];
    const methodCount = methods.filter(Boolean).length;
    const methodCoverage = safePct(methodCount, 4);

    const hostTotal = Number(r.hostname_count || 0);
    const hostOk = Number(r.host_resolve_ok || 0);
    const hostResolvePct = hostTotal === 0 ? 100 : safePct(hostOk, hostTotal);

    const selectorSignals = Number(r.selector_signals || 0);
    const patternSignals = Number(r.pattern_signals || 0);
    const cacheSignals = Number(r.cache_signals || 0);
    const decryptSignals = Number(r.decrypt_signals || 0);
    const timeoutSignals = Number(r.timeout_signals || 0);
    const score = Number(r.score || 0);

    const parsingWeight = selectorSignals + patternSignals;
    const complexityTier = parsingWeight <= p33 ? "Light" : parsingWeight <= p66 ? "Medium" : "Heavy";

    let capabilityTier = "Core";
    if (methodCoverage === 100 && score >= 97) capabilityTier = "Elite";
    else if (methodCoverage === 100 && score >= 94) capabilityTier = "Advanced";

    const securityProfile = decryptSignals > 10 ? "High Crypto" : decryptSignals > 0 ? "Crypto-Aware" : "No Crypto Signal";
    const cacheProfile = cacheSignals > 5 ? "Aggressive Cache" : cacheSignals > 0 ? "Cache-Aware" : "No Cache Signal";

    const reliabilityTier = hostResolvePct >= 100 ? "Stable" : hostResolvePct >= 80 ? "Mostly Stable" : "Unstable";

    return {
      ...r,
      score,
      methodCount,
      methodCoverage,
      hostResolvePct,
      selectorSignals,
      patternSignals,
      cacheSignals,
      decryptSignals,
      timeoutSignals,
      parsingWeight,
      complexityTier,
      capabilityTier,
      securityProfile,
      cacheProfile,
      reliabilityTier,
    };
  });
}

function getFiltered() {
  const vf = els.verdictFilter.value;
  const minScore = Number(els.minScore.value || 0);
  const q = (els.searchFilter.value || "").trim().toLowerCase();

  return state.normalized
    .filter((r) => (vf === "ALL" ? true : r.verdict === vf))
    .filter((r) => r.score >= minScore)
    .filter((r) => {
      if (!q) return true;
      return (
        r.name.toLowerCase().includes(q) ||
        r.capabilityTier.toLowerCase().includes(q) ||
        r.complexityTier.toLowerCase().includes(q) ||
        r.securityProfile.toLowerCase().includes(q)
      );
    })
    .sort((a, b) => b.score - a.score);
}

function renderSummary(filtered) {
  const total = filtered.length;
  const avg = total ? filtered.reduce((s, r) => s + r.score, 0) / total : 0;
  const avgCoverage = total ? filtered.reduce((s, r) => s + r.methodCoverage, 0) / total : 0;
  const avgResolve = total ? filtered.reduce((s, r) => s + r.hostResolvePct, 0) / total : 0;

  const countByVerdict = Object.fromEntries(VERDICT_ORDER.map((v) => [v, 0]));
  filtered.forEach((r) => {
    countByVerdict[r.verdict] = (countByVerdict[r.verdict] || 0) + 1;
  });

  const cards = [
    ["Providers", total, "ph-database", "text-blue-600"],
    ["Avg Score", `${avg.toFixed(2)}%`, "ph-chart-line-up", "text-green-600"],
    ["Method Coverage", `${avgCoverage.toFixed(1)}%`, "ph-puzzle-piece", "text-purple-600"],
    ["Host Resolve", `${avgResolve.toFixed(1)}%`, "ph-globe", "text-cyan-600"],
    ["PASS_STRONG", countByVerdict.PASS_STRONG, "ph-check-circle", "text-emerald-600"],
    ["Non-Strong", total - countByVerdict.PASS_STRONG, "ph-warning-circle", "text-amber-600"],
  ];

  els.summaryCards.innerHTML = cards
    .map(
      ([label, value, icon, color]) => `
        <div class="stat-card bg-white p-4 rounded-xl border border-gray-200 card-hover dark:bg-[#1e1e1e] dark:border-[#2a2a2a]">
          <div class="flex items-center">
            <div class="p-3 bg-gray-100 rounded-lg dark:bg-[#2a2a2a]"><i class="ph ${icon} text-xl ${color}"></i></div>
            <div class="ml-3">
              <p class="text-xs text-gray-500 dark:text-gray-400">${label}</p>
              <p class="text-xl font-bold text-gray-900 dark:text-gray-100">${value}</p>
            </div>
          </div>
        </div>
      `
    )
    .join("");
}

function renderInsights(filtered) {
  const totals = {
    elite: filtered.filter((r) => r.capabilityTier === "Elite").length,
    advanced: filtered.filter((r) => r.capabilityTier === "Advanced").length,
    core: filtered.filter((r) => r.capabilityTier === "Core").length,
    heavy: filtered.filter((r) => r.complexityTier === "Heavy").length,
    cryptoHigh: filtered.filter((r) => r.securityProfile === "High Crypto").length,
    cacheAware: filtered.filter((r) => r.cacheSignals > 0).length,
  };

  const topScore = filtered[0];
  const topComplex = [...filtered].sort((a, b) => b.parsingWeight - a.parsingWeight)[0];
  const topDecrypt = [...filtered].sort((a, b) => b.decryptSignals - a.decryptSignals)[0];

  els.insightBadges.innerHTML = [
    badge(`Elite: ${totals.elite}`, "bg-emerald-100 text-emerald-700 dark:bg-[rgba(16,185,129,0.2)] dark:text-emerald-300"),
    badge(`Advanced: ${totals.advanced}`, "bg-blue-100 text-blue-700 dark:bg-[rgba(59,130,246,0.2)] dark:text-blue-300"),
    badge(`Core: ${totals.core}`, "bg-gray-100 text-gray-700 dark:bg-[rgba(82,82,82,0.35)] dark:text-gray-300"),
    badge(`Heavy Parsing: ${totals.heavy}`, "bg-purple-100 text-purple-700 dark:bg-[rgba(147,51,234,0.2)] dark:text-purple-300"),
    badge(`High Crypto: ${totals.cryptoHigh}`, "bg-amber-100 text-amber-700 dark:bg-[rgba(245,158,11,0.2)] dark:text-amber-300"),
    badge(`Cache-Aware: ${totals.cacheAware}`, "bg-cyan-100 text-cyan-700 dark:bg-[rgba(6,182,212,0.2)] dark:text-cyan-300"),
  ].join(" ");

  const notes = [
    [
      "Top Score",
      topScore ? `${topScore.name} • ${topScore.score.toFixed(2)}%` : "N/A",
      "Best overall quality score across the active filter scope.",
    ],
    [
      "Highest Parsing Intensity",
      topComplex ? `${topComplex.name} • ${topComplex.parsingWeight} signals` : "N/A",
      "Combined selector + pattern signal density.",
    ],
    [
      "Highest Crypto Footprint",
      topDecrypt ? `${topDecrypt.name} • ${topDecrypt.decryptSignals} decrypt signals` : "N/A",
      "Strongest decryption/crypto indicator volume.",
    ],
  ];

  els.insightNotes.innerHTML = notes
    .map(
      ([title, value, desc]) => `
      <div class="rounded-lg border border-gray-200 dark:border-[#2a2a2a] p-3 bg-gray-50 dark:bg-[#222]">
        <p class="text-xs text-gray-500 dark:text-gray-400">${title}</p>
        <p class="text-sm font-semibold text-gray-900 dark:text-gray-100 mt-1">${value}</p>
        <p class="text-xs text-gray-500 dark:text-gray-400 mt-1">${desc}</p>
      </div>
    `
    )
    .join("");
}

function renderTable(filtered) {
  const methodBadge = (ok, name) =>
    `<span class="px-1.5 py-0.5 text-[10px] rounded ${ok ? "bg-green-100 text-green-700" : "bg-gray-100 text-gray-500"}">${name}</span>`;

  els.resultsTable.innerHTML = filtered
    .map((r) => {
      const methods = [
        methodBadge(r.has_search, "S"),
        methodBadge(r.has_load, "L"),
        methodBadge(r.has_loadlinks, "LL"),
        methodBadge(r.has_mainpage_support, "MP"),
      ].join(" ");

      return `
        <tr class="border-b border-gray-100 dark:border-[#2a2a2a] hover:bg-gray-50 dark:hover:bg-[#232323]">
          <td class="py-2 pr-4 font-medium text-gray-900 dark:text-gray-100">${r.name}</td>
          <td class="py-2 pr-4 text-gray-700 dark:text-gray-200">${r.score.toFixed(2)}%</td>
          <td class="py-2 pr-4">${badge(r.verdict, verdictClass(r.verdict))}</td>
          <td class="py-2 pr-4">${r.selectorSignals}</td>
          <td class="py-2 pr-4">${r.patternSignals}</td>
          <td class="py-2 pr-4">${r.cacheSignals}</td>
          <td class="py-2 pr-4">${r.decryptSignals}</td>
          <td class="py-2 pr-4"><div class="flex gap-1 flex-wrap">${methods}</div></td>
          <td class="py-2 pr-4"><button class="text-primary-600 hover:text-primary-700 text-xs font-medium" onclick="showDetail('${r.name.replace(/'/g, "\\'")}')">Inspect</button></td>
        </tr>
      `;
    })
    .join("");
}

function upsertChart(key, ctx, config) {
  if (charts[key]) charts[key].destroy();
  charts[key] = new Chart(ctx, config);
}

function renderCharts(filtered) {
  const labels = filtered.map((r) => r.name);
  const isDark = document.documentElement.classList.contains("dark");
  const tickColor = isDark ? "#c8c8c8" : "#4b5563";
  const gridColor = isDark ? "rgba(255,255,255,0.08)" : "rgba(0,0,0,0.06)";

  upsertChart("score", document.getElementById("scoreChart"), {
    type: "bar",
    data: {
      labels,
      datasets: [{
        label: "Score %",
        data: filtered.map((r) => r.score),
        backgroundColor: filtered.map((r) => (r.score >= 97 ? "rgba(16,185,129,0.75)" : r.score >= 94 ? "rgba(59,130,246,0.75)" : "rgba(245,158,11,0.75)")),
        borderRadius: 6,
      }],
    },
    options: {
      responsive: true,
      plugins: { legend: { display: false } },
      scales: {
        x: { ticks: { color: tickColor }, grid: { color: gridColor } },
        y: { min: 0, max: 100, ticks: { color: tickColor }, grid: { color: gridColor } },
      },
    },
  });

  const coverage = ["has_search", "has_load", "has_loadlinks", "has_mainpage_support"].map((k) =>
    filtered.filter((r) => r[k]).length
  );

  upsertChart("coverage", document.getElementById("coverageChart"), {
    type: "doughnut",
    data: {
      labels: ["Search", "Load", "LoadLinks", "MainPage"],
      datasets: [{
        data: coverage,
        backgroundColor: ["#22c55e", "#3b82f6", "#f59e0b", "#a855f7"],
      }],
    },
    options: {
      responsive: true,
      plugins: {
        legend: { labels: { color: tickColor } },
      },
    },
  });

  upsertChart("complexity", document.getElementById("complexityChart"), {
    type: "bubble",
    data: {
      datasets: [{
        label: "Providers",
        data: filtered.map((r) => ({
          x: r.selectorSignals,
          y: r.patternSignals,
          r: Math.max(5, Math.min(18, 5 + r.decryptSignals / 3)),
          provider: r.name,
        })),
        backgroundColor: "rgba(59,130,246,0.55)",
        borderColor: "rgba(59,130,246,1)",
      }],
    },
    options: {
      responsive: true,
      plugins: {
        legend: { labels: { color: tickColor } },
        tooltip: {
          callbacks: {
            label: (ctx) => {
              const p = ctx.raw;
              return `${p.provider}: selectors=${p.x}, patterns=${p.y}, bubble(decrypt)`;
            },
          },
        },
      },
      scales: {
        x: { ticks: { color: tickColor }, grid: { color: gridColor }, title: { display: true, text: "Selector Signals", color: tickColor } },
        y: { ticks: { color: tickColor }, grid: { color: gridColor }, title: { display: true, text: "Pattern Signals", color: tickColor } },
      },
    },
  });

  upsertChart("signals", document.getElementById("signalChart"), {
    type: "bar",
    data: {
      labels,
      datasets: [
        { label: "Cache", data: filtered.map((r) => r.cacheSignals), backgroundColor: "rgba(6,182,212,0.7)" },
        { label: "Decrypt", data: filtered.map((r) => r.decryptSignals), backgroundColor: "rgba(245,158,11,0.7)" },
      ],
    },
    options: {
      responsive: true,
      plugins: { legend: { labels: { color: tickColor } } },
      scales: {
        x: { ticks: { color: tickColor }, grid: { color: gridColor } },
        y: { ticks: { color: tickColor }, grid: { color: gridColor } },
      },
    },
  });

  const categoryCounts = {};
  filtered.forEach((r) => {
    [`Capability:${r.capabilityTier}`, `Complexity:${r.complexityTier}`, `Network:${r.reliabilityTier}`].forEach((k) => {
      categoryCounts[k] = (categoryCounts[k] || 0) + 1;
    });
  });

  upsertChart("category", document.getElementById("categoryChart"), {
    type: "bar",
    data: {
      labels: Object.keys(categoryCounts),
      datasets: [{
        label: "Providers",
        data: Object.values(categoryCounts),
        backgroundColor: "rgba(139,92,246,0.7)",
        borderRadius: 6,
      }],
    },
    options: {
      responsive: true,
      plugins: { legend: { display: false } },
      scales: {
        x: { ticks: { color: tickColor, maxRotation: 20 }, grid: { color: gridColor } },
        y: { ticks: { color: tickColor }, grid: { color: gridColor } },
      },
    },
  });
}

function showDetail(name) {
  const r = state.normalized.find((x) => x.name === name);
  if (!r) return;

  const sections = [
    ["Quality", [["Score", `${r.score.toFixed(2)}%`], ["Verdict", r.verdict], ["Capability Tier", r.capabilityTier]]],
    ["Method Coverage", [["Methods", `${r.methodCount}/4`], ["Coverage", `${r.methodCoverage.toFixed(1)}%`], ["MainAPI Extends", r.mainapi_extends ? "Yes" : "No"]]],
    ["Parsing", [["Selectors", r.selectorSignals], ["Patterns", r.patternSignals], ["Complexity Tier", r.complexityTier]]],
    ["Runtime Signals", [["Cache", r.cacheSignals], ["Decrypt", r.decryptSignals], ["Timeout", r.timeoutSignals], ["Cache Profile", r.cacheProfile], ["Security", r.securityProfile]]],
    ["Network", [["Hostnames", r.hostname_count], ["Resolved", `${r.host_resolve_ok}/${r.hostname_count}`], ["Resolve %", `${r.hostResolvePct.toFixed(1)}%`], ["Reliability", r.reliabilityTier]]],
  ];

  els.modalTitle.textContent = `${r.name} — Deep Detail`;
  els.modalBody.innerHTML = sections
    .map(
      ([title, rows]) => `
        <div class="mb-4 p-3 rounded-lg border border-gray-200 dark:border-[#2a2a2a] bg-gray-50 dark:bg-[#222]">
          <h4 class="font-semibold text-gray-900 dark:text-gray-100 mb-2">${title}</h4>
          <div class="grid grid-cols-1 md:grid-cols-2 gap-2">
            ${rows
              .map(
                ([k, v]) => `
              <div class="flex justify-between text-sm">
                <span class="text-gray-500 dark:text-gray-400">${k}</span>
                <span class="font-medium text-gray-900 dark:text-gray-100">${v}</span>
              </div>
            `
              )
              .join("")}
          </div>
        </div>
      `
    )
    .join("");

  els.detailModal.classList.remove("hidden");
}

window.showDetail = showDetail;

function closeModal() {
  els.detailModal.classList.add("hidden");
}

function rerender() {
  const filtered = getFiltered();
  renderSummary(filtered);
  renderInsights(filtered);
  renderTable(filtered);
  renderCharts(filtered);
  els.status.textContent = `Showing ${filtered.length}/${state.normalized.length} providers`;
}

async function loadData() {
  els.status.textContent = "Loading…";
  try {
    const res = await fetch(DATA_URL, { cache: "no-store" });
    if (!res.ok) throw new Error(`HTTP ${res.status}`);
    const json = await res.json();

    state.overall = json.overall || null;
    state.rawResults = json.results || [];
    state.normalized = deriveProviderModel(state.rawResults);

    rerender();
  } catch (err) {
    els.status.textContent = `Failed to load data: ${err.message}`;
  }
}

els.verdictFilter.addEventListener("change", rerender);
els.minScore.addEventListener("input", () => {
  els.scoreDisplay.textContent = `${els.minScore.value}%`;
  rerender();
});
els.searchFilter.addEventListener("input", rerender);
els.reloadBtn.addEventListener("click", loadData);
els.modalClose.addEventListener("click", closeModal);
els.detailModal.addEventListener("click", (e) => {
  if (e.target === els.detailModal) closeModal();
});

window.addEventListener("themeChanged", rerender);

loadData();
