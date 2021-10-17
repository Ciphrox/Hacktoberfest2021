eve = lambda x: x & 1 == 0

def f(x):
    division = 1
    ret = 0
    while division * division < x:
        if x % division == 0:
            if eve(division):
                ret += 1
            if eve(x // division):
                ret += 1
        division += 1
    if division * division == x and eve(division):
        ret += 1
    return ret

t = int(input())
for _ in range(t):
    print(f(int(input())))
