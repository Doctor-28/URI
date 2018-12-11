# -*- coding: utf-8 -*-
for i in range(int(input())):
    r = input().split()
    r = sorted(set(r))
    print(" ".join(r))