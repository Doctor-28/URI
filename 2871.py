try:
	while(True):
		soma = 0
		entrada = [int(i) for i in input().split()]
		for i in range(entrada[0]):
			soma += sum([int(i) for i in input().split()])
		print("{} saca(s) e {} litro(s)".format(soma//60, soma%60))
except EOFError as e:
	pass