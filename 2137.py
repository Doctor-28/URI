# -*- coding: utf-8 -*-
try:
    while True:
        s = []
        for i in range(int(input())):
            s.append(input())
        for i in sorted(s):
            print(i)
except EOFError:
    pass