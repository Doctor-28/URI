n, op, m = input().split()
if op == "+":
	x = int(n.replace("7","0"))+int(m.replace("7","0"))
else:
	x = int(n.replace("7","0"))*int(m.replace("7","0"))
print(int(str(x).replace("7","0")))
	