# -*- coding: utf-8 -*-

def fatorial(n):
    aux = 1
    for i in xrange((n),0,-1):
        aux = aux * i; 
    print aux

n = input()
fatorial(n)
