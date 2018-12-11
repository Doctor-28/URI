# -*- coding: utf-8 -*-

import math
for i in range(0, int(input())):
    side = float(input())
    height = side / (2 * math.tan((36 * math.pi) / 180.0))
    area = 10 * ((side * height) / 4)
    print( format(area, '.3f' ))