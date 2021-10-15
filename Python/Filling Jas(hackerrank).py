p = 0
q = 0
def solve():
    global p
    global q
    ans = 0
    for i in range(0,p):
        a,b,k = map(int,input().split())
        ans += (b-a+1)*k
    return ans//q
q,p = map(int,input().split())
print(solve())
