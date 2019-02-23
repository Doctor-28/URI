n = int(input())
for i in range(n):
    line = input().lower()
    nr = {}
    maxi = 0
    for char in line:
        if char not in nr.keys() and (line.count(char) >= maxi and char != ' ') and (ord(char) > 96 and ord(char) < 123):
            nr[char] = line.count(char)
            maxi = line.count(char)

    for char in sorted(nr.keys()):
        if not(nr[char] < maxi):
            print(char, end="")
    print()
