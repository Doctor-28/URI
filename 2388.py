soma = 0
for i in range(int(input())):
	x, c = [int(i) for i in input().split()]
	soma += x*c
print(soma)