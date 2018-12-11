# -*- coding: utf-8 -*-

n = '1'
while int(n,0) >= 0:
    n = raw_input()
    if n[0] != '-':
        if str(n)[:2] != '0x':
            print str(hex(int(n))).upper().replace('X','x')
        else:
            print (int(n,0))