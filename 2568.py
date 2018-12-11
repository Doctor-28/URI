# -*- coding: utf-8 -*-
lista = input().split(" ")
dia = int(lista[0])
preco = int(lista[1])
var = int(lista[2])
until = dia + int(lista[3])
for i in range(dia+1, until+1):
    if i % 2 == 0:
        preco += var
    else:
        preco -= var
print(preco)