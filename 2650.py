entrada = [int(i) for i in input().split()]
muro = entrada[1]
titas = []
for i in range (entrada[0]):
	entrada = input()
	nomeTita = ""
	for j in entrada:
		if not j.isdigit():
			nomeTita += j
		
	altura = int(entrada.split()[-1])
	nomeTita = nomeTita[0:len(nomeTita)-1]	
	if altura > muro:
		titas.append(nomeTita)
		
for i in titas:
	print(i)