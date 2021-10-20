# Python program to illustrate library functions
# save time while coding with the example of map()
import time

# slower (Without map())
start = time.clock()
s = 'geeks'
U = []
for c in s:
	U.append(c.upper())
print (U)
elapsed = time.clock()
e1 = elapsed - start
print ("Time spent in function is: ", e1)

# Faster (Uses builtin function map())
s = 'geeks'
start = time.clock()
U = map(str.upper, s)
print (U)
elapsed = time.clock()
e2 = elapsed - start
print ("Time spent in builtin function is: ", e2)
