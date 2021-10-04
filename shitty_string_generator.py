#Shitty code to generate input string randomly
import string
import random
  
inp=input("Enter your string without space: ")
out=''
con=0
total=0
while(inp != out ):
    total+=1
    randomLetter = random.choice(string.ascii_letters)
    print(randomLetter)
    if (randomLetter==inp[con]):
        out+=randomLetter
        con+=1
        print ("IT'S A MATCH! New String: "+out)

print("String: "+out)
print("Found in "+str(total)+" iterations")
