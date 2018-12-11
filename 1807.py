# -*- coding: utf-8 -*-
def funModular(base,exp,m):
    if exp == 0:
        return 1
    potencia = 1
    while exp != 0:    
        resto = int(exp) % 2
        exp = exp / 2
        if resto ==1:
            potencia = (potencia * base) % m
        base = (base*base) % m
    return potencia
print(funModular(3,int(input()),(2**31)-1))