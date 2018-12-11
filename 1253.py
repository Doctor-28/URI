# -*- coding: utf-8 -*-

n = input()
for i in xrange(n):
    s = raw_input()
    t = input()
    s = list(s)
    for j in xrange(len(s)):
        b = ord(s[j])-t
        if b < 65:
            s[j] = chr (90 - (64 - (b))) 
        else:
            s[j] = chr (b)
    print ''.join(s)