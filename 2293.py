# -*- coding: utf-8 -*-
m,n = [int(n) for n in input().split()]
mat=[]
for i in range(m):
    mat.append([int(n) for n in input().split()])
soma=0
for i in range(m):
    aux=0
    for j in range(n):
        aux = aux + mat[i][j]
    if aux > soma:
        soma = aux
for j in range(n):
    aux=0
    for i in range(m):
        aux = aux + mat[i][j]
    if aux > soma:
        soma = aux
print(soma)