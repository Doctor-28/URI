# -*- coding: utf-8 -*-
import math
try:
    while True:
        n = int(input())
        h,c,l = [int(n) for n in input().split()]
        a = (h**2)+(c**2)
        a = math.sqrt(a)
        a*=l*n/10000
        print(format(a,'.4f'))
except EOFError:
    pass