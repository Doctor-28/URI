# -*- coding: utf-8 -*-

entrada = raw_input().split(" ")
numeros = [int(numero) for numero in entrada] 

A,B,C,D = numeros
if B>C:
    if D>A:
        if (C+D)>(A+B):
            if C>0:
                if D>0:
                    if A%2==0:
                        print "Valores aceitos"
                    
                    else:
                        print "Valores nao aceitos"
                else:
                    print "Valores nao aceitos"    
            else:
                print "Valores nao aceitos"
        else:
            print "Valores nao aceitos"
    else:
        print "Valores nao aceitos"
else:
    print "Valores nao aceitos" 