# -*- coding: utf-8 -*-

a,b = map(int, raw_input().split())
cont = 0
for i in xrange(a):
    gols = map(int,raw_input().split())
    if gols.count(0) == 0:
        cont += 1
print cont