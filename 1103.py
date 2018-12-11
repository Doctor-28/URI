# -*- coding: utf-8 -*-
while True:
    h1,m1,h2,m2 = [int(n) for n in input().split()]
    if h1==0==m1==h2==m2:
        break
    elif h1==h2 and m1>m2:
        total = 1440-(m1-m2)
    elif h1>h2:
        total = ((h2+24)-h1)*60 + (m2-m1)
    else:
        total = (h2-h1)*60 + (m2-m1)
    print(total)