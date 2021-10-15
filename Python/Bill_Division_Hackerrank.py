p, q = list(map(int, input().split()))
m = list(map(int, input().split()))
n = int(input())

sum1 = sum(m) - m[q]

if sum1//2 != n:
    print(n - sum1//2)
else:
    print("Bon Appetit")
