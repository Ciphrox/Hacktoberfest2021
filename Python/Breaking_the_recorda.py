input()
p = list(map(int, input().split()))
a = b = p[0]
m = n = 0
for i in p[1:]:
    if i > b:
        b = i
        m += 1
    elif i < a:
        a = i
        n += 1
print(m, n)
