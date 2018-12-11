# -*- coding: utf-8 -*-

n = input()
for i in xrange(n):
    s = raw_input()
    a = []
    aux = 0
    cont = 0
    for i in xrange (len(s)):
        existe = False
        for j in xrange (aux):
            if a[j] == s[i]:
                existe = True
                break
        if existe == False:
            a.insert(aux,s[i])
            aux +=1
    for i in xrange(97,135):
        for j in xrange(0,len(a)):
            if a[j] == chr(i):
                cont +=1
    if cont == 26:
        print 'frase completa'
    elif cont <= 25 and cont >= 13:
        print 'frase quase completa'
    elif cont < 13:
        print 'frase mal elaborada' 