# -*- coding: utf-8 -*-

n=1
cont = 0
while n != 0:
    n = input()
    m = []
    l = []
    aux = 'A'  
    if n != 0:
        if cont>0:
            print 
        for i in xrange(n):
            s = raw_input()
            m.insert(i,s)
            if len(s) > len(aux):
                aux = s
            l.insert(i,len(s))

        for i in xrange(n):
            print '%s' % m[i].rjust(len(aux))
        cont += 1     
