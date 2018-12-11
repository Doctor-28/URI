# -*- coding: utf-8 -*-
d = {}
for i in range(int(input())):
    n = int(input())
    if n not in d.keys():
        d[n] = 0
    d[n]+=1

for i in sorted(d.keys()):
    print("%d aparece %d vez(es)" % (i, d[i]))