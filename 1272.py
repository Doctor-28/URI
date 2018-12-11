# -*- coding: utf-8 -*-

n = input()
for i in xrange(n):
    a = []
    leitor = raw_input().split()
    for i in xrange(len(leitor)):
        a.append(leitor[i][0])
    print ''.join(a)