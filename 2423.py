# -*- coding: utf-8 -*-

leitura = raw_input().split(" ")
numeros = [int(numero) for numero in leitura] 

A,B,C = numeros

A/=2

B/=3

C/=5

print "%d" % min(A,min(B,C))