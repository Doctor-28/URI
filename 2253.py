# -*- coding: utf-8 -*-

try:
    while True:
        s = raw_input()
        a = []
        l = 0
        u = 0
        if len(s) >= 6 and len(s) <= 32:
            for i in xrange(len(s)):
                if s[i].isupper() or s[i].islower() or s[i].isdigit():
                    a.append(s[i])
                    if s[i].isupper():
                        u +=1
                    elif s[i].islower():
                        l +=1
            if len(''.join(a)) == len(s) and u>0 and l>0:
                print 'Senha valida.'
            else:
                print 'Senha invalida.'
        else:
            print 'Senha invalida.'
except:
    pass
