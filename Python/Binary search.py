# Implementation of Binary Search
N = int(input("Enter number of elements: "))
A = list(map(int,input("Enter elements: ").strip().split()))[:N]
key = int(input("Enter the element to be searched: "))
first = 0
last = N - 1
mid = int((first + last) / 2)
while ( last >= first):
    if ( A[mid] < key):
        first = mid + 1
    elif ( A[mid] == key):
        print(key,"found at position",mid,".")
        break
    else:
        last = mid - 1
    mid = int((first + last) / 2)
if (first > last):
    print("Element not found!!!")
