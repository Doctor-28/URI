# -*- coding: utf-8 -*-
try:
    while True:
        n = int(input())
        if n==0:
            break
        a = 0
        b = 0
        for i in range(n):
            lista = [int(n) for n in input().split()]
            if lista[0] > lista[1]:
                a+=1
            elif lista[0] < lista[1]:
                b+=1
        print("%d %d" % (a,b))
except EOFError:
    pass