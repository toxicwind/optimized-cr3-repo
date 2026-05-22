#!/usr/bin/env bash
set -euo pipefail

ROOT="/home/toxic/cr3_forge/optimized-cr3-repo"
DOCS="$ROOT/docs"
PORT="${1:-8787}"

cd "$DOCS"
echo "Dashboard live at: http://127.0.0.1:${PORT}/dashboard/index.html"
python3 -m http.server "$PORT"