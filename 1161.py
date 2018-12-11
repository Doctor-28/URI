# -*- coding: utf-8 -*-

try:
    while True:    
        def fatorial(n):
            aux = 1
            for i in xrange((n),0,-1):
                aux = aux * i; 
            return aux

        n = raw_input().split()
        print fatorial(int(n[0]))+fatorial(int(n[1]))
except: 
    pass