# -*- coding: utf-8 -*-

leitor = '1'
while leitor != '*':
    leitor = raw_input()

    aux = leitor[0].upper()

    cont = 0
    if leitor != '*':
        leitor = leitor .split()
        for i in xrange(len(leitor)):
            if leitor[i][0].upper() == aux:
                cont +=1
        if cont == len(leitor):
            print 'Y'
        else:
            print 'N'
