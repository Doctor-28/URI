# -*- coding: utf-8 -*-
import math
while True:
  try:
    l = int(input())
    a = (l ** 2) *(math.sqrt(3)/4)
    print(format(8*a/5,'.2f'))
  except EOFError:
    break