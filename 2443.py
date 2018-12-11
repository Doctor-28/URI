a, b, c, d = [int(i) for i in input().split()]
y = b * d
x = int(((y/b)*a) + ((y/d)*c))
for i in range (2, x+1):
	while(y%i == 0 and x%i == 0):
		y = y/i
		x = x/i
print("{} {}".format(int(x), int(y)))