N = int(input())
blist= list(map(int,input().strip().split()))[:N]
cmpcount, swapcount = 0, 0
for j in range(N-1): # To keep track of number of iteration
    swapped = False # To check whether swapping of two elements happened or not
    for i in range(N-j-1): # To compare the elements within the particular iteration
        # Swap if any element is greater than its adjacent element
        if blist[i] > blist[i+1]:
            blist[i], blist[i+1] = blist[i+1], blist[i]
            swapcount += 1
            swapped = True
        cmpcount += 1
    # If swapping of two elements does not happen then break
    if swapped == False:
        break
print(cmpcount)
print(swapcount)
