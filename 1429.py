# -*- coding: utf-8 -*-
d= {
    1:1,
    2:2,
    3:6,
    4:24,
    5:120 
}
while True:
    n = input()[::-1]
    if n=='0':
        break
    soma=0
    for i in range(len(n)):
        soma+=(d[i+1]*int(n[i]))
    print(soma)