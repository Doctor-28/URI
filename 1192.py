# -*- coding: utf-8 -*-
n = int(input())
for i in range(n):
    lista = input()
    if lista[0]==lista[2]:
        print(int(lista[0])*int(lista[2]))
    elif lista[1].isupper():
        print(int(lista[2])-int(lista[0]))
    else:
        print(int(lista[2])+int(lista[0]))