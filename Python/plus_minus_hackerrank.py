import math
import os
import random
import re
import sys

def plusMinus(arr):
    l=len(arr)
    p=0
    n=0
    z=0
    i=0
    while(i!=l):
        if arr[i]<0:
            n+=1
        elif arr[i]>0:
            p+=1
        else:
            z+=1
        i+=1
    print(p/l)
    print(n/l)
    print(z/l)

    

if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
