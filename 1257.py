# -*- coding: utf-8 -*-
for i in range(int(input())):
    soma = 0
    for j in range(int(input())):
        s = input()
        cont = 0
        for k in s:
            soma+=(ord(k)-65)+(j+cont)
            cont+=1
    print(soma)