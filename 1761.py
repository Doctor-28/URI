# -*- coding: utf-8 -*-
import math
try:
    while True:
        x = [float(n) for n in input().split()]
        n = (math.tan(math.radians(x[0])) * x[1]) + x[2]
        print(format(n*5, '1.2f'))
except EOFError:
    pass