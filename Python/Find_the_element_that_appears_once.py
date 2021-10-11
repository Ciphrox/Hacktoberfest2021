# Python3 code to find the element that occur only once
INT_SIZE = 32

def getSingle(arr, n) :
	result = 0
	
	for i in range(0, INT_SIZE) :
		
		sm = 0
		x = (1 << i)
		for j in range(0, n) :
			if (arr[j] & x) :
				sm = sm + 1
				
		if ((sm % 3)!= 0) :
			result = result | x
	
	return result
	
arr = [12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7]
n = len(arr)
print("The element with single occurrence is ", getSingle(arr, n))


