n=int(input())
for i in range(n):
    s=input()
    str=s.split()
    for i in str:
        q=[h for h in i]
        k=1
        j=len(i)-2
        while(k<j):
            q[k],q[j]=q[j],q[k]
            k=k+1
            j=j-1
        print("".join(q),end=" ")
    print()




