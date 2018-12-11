# -*- coding: utf-8 -*-
while True:
    l, r = [int(n) for n in input().split()]
    if l==r==0:
        break
    print(l+r)