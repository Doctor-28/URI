entrada = [int(i) for i in input().split()]
nomes = []
for i in range (entrada[0]):
	nomes.append(input())
nomes.sort()
print(nomes[entrada[1]-1])