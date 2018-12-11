entrada = [int(i) for i in input().split()]
maxm = entrada[0]
ms = [int(i) for i in input().split()]
ms.sort()
diferencas = []
xa = ms[0]
xb = maxm - ms[-1]
if len(ms) > 1:
	for i in range(1,len(ms)):
		x = ms[i]-ms[i-1]
		diferencas.append(x)
	diferencas.sort()
	if (int(diferencas[-1]/2 + 1)-1 >= xa) and (int(diferencas[-1]/2 + 1)-1 >= xb):
		print(int(diferencas[-1]/2 + 1)-1)
	elif xa > xb:
		print(xa-1)
	else:
		print(xb)
else:
	if xa > xb:
		print(xa-1)
	else:
		print(xb)