d = {'I':0, 'l':0, 'o':0, 'v':0, 'e':1, 'y':0, 'u':0, '!':0}
s = input()
for i in s:
	if i in d.keys():
		d[i]+=1
d["o"] = d["o"]//2
print(min(d.values()))