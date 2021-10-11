N = int(input())
Arr = list(map(int,input().split()))[:N]
Arr.sort()
container = 0
max_weight = Arr[0] + 4
for i in Arr:
    if i <= max_weight:
        continue
    container = container + 1
    max_weight = i + 4
# Add for last container
container = container + 1
print(container)
