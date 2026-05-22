# Agent Instructions

## Commit Before Completing

Always commit and push all changes before calling task_complete. Never hand back with dirty working tree unless the user says otherwise.

```bash
git add <specific files> && git commit -m "describe what changed" && git push origin main
```

If "nothing to commit" — the file is probably gitignored. Check `.gitignore` before assuming success.

## Repo Layout

| Path | Purpose | Tracked |
|------|---------|---------|
| `src/` | Kotlin provider source | ✅ |
| `builds/*.cs3` | Compiled plugins | ✅ |
| `docs/dashboard/` | Static HTML dashboard | ✅ |
| `docs/verification/provider_e2e_validation.json` | Validation results | ✅ |
| `analysis/scripts/` | Validation + launch scripts | ✅ |
| `.github/workflows/` | CI/CD | ✅ |
| `data/` | Large extracted artifacts | ❌ gitignored |
| `docs/reports/` | Report output | ❌ gitignored |
| `browserless/` | npm deps (generated locally) | ❌ gitignored |
| `upstream/` | Reference repo clone | ❌ gitignored |
| `reaver_patches/` | Generated patch artifacts | ❌ gitignored |

## Common Commands

```bash
# Validate providers
python3 analysis/scripts/provider_e2e_validator.py

# Launch dashboard locally
./analysis/scripts/launch_dashboard.sh 8787
# → http://127.0.0.1:8787/dashboard/index.html
```

## Git Safety Rules

- **Always stage specific paths** — never `git add -A` or `git add .`
  - `browserless/` and `upstream/` contain nested git repos; bulk-adding picks them up as submodules (mode 160000), corrupting the index
  - If this happens: `git rm --cached browserless upstream` then commit the removal
- Do not `git push --force` or `git reset --hard` without explicit user approval
- Never commit anything from `data/`, `browserless/`, `upstream/`, or `reaver_patches/`
- Batch related changes into one commit
