# -*- coding: utf-8 -*-
lista = input().split(" ")
raio,litros = int(lista[0]), int(lista[1])
volume= ((4*3.1415*(raio**3))/3)
print(int(litros/volume))