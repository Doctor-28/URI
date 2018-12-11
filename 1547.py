# -*- coding: utf-8 -*-
for i in range(int(input())):
    qt, n = [int(n) for n in input().split()]
    lista = [int(j) for j in input().split()]
    aux = -100
    for i in range(len(lista)):
        if lista[i] == n:
            aux = lista[i]
            break
        if abs(n-aux) > abs(n-lista[i]):
            aux = lista[i]
    print(lista.index(aux)+1)