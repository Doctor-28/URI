# -*- coding: utf-8 -*-
while True:
    n = int(input())
    if n==0:
        break
    for i in range(1,n+1):
        if i==n:
            print(i,end='\n')
            break
        print(i,end=' ')