# -*- coding: utf-8 -*-
for i in range(int(input())):
    lista = input().split(" ")
    tamanho, cover = int(lista[0]),int(lista[1])
    if tamanho % cover != 0:
        res = (tamanho/cover)+1
    else:
        res = tamanho/cover
    print(int(res))