# -*- coding: utf-8 -*-
try:
    while True:
        soma = 0
        while True:
            s = input().strip()
            if s=="caw caw":
                break
            s=s.replace("-","0").replace("*","1")
            soma += int(s, 2)
        print(soma)
except EOFError:
    pass