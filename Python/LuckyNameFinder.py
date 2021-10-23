#Numerologists claim to be able to determine a person’s character traits based on the “numeric value“ of a name. The value of a name is 
#determined by summing up the values of the letters of the name where ’a’ is 1, ’b’ is 2, ’c’ is 3 etc., up to ’z’ being 26. Write a program that 
#calculates the numeric value of a single name provided as input. A person is said to be lucky if numeric value is 2 digit prime number so
#also print "lucky" else in other case print "Unlucky".


import string
dicts={}
alphabet=string.ascii_lowercase
list_alphabet=list(alphabet)
for num, letter in enumerate(list_alphabet):
    dicts[letter]=num+1
name=list(str(input()).lower())
sm=0
for l in name:
    sm=sm+dicts[l]
if len(str(sm))==2:
    for i in range(2,sm):
        if(sm%i)==0:
            print("Unlucky:(")
            break
    else:
        print("Lucky:)")
else:
    print("Unlucky:(")
