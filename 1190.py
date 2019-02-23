# -*- coding: utf-8 -*-
def rightArea(m,op):
        x = 1
        result = 0
        for i in range(1, 11):
                for j in range(12-x,12):
                        result += m[i][j]
                if i<5:
                        x+=1
                elif i>5:
                        x-=1
                else:
                        pass
        if op == "M":
                print(result/30.0)
        print(result)

op = input()

m = []

for i in range(12):
        m.append([])
        for j in range(12):
                m[i].append(float(input()))
rightArea(m,op)
