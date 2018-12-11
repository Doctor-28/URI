# -*- coding: utf-8 -*-
lista = []
lista.append('FACE')
cont = 0
for i in range(int(input())):
    s = input().split(" ")
    s = "".join(s)
    if s == (lista[len(lista)-1][::-1]):
        del lista[len(lista)-1]
        cont +=1
        if len(lista) == 0:
            lista.append('FACE')
    else:
        lista.append(s)
print(cont)