entrada = [int(i) for i in input().split()]
volume = entrada[0]
volumes = input().split()
for i in range(entrada[1]):
	volume += int(volumes[i])
	if (volume > 100):
		volume = 100
	elif (volume < 0):
		volume = 0
print(volume)