# -*- coding: utf-8 -*-
try:
    while True:
        n = int(input())
        if n==0:
            break
        lista = [int(n) for n in input().split()]
        m=0
        j=0
        for i in lista:
            if i==0:
                m+=1
            else:
                j+=1
        print("Mary won %d times and John won %d times" % (m,j))
except EOFError:
    pass