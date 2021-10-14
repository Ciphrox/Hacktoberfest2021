import sys
n = int(input().strip())
for a0 in range(n):
    grade = int(input().strip())
    if grade < 38:
        print(grade)
    elif grade % 5 > 2:
        print((grade//5+1)*5)
    else:
        print(grade)
