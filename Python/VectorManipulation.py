# Implement this: VectorAdd() performs vector addition on two vectors and returns a 
# vector
def VectorAdd(a,b):
	assert len(a)==len(b)
    newVector = []
	
    for i in range(len(a)):
        v = a[i] + b[i]
        newVector.append(v)
    
    
    return newVector

# Implement this: VectorSub() performs vector subtraction on two vectors and returns a 
# vector
def VectorSub(a,b):
	assert len(a)==len(b)
    newVector = []
    
    for i in range(len(a)):
        v = a[i] - b[i]
        newVector.append(v)
    
    
 return newVector


# Implement this: VectorMult() performs vector multiplication and returns a scalar 
# (number)
def VectorMult(a,b):
	assert len(a)==len(b)
    total =  0
    
    for i in range(len(a)):
        v = a[i] + b[i]
        total = total + v
    
 return total

# Implement this
def PerceptronFunction(wvector,x):
    

    
# DO NOT MODIFY THIS
def CheckPerceptron():
    w=[1,1]
    # positive examles
    Mp=[[0,1],[0,2]]
    
    # negative examples
    Mn=[[-1,1],[-2,1]]
    
    for x in Mp:
        if PerceptronFunction(w,x)==0:
            print "Problem with Positive Vector x:",x
        else:
            print "No problem with Positive Vector x:",x
    for x in Mn:
        if PerceptronFunction(w,x)==1:
            print "Problem with Negative Vector x:",x
        else:
            print "No problem with Negative Vector x:",x

CheckPerceptron()
