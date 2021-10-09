n = int(input())
for i in range(n):
    p, q = [int(x) for x in input().split()]
    for i in range(0, p):
        if q >= i:
            q = i + p - 1 - q
    print(q)
