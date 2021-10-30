def bubbleSort(arr):
    n = len(arr)
 
    # Traverse through all array elements
    for i in range(n-1):
        for j in range(0, n-i-1):
 
            # Traverse the array from 0 to n-i-1 and swap the element if greater than next element
            if arr[j] > arr[j + 1] :
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
 
# Driver code to test the algorithm
arr = [31, 74, 15, 6, 30, 13, 98]
 
bubbleSort(arr)
 
print ("Sorted array:")
for i in range(len(arr)):
    print ("% d" % arr[i])
