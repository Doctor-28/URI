# -*- coding: utf-8 -*-

try:
    while True:
        r= raw_input()
        s= raw_input()
        cont = 0
        for i in xrange(len(r)):
            for j in xrange(len(s)):
                if s[j] == r[i]:
                    cont +=1
        print cont
except:
    pass
