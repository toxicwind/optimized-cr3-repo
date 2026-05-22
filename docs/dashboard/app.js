const DATA_URL = "../verification/provider_e2e_validation.json";

const els = {
  status: document.getElementById("status"),
  summaryCards: document.getElementById("summaryCards"),
  bars: document.getElementById("bars"),
  table: document.getElementById("resultsTable"),
  verdictFilter: document.getElementById("verdictFilter"),
  minScore: document.getElementById("minScore"),
  reloadBtn: document.getElementById("reloadBtn"),
};

let state = { overall: null, results: [] };

function verdictClass(v) {
  if (v === "PASS_STRONG") return "v-pass-strong";
  if (v === "PASS_PARTIAL") return "v-pass-partial";
  if (v === "NEEDS_WORK") return "v-needs-work";
  return "v-fail";
}

function renderCards(overall) {
  const cards = [
    ["Total", overall.total_providers],
    ["Avg Score", `${overall.avg_score}%`],
    ["PASS_STRONG", overall.pass_strong],
    ["PASS_PARTIAL", overall.pass_partial],
    ["NEEDS_WORK", overall.needs_work],
    ["FAIL", overall.fail],
  ];

  els.summaryCards.innerHTML = cards
    .map(([label, value]) => `
      <div class="card">
        <div class="label">${label}</div>
        <div class="value">${value}</div>
      </div>
    `)
    .join("");
}

function getFilteredResults() {
  const vf = els.verdictFilter.value;
  const minScore = Number(els.minScore.value || 0);

  return state.results
    .filter(r => (vf === "ALL" ? true : r.verdict === vf))
    .filter(r => Number(r.score) >= minScore)
    .sort((a, b) => Number(b.score) - Number(a.score));
}

function renderBars(results) {
  els.bars.innerHTML = results
    .map(r => {
      const score = Number(r.score);
      return `
      <div class="bar-row">
        <div class="bar-label">${r.name}</div>
        <div class="bar-track"><div class="bar-fill" style="width:${Math.min(100, score)}%"></div></div>
        <div class="score">${score.toFixed(2)}%</div>
        <div class="verdict ${verdictClass(r.verdict)}">${r.verdict}</div>
      </div>`;
    })
    .join("");
}

function renderTable(results) {
  els.table.innerHTML = results
    .map(r => {
      const methods = [
        r.has_search ? "search" : null,
        r.has_load ? "load" : null,
        r.has_loadlinks ? "loadLinks" : null,
        r.has_mainpage_support ? "mainPage" : null,
      ]
        .filter(Boolean)
        .join(", ");

      const signals = `t:${r.timeout_signals}, c:${r.cache_signals}, d:${r.decrypt_signals}, s:${r.selector_signals}, p:${r.pattern_signals}`;
      const dns = `${r.host_resolve_ok}/${r.hostname_count} ok`;

      return `
      <tr>
        <td>${r.name}</td>
        <td>${Number(r.score).toFixed(2)}%</td>
        <td><span class="${verdictClass(r.verdict)}">${r.verdict}</span></td>
        <td>${methods || "—"}</td>
        <td>${signals}</td>
        <td>${dns}</td>
      </tr>`;
    })
    .join("");
}

function rerender() {
  const results = getFilteredResults();
  renderBars(results);
  renderTable(results);
  els.status.textContent = `Loaded ${results.length}/${state.results.length} providers`;
}

async function loadData() {
  els.status.textContent = "Loading…";
  try {
    const res = await fetch(DATA_URL, { cache: "no-store" });
    if (!res.ok) throw new Error(`HTTP ${res.status}`);
    const json = await res.json();
    state = {
      overall: json.overall,
      results: json.results || [],
    };
    renderCards(state.overall);
    rerender();
  } catch (err) {
    els.status.textContent = `Failed to load data: ${err.message}`;
  }
}

els.verdictFilter.addEventListener("change", rerender);
els.minScore.addEventListener("input", rerender);
els.reloadBtn.addEventListener("click", loadData);

loadData();