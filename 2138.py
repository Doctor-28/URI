# -*- coding: utf-8 -*-
try:
    while True:
        d= {}
        n = input()
        for i in n:
            if i not in d.keys():
                d[i] = 0
            d[i]+=1
        r = max(d.values())
        lista = []
        for i in d.keys():
            if d[i] == r:
                lista.append(i)
        print(max(lista))
except EOFError:
    pass
