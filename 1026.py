# -*- coding: utf-8 -*-
try:
    while True:
        n,m = [int(i) for i in input().split()]
        n = int(bin(n)[2:].zfill(32))
        m = int(bin(m)[2:].zfill(32))
        s = str(m+n).replace('2','0')
        print(int(s,2))
except EOFError:
    pass