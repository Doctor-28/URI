# -*- coding: utf-8 -*-
try:
    soma = 0
    cont = 0 
    while True:
        s = input()
        n = float(input())
        soma += n
        cont+=1
except EOFError:
    print( format((soma/cont),'.1f'))