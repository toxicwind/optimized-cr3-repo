# Agent Instructions

## Always Commit Changes Before Completing

After making any file changes, run the full end-to-end sync one-liner before calling task_complete:

```bash
cd /home/toxic/cr3_forge/optimized-cr3-repo && git add -A && git commit -m "describe what changed" && git push origin main
```

Never hand back with uncommitted changes unless the user explicitly says "don't commit" or "don't push".

If the commit step says "nothing to commit", that means the changed files are gitignored — check `.gitignore` before assuming the push succeeded.

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

## Handling Untracked / Modified Files Before Committing

After editing, run `git status` to classify what you see:

**Untracked files you DID create (new files that should be tracked):**
```bash
git add path/to/file && git commit -m "..." && git push origin main
```

**Untracked files you did NOT create (e.g. browserless/, upstream/):**
- These are gitignored local directories — do NOT add them
- If git says "adding embedded git repository", stop and run `git rm --cached <path>` immediately
- Then commit the removal before pushing

**Modified files not staged:**
```bash
git add path/to/changed/file && git commit -m "..." && git push origin main
```
Never use `git add -A` — it will accidentally pick up `browserless/` and `upstream/cloudstream_repo` as embedded repos (160000 mode), which breaks the index.

**"Nothing to commit" after editing a file:**
- The file is likely gitignored — check `.gitignore`
- If it should be tracked, remove the relevant ignore rule, then `git add` it explicitly

## Git Rules

- Do not `git push --force` or `git reset --hard` without explicit user approval
- NEVER use `git add -A` — always stage specific paths
- Do not unignore or commit anything from `data/`, `browserless/`, `upstream/`, `reaver_patches/`
- Batch related changes into one commit, not one per file
