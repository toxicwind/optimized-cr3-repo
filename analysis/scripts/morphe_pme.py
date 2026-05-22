import re, sys
with open(sys.argv[1], 'r', errors='ignore') as f: content = f.read()
pats = [r'select\([^)]+\)', r'Regex|Pattern\([^)]+\)', r'(?:div\.|\.video|article)[^\s\'"]+', r'(?:player|embed|source)[^\s\'"]*', r'https?://[^\s\'"]+?\.(?:mp4|m3u8)[^\s\'"]*', r'(?:loadLinks|getUrl)[^\s\'"]*']
res = set()
for p in pats:
    for m in re.finditer(p, content): res.add(m.group(0)[:180])
with open(sys.argv[2], 'w') as f:
    for r in sorted(res): f.write(r + '\n')
