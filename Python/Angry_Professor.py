m = int(input())
for tests in range(m):
    p,q = [int(x) for x in input().split()]
    n = 0
    for x in input().split():
        y = int(x)
        if y <= 0:
            n += 1
    if n < q:
        print('YES')
    else:
        print('NO')
