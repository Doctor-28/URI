# -*- coding: utf-8 -*-
while True:
    x1,y1,x2,y2 = [int(n) for n in input().split()]
    if x1==0==y1==x2==y2:
        break
    if (x1==x2) and (y1==y2):
        print(0)
    elif (x1==x2) or (y1==y2):
        print(1)
    else:
        found = False
        x=x1
        y=y1
        while x < 9 and not found:
            if x==x2 and y==y2:
                found = True
                break
            if (y+1)>8 or (x+1)>8:
                x=x1
                y=y1
                break
            x+=1
            y+=1

        while x < 9 and not found:
            if x==x2 and y==y2:
                found = True
                break
            if (y-1)<1 or (x+1)>8:
                x=x1
                y=y1
                break
            x+=1
            y-=1

        while x > 0 and not found:
            if x==x2 and y==y2:
                found = True
                break
            if (y-1)<1 or (x-1)<1:
                x=x1
                y=y1
                break
            x-=1
            y-=1

        while x > 0 and not found:
            if x==x2 and y==y2:
                found = True
                break
            if (y+1)>8:
                x=x1
                y=y1
                break
            x-=1
            y+=1

        if found:
            print(1)
        else:
            print(2)