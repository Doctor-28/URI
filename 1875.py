# -*- coding: utf-8 -*-
for i in range(int(input())):
    R,G,B = 0,0,0
    for i in range(int(input())):
        lista = input().split(" ")
        if lista[0] == 'R' and lista[1] == 'B':
            R+=1
        elif lista[0] == 'G' and lista[1] == 'R':
            G+=1
        elif lista[0] == 'B' and lista[1] == 'G':
            B+=1
        elif lista[0] == 'R' and lista[1] == 'G':
            R+=2
        elif lista[0] == 'G' and lista[1] == 'B':
            G+=2
        else:
            B+=2
    if R == G == B:
        print('trempate')
    elif R > G and R > B:
        print('red')
    elif G > R and G > B:
        print('green')
    elif B > R and B > G:
        print('blue')
    elif R == G and R > B:
        print('empate')
    elif G == B and G > R:
        print('empate')
    else:
        print('empate')