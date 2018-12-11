# -*- coding: utf-8 -*-

cont=0
media = 0
for i in xrange(0,6,1):
    x =input()
    if x > 0:
        cont+=1
        media+= x
print "%d valores positivos" % cont
print "%1.1f" % (media/cont)

