num = int(input())

for i in range(num):
    town = int(input())
    route = input().strip().split()
    route = [int(entry) for entry in route]
    r = 1
    for num_route in route:
        r *= num_route
        r %= 1234567
    print(r)
    
