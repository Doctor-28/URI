# -*- coding: utf-8 -*-
n = raw_input().split()
o = raw_input().split()
print 'VALOR A PAGAR: R$ %.2f' % ((float(n[1])*float(n[2]))+(float(o[1])*float(o[2])))