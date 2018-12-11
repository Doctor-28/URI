# -*- coding: utf-8 -*-
try:
    while(True):
        lista = []
        lista.append(0)
        lista.append(1)
        n = int(input())
        for i in range(2,n):
            if i%2==0:
                lista.append(lista[i-1]+lista[i-2])
            else:
                lista.append(lista[i-1]*lista[i-2])
        if n <= 2:
            print(lista[n-1])
        else:
            print(lista[len(lista)-1])
except EOFError:
 pass