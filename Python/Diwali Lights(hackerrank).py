num = int(input())

for i in range(num):
    bulb = int(input())
    design = 1
    for i in range(bulb):
        design *= 2
        design %= 100000
    design -= 1
    print(design)
