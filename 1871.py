# -*- coding: utf-8 -*-
while True:
    n,r = [int(n) for n in input().split()]
    if n==r==0:
        break
    print(str(n+r).replace("0",""))