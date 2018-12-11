# -*- coding: utf-8 -*-

n = input()
um = list('one')
m = 0
for i in xrange(n):
    s = raw_input()
    s = list(s)
    if len(s) == 3:
        cont = 0        
        for i in xrange(len(s)):
                if s[i]==um[i]:
                    cont +=1
        if cont >= 2:
                 print 1
        else:
                 print 2        
    elif len(s) == 5:
                  print 3 