T=int(input())
for i in range(T):
    X = 1
    N = int(input())
    while True:
        Y = int(bin(X)[2:].replace('1','9'))
        if Y % N == 0:
            break
        X = X + 1
    print(Y)
    
