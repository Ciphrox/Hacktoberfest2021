
def selection_sort(arr):
   

   for i in range(len(arr)):
      min_index = i
      for j in range(i,len(arr)):
         
         if arr[min_index] > arr[j]:
            min_index = j
      
      arr[i],arr[min_index] = arr[min_index],arr[i]

a = [25,12,7,10,8,23]
print(a)
selection_sort(a)
print(a)