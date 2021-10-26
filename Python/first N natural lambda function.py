natural= lambda x: x+natural(x-1) if x>0 else 0

print(natural(int(input("Enter n: "))))
