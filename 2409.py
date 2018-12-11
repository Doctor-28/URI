x = [int(f) for f in input().split()]
y = [int(f) for f in input().split()]
x.sort()
y.sort()
if(x[0] > y[0] or x[1] > y[1]):
	print("N")
else:
	print("S")