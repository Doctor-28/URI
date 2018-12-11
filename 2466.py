# -*- coding: utf-8 -*-
n = int(input())
lista = [int(l) for l in input().split()]
while len(lista) >1:
    aux =[]
    for i in range(len(lista)-1):
        if lista[i]==lista[i+1]:
            aux.append(1)
        else:
            aux.append(-1)
    lista = aux
if lista[0]>0:
    print('preta')
else:
    print('branca')