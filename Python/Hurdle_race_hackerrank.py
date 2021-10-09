import sys
m,n = input().strip().split(' ')
m,n = [int(m),int(n)]
h = list(map(int, input().strip().split(' ')))
# your code goes here
print(max(0,max(h)-n))
