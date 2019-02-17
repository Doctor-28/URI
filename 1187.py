# -*- coding: utf-8 -*-
op = input()

m = []

for i in range(12):
        m.append([])
        for j in range(12):
                m[i].append(float(input()))

x=1
result = 0
cont = 0
for i in range(12):
        for j in range(x,12-x):
                result += m[i][j]
                cont+=1
        x+=1

if op == "S":
        print("%1.1f" % (result))
else:
        print("%1.1f" % (result/cont))