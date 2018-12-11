# -*- coding: utf-8 -*-
for i in range(int(input())):
    r, s = [str(n) for n in input().split()]
    t = []
    for i in range(len(r)+len(s)):
        if i==len(r) or i==len(s) :
            break
        t.append(r[i])
        t.append(s[i])
    if i<len(s):
        t.append(s[-(len(s)-i):])
    if i<len(r):
        t.append(r[-(len(r)-i):])
    print("".join(t))