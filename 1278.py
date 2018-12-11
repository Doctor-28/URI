# -*- coding: utf-8 -*-
cont = 0
while True:
    n = int(input())
    if n ==0:
        break
    if cont>=1:
        print()
    s = []
    aux = 0
    for i in range(n):
        r = input().split()
        r = " ".join(r)
        if len(r) > aux:
            aux = len(r)
        s.append(r)

    for i in s:
        print(i.rjust(aux))
    cont+=1