# -*- coding: utf-8 -*-

for i in range(0, int(input())):
    s = []
    for i in range(0, int(input())):
        s.append(input())
        aux = s[0]
        repeat = True
    for i in range(1,len(s)):
        if s[i] != aux:
            repeat = False
            print('ingles')
            break
        aux = s[i]
    if repeat == True:
        print(s[0])