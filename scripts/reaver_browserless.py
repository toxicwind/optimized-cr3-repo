#!/usr/bin/env python3
"""
CloudStream Reaver + Browserless Integration
Use real browserless for heavy validation and scraping of patched providers.
"""

import requests
import json
from pathlib import Path

BROWSERLESS_URL = "http://localhost:3000"
TOKEN = "reaver"

def content(url: str):
    """Fetch page content via real browserless"""
    endpoint = f"{BROWSERLESS_URL}/chrome/content?token={TOKEN}"
    payload = {"url": url, "gotoOptions": {"waitUntil": "networkidle2"}}
    r = requests.post(endpoint, json=payload, timeout=60)
    return r.text

def scrape(url: str):
    """Scrape with browserless"""
    endpoint = f"{BROWSERLESS_URL}/chrome/scrape?token={TOKEN}"
    payload = {"url": url}
    r = requests.post(endpoint, json=payload, timeout=60)
    return r.json()

if __name__ == "__main__":
    print("Browserless integration ready.")
    print("Example: content('https://example.com')")
