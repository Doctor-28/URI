# -*- coding: utf-8 -*-
s = input()
n = input().split()
d = {}
for i in n:
    if i not in d.keys():
        d[i] = 0
    d[i] +=1
lista = [int(n) for n in d.keys() if d[n]==max(d.values()) ]
print(max(lista))