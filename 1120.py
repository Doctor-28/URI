# -*- coding: utf-8 -*-
while True:
    r, n = [str(n) for n in input().split()]
    if r==n=="0":
        break
    n= n.replace(r,"")
    if len(n)==0:
        n="0"
    print(int(n))