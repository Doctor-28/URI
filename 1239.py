# -*- coding: utf-8 -*-

try:
    while True:
        s = raw_input()
        cont = 0
        cont2 = 0

        s = list(s)
        for i in xrange(len(s)):
            if s[i] == '_':
                cont+=1
                if cont < 2:
                    s[i] = '<i>'
                elif cont > 1:
                    s[i] = '</i>'
                    cont = 0
            if s[i] == '*':
                cont2+=1
                if cont2 < 2:
                    s[i] = '<b>'
                elif cont2 > 1:
                    s[i] = '</b>'
                    cont2 = 0
        print ''.join(s)
except:
    pass

