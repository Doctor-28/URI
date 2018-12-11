for i in range(int(input())):
	entrada = input().split()
	if "+" in entrada:
		resposta = int(entrada[0]) + int(entrada[2])
	elif "-" in entrada:
		resposta = int(entrada[0]) - int(entrada[2])
	else:
		resposta = int(entrada[0]) * int(entrada[2])
	m = int(entrada[4]) - resposta
	if m < 0:
		m *= -1	
	print("E{}ou!".format("r"*m))