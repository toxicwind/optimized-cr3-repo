#!/bin/bash
set -e

case "$1" in
  patch)
    python3 reaver_patcher.py
    ;;
  validate)
    python3 scripts/reaver_validate.py
    ;;
  browserless)
    cd browserless && docker compose up --build
    ;;
  *)
    echo "Usage: ./reaver.sh [patch|validate|browserless]"
    ;;
esac
