#!/bin/python3

import math
import os
import random
import re
import sys

def miniMaxSum(arr):
    min=0
    max=0
    s=sorted(arr)
    r=sorted(arr,reverse=True)
    for i in range(len(s)-1):
        min+=s[i]
    for j in range(len(r)-1):
        max+=r[j]
    print(min,max)
    


if __name__ == '__main__':
    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)
