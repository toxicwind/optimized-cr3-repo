#!/usr/bin/env bash
set -euo pipefail

ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/../.." && pwd)"
DOCS="$ROOT/docs"
PORT="${1:-8787}"

# Make behavior deterministic: if PORT is occupied, stop early so user doesn't chase auto-bumped ports.
if command -v lsof >/dev/null 2>&1; then
  if lsof -iTCP:"$PORT" -sTCP:LISTEN >/dev/null 2>&1; then
    echo "Port ${PORT} is already in use."
    echo "Either stop the existing process or run: $0 <different-port>"
    exit 1
  fi
fi

echo "Dashboard live at: http://127.0.0.1:${PORT}/dashboard/"
echo "Hot reload: ON (Vite dev server)"
echo "Watching: $DOCS/**/*.html $DOCS/**/*.js $DOCS/**/*.css $DOCS/**/*.json"

cd "$DOCS"
npx vite --host 127.0.0.1 --port "$PORT" --strictPort