# -*- coding: utf-8 -*-
try:
    c = 1 
    while True:
        cont = 0
        lista = []
        m=0
        f=0
        n = input()
        s = input().split()
        if c >1:
            print()
        for i in range(len(s)):
            if s[i] == n:
                cont+=1
                lista.append(s[i+1])
        for i in lista:
            if i == "F":
                f+=1
            else:
                m+=1
        print("Caso %d:\nPares Iguais: %d\nF: %d\nM: %d" % (c,cont,f,m))
        c+=1
except EOFError:
    pass