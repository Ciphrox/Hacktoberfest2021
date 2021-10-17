numJ, numL = map(int, input().strip().split())
tot = 0
for x in range(numL):
    m, n, o = map(int, input().strip().split())
    tot += (m - n + 1) * o
    
print(tot // numJ)
