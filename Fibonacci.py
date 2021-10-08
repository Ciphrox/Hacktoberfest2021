t1=0
t2=1
n=int(input("Enter the number of terms: "))
print("Fibonacci Series:")
print(t1)
print(t2)
for i in range(2, n):
  nextTerm = t1 + t2
  print(nextTerm)
  t1 = t2
  t2 = nextTerm