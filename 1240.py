# -*- coding: utf-8 -*-

n = input()

for i in xrange(n):
    leitor = raw_input().split()
    aux = leitor[0].find(leitor[1])
    
    if len(leitor[0]) >= len(leitor[1]):
        if leitor[0][(len(leitor[0])-len(leitor[1])):] == leitor[1]:
            print 'encaixa'
        else:
            print 'nao encaixa'
    else:
        print 'nao encaixa'