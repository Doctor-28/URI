# -*- coding: utf-8 -*-
for i in range(int(input())):
    s = input()
    total = int(s.split("!")[0])
    N = int(s.split("!")[0])
    cont = 1
    while True:
        f = (N-(cont*s.count("!")))
        if f<1:
            break
        total *= f
        cont+=1 
    print(total)