# -*- coding: utf-8 -*-
for i in range(int(input())):
    s = input()
    n = input()
    cheater = False
    for i in n:
        if i not in s:
            cheater = True
            break
        s=s.replace(i, '')
    r = input()
    i= 0
    while i<len(r) and not cheater:
        if r[i] not in s:
            cheater = True
            break
        s=s.replace(r[i], '')
        i+=1
    if cheater:
        print('CHEATER')
    else:
        print("".join(sorted(s)))