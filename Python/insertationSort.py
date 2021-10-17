A=[]
for v in range(10):
    A.append(int(input('enter number: ')))
print(A)    

#insertion sort
#define a function
def insertionSort(A):
    for j in range(1,len(A)):
        key = A[j]
        i = j-1
        while(i >=0 and A[i]>key):
            A[i+1] = A[i]
            i = i-1
        A[i+1] = key

#implement insertion code and call it.
insertionSort(A)        
print('sorted array: ')
print(A)