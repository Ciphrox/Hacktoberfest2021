# bubble sorting an array
#//---create a random list---//

import random as rand
a=[]
for _ in range(10):
 x=rand.randint(0,100)
 a.append(x)
print ("random : ",a)

#//---logic to swap pair of no.---//

for j in range (len(a)):
    temp=a.copy()
    for i in range(len(a)-1):
        if a[i]>a[i+1]:
            a[i],a[i+1]=a[i+1], a[i]
    if temp==a:
        break
print("sorted : ",a)
