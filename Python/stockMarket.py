l = list(map(int, input("Enter stock prices : ").split()))
min1 = l[0]
for i in range(0, len(l)):
    if l[i] < min1:
        min1 = l[i]
if min1 == l[len(l) - 1]:
    print("buy price of stock is ", min1, end="")
    print("End of day")
else:
    max1 = l[min1]
    print("buy price of stock is ", min1)
    for j in range(l[min1], len(l)):
        if l[j] > max1:
            max1 = l[j]
    print("sell price of stock is ", max1)
    print("total profit = ", (max1 - min1))
