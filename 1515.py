# -*- coding: utf-8 -*-

n=1 
while n != 0:
    n = input()

    if n != 0:
        a = []
        b = []
        c = []
        for i in xrange(0,n,1):
            leitor = raw_input ().split ()
        
        
            a.append(leitor[0] )
            b.append(int(leitor[1]) - int(leitor[2]))
            c.append(int(leitor[2]) )
        
        print a[b.index(min(b))]