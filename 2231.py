# -*- coding: utf-8 -*-
cont = 1
while True:
    n, m = [int(i) for i in input().split()]
    if n==m==0:
        break
    r= []
    med = []
    somaAtual = 0
    for i in range(n):
        r.append(int(input()))
        somaAtual += r[i]
        if i>= m-1:
            med.append(somaAtual/m)
            somaAtual -= r[i+1-m]
    print('Teste %d\n%d %d\n' %(cont,min(med), max(med)))
    cont+=1