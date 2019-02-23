n = int(input())

nums = [int(x) for x in input().split()]

possible = []

for i in nums:
    if i<=n and i>=0:
        possible.append(i)

print(nums.index(min(possible))+1)