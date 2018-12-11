# -*- coding: utf-8 -*-

entrada = raw_input()
leitura = entrada.split(" ")
numeros = [float(numero) for numero in leitura] 


a, b, c = numeros
triangulo = (a * c) / 2
print "TRIANGULO:", ("%.3f" % triangulo)
circulo = (3.14159 * c**2 )
print "CIRCULO:", ("%.3f" % circulo)
trapezio = ((a + b) * c) / 2
print "TRAPEZIO:", ("%.3f" % trapezio)
quadrado = b * b
print "QUADRADO:", ("%.3f" % quadrado)
retangulo = a * b

print "RETANGULO:", ("%.3f" % retangulo)