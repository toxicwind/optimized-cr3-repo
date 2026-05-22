const DATA_URL = "../verification/provider_e2e_validation.json";

const els = {
  status: document.getElementById("status"),
  summaryCards: document.getElementById("summaryCards"),
  providerCards: document.getElementById("providerCards"),
  verdictFilter: document.getElementById("verdictFilter"),
  minScore: document.getElementById("minScore"),
  scoreDisplay: document.getElementById("scoreDisplay"),
  searchFilter: document.getElementById("searchFilter"),
  reloadBtn: document.getElementById("reloadBtn"),
  detailModal: document.getElementById("detailModal"),
  modalTitle: document.getElementById("modalTitle"),
  modalBody: document.getElementById("modalBody"),
  modalClose: document.getElementById("modalClose"),
};

let state = { overall: null, results: [] };

function verdictClass(v) {
  if (v === "PASS_STRONG") return "v-pass-strong";
  if (v === "PASS_PARTIAL") return "v-pass-partial";
  if (v === "NEEDS_WORK") return "v-needs-work";
  return "v-fail";
}

function verdictSymbol(v) {
  if (v === "PASS_STRONG") return "✓";
  if (v === "PASS_PARTIAL") return "~";
  if (v === "NEEDS_WORK") return "!";
  return "✗";
}

function renderCards(overall) {
  const cards = [
    ["Total Providers", overall.total_providers],
    ["Avg Quality", `${overall.avg_score.toFixed(1)}%`],
    ["Fully Functional", overall.pass_strong],
    ["Partial Support", overall.pass_partial],
    ["Needs Work", overall.needs_work],
    ["Non-Functional", overall.fail],
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
  const search = els.searchFilter.value.toLowerCase();

  return state.results
    .filter(r => (vf === "ALL" ? true : r.verdict === vf))
    .filter(r => Number(r.score) >= minScore)
    .filter(r => r.name.toLowerCase().includes(search))
    .sort((a, b) => Number(b.score) - Number(a.score));
}

function renderProviderCards(results) {
  els.providerCards.innerHTML = results
    .map(r => {
      const methods = [
        r.has_search ? "Search" : null,
        r.has_load ? "Load" : null,
        r.has_loadlinks ? "LoadLinks" : null,
        r.has_mainpage_support ? "HomePage" : null,
      ]
        .filter(Boolean);

      const score = Number(r.score);
      
      return `
      <div class="provider-card" onclick="showDetail('${r.name.replace(/'/g, "\\'")}')">n        <div class="provider-header">
          <h3 class="provider-name">${r.name}</h3>
          <div>
            <div class="provider-score">${score.toFixed(1)}%</div>
            <div class="provider-verdict ${verdictClass(r.verdict)}">
              ${verdictSymbol(r.verdict)} ${r.verdict}
            </div>
          </div>
        </div>
        
        <div class="provider-details">
          <div class="detail-item">
            <div>
              <div class="detail-label">Selectors</div>
              <div class="detail-value">${r.selector_signals}</div>
            </div>
          </div>
          <div class="detail-item">
            <div>
              <div class="detail-label">Patterns</div>
              <div class="detail-value">${r.pattern_signals}</div>
            </div>
          </div>
          <div class="detail-item">
            <div>
              <div class="detail-label">Cache Signals</div>
              <div class="detail-value">${r.cache_signals}</div>
            </div>
          </div>
          <div class="detail-item">
            <div>
              <div class="detail-label">DNS Resolves</div>
              <div class="detail-value">${r.host_resolve_ok}/${r.hostname_count}</div>
            </div>
          </div>
        </div>
        
        <div style="margin-top: 0.75rem;">
          <div class="detail-label" style="margin-bottom: 0.5rem;">API Methods:</div>
          <div class="methods-list">
            ${methods.map(m => `<span class="method-badge">${m}</span>`).join("")}
          </div>
        </div>
        
        <button class="expand-btn">View Full Details →</button>
      </div>`;
    })
    .join("");
}

function showDetail(name) {
  const provider = state.results.find(r => r.name === name);
  if (!provider) return;

  const methods = [
    { name: "Search", has: provider.has_search },
    { name: "Load", has: provider.has_load },
    { name: "LoadLinks", has: provider.has_loadlinks },
    { name: "HomePage", has: provider.has_mainpage_support },
  ];

  const score = Number(provider.score);
  
  els.modalTitle.textContent = `${provider.name} - Detailed Analysis`;
  
  els.modalBody.innerHTML = `
    <div class="detail-section">
      <h3>Overall Score</h3>
      <div class="detail-grid">
        <div class="detail-box">
          <div class="detail-box-label">Quality Score</div>
          <div class="detail-box-value">${score.toFixed(2)}%</div>
        </div>
        <div class="detail-box">
          <div class="detail-box-label">Verdict</div>
          <div class="detail-box-value ${verdictClass(provider.verdict)}">${verdictSymbol(provider.verdict)} ${provider.verdict}</div>
        </div>
        <div class="detail-box">
          <div class="detail-box-label">Status</div>
          <div class="detail-box-value">${provider.source_present ? "✓ Ready" : "✗ Missing"}</div>
        </div>
      </div>
    </div>

    <div class="detail-section">
      <h3>Implemented API Methods</h3>
      <div class="detail-grid">
        ${methods.map(m => `
          <div class="detail-box" style="border-left: 3px solid ${m.has ? 'var(--ok)' : 'var(--err)'};">
            <div class="detail-box-label">${m.name}</div>
            <div class="detail-box-value" style="color: ${m.has ? 'var(--ok)' : 'var(--err)'}">
              ${m.has ? "✓ YES" : "✗ NO"}
            </div>
          </div>
        `).join("")}
      </div>
    </div>

    <div class="detail-section">
      <h3>Website Infrastructure Analysis</h3>
      <div class="detail-grid">
        <div class="detail-box">
          <div class="detail-box-label">CSS/XPath Selectors Found</div>
          <div class="detail-box-value">${provider.selector_signals}</div>
        </div>
        <div class="detail-box">
          <div class="detail-box-label">URL Patterns Detected</div>
          <div class="detail-box-value">${provider.pattern_signals}</div>
        </div>
        <div class="detail-box">
          <div class="detail-box-label">Cache Directives</div>
          <div class="detail-box-value">${provider.cache_signals}</div>
        </div>
        <div class="detail-box">
          <div class="detail-box-label">Encryption/Crypto Signals</div>
          <div class="detail-box-value">${provider.decrypt_signals}</div>
        </div>
      </div>
    </div>

    <div class="detail-section">
      <h3>Network Resolution</h3>
      <div class="detail-grid">
        <div class="detail-box">
          <div class="detail-box-label">Hostnames to Resolve</div>
          <div class="detail-box-value">${provider.hostname_count}</div>
        </div>
        <div class="detail-box">
          <div class="detail-box-label">Successfully Resolved</div>
          <div class="detail-box-value" style="color: ${provider.host_resolve_ok === provider.hostname_count ? 'var(--ok)' : 'var(--warn)'}">
            ${provider.host_resolve_ok}/${provider.hostname_count}
          </div>
        </div>
        <div class="detail-box">
          <div class="detail-box-label">Resolution Failures</div>
          <div class="detail-box-value" style="color: ${provider.host_resolve_fail === 0 ? 'var(--ok)' : 'var(--warn)'}">
            ${provider.host_resolve_fail}
          </div>
        </div>
      </div>
    </div>

    ${provider.notes && provider.notes.length > 0 ? `
      <div class="detail-section">
        <h3>Notes</h3>
        <div style="background: rgba(0, 0, 0, 0.3); padding: 1rem; border-radius: 0.375rem; color: var(--dim);">
          ${provider.notes.join("<br>")}
        </div>
      </div>
    ` : ""}
  `;

  els.detailModal.classList.remove("hidden");
}

function closeModal() {
  els.detailModal.classList.add("hidden");
}

function rerender() {
  const results = getFilteredResults();
  renderProviderCards(results);
  els.status.textContent = `Showing ${results.length}/${state.results.length} providers`;
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
els.minScore.addEventListener("input", () => {
  els.scoreDisplay.textContent = els.minScore.value + "%";
  rerender();
});
els.searchFilter.addEventListener("input", rerender);
els.reloadBtn.addEventListener("click", loadData);
els.modalClose.addEventListener("click", closeModal);
els.detailModal.addEventListener("click", (e) => {
  if (e.target === els.detailModal) closeModal();
});

loadData();