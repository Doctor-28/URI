# -*- coding: utf-8 -*-
d={
    'W':1,
    'H':0.5,
    'Q':0.25,
    'E':0.125,
    'S':0.0625,
    'T':0.03125,
    'X':0.015625
}
while True:
    s = input()
    if s=="*":
        break
    s= s.split("/")
    cont = 0
    for i in s:
        soma=0
        for j in i:
            soma+=d[j]
        if soma==1:
            cont+=1
    print(cont)
