# -*- coding: utf-8 -*-
try:
    while(True):
        lista = input().split(" ")  
        episodes, minutes = int(lista[0]), int(lista[1])
        if episodes == -1 and minutes == -1:
            pass
        lista = input().split(" ")
        total = 0
        eps = 0
        for i in range(episodes):
            eps +=int(lista[i])
            total += eps*minutes
        print(total)
except EOFError:
 pass