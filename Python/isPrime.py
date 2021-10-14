
from math import sqrt

n = int(input())

prime_flag = 0
 
if(n > 1):
    for i in range(2, int(sqrt(n)) + 1):
        if (n % i == 0):
            prime_flag = 1
            break
    if (prime_flag == 0):
        print("true")
    else:
        print("false")
else:
    print("false")