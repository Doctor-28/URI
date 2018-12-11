# -*- coding: utf-8 -*-
while True:
    n = int(input())
    if n == 0:
        break
    lista = [int(n) for n in input().split()]
    p = max(lista)
    lista[lista.index(p)] = -1
    p = max(lista)
    print(lista.index(p)+1)