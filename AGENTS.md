# Agent Instructions

## Always Commit Changes Before Completing

After making any file changes, stage, commit, and push before calling task_complete:

```bash
git add -A
git commit -m "short description of what changed"
git push origin main
```

Never hand back with uncommitted changes unless the user explicitly says "don't commit" or "don't push".

## Repo Layout

| Path | Purpose | Committed? |
|------|---------|------------|
| `src/` | Kotlin provider source | Yes |
| `builds/*.cs3` | Compiled plugins | Yes |
| `docs/dashboard/` | Static HTML dashboard | Yes |
| `analysis/scripts/` | Validation scripts | Yes |
| `.github/workflows/` | CI/CD | Yes |
| `data/` | Extracted artifacts (large) | No - gitignored |
| `docs/verification/` | Validation JSON output | No - gitignored |
| `docs/reports/` | Report output | No - gitignored |
| `browserless/` | npm deps (generated) | No - gitignored |
| `upstream/` | Reference repo clone | No - gitignored |

## Validation

Run before committing provider changes:

```bash
python3 analysis/scripts/provider_e2e_validator.py
```

Output goes to `docs/verification/provider_e2e_validation.json` (gitignored — not committed).

## Dashboard

```bash
./analysis/scripts/launch_dashboard.sh 8787
# open http://127.0.0.1:8787/dashboard/index.html
```

## Git Rules

- Do not `git push --force` or `git reset --hard` without explicit user approval
- Do not unignore or commit anything from `data/`, `browserless/`, `upstream/`, `reaver_patches/`
- Batch related changes into one commit, not one per file
