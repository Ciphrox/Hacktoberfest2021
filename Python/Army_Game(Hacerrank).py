import sys
p,q = input().strip().split(' ')
p,q = [int(p),int(q)]

number = ((p//2) + (p % 2 > 0)) * ((q//2) + (q % 2 > 0)) 
print(number)
