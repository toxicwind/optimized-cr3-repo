#!/usr/bin/env bash
set -euo pipefail

ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/../.." && pwd)"
DOCS="$ROOT/docs"
PORT="${1:-8787}"

echo "Dashboard live at: http://127.0.0.1:${PORT}/dashboard/"
echo "Hot reload active — watching $DOCS for changes"

npx browser-sync start \
  --server "$DOCS" \
  --port "$PORT" \
  --files "$DOCS/**/*.html" "$DOCS/**/*.js" "$DOCS/**/*.css" "$DOCS/**/*.json" \
  --startPath "/dashboard/" \
  --no-notify \
  --no-open