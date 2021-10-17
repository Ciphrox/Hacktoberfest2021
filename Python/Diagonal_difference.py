Num=int(input())
grid=[]
for i in range(0,Num):
    l=[int(i) for i in input().split()]
    grid.append(l)
temp=0
sum1=0
sum2=0
j1=0
j2=Num-1
while(temp<Num):
    sum1=sum1+grid[temp][j1]
    sum2=sum2+grid[temp][j2]
    temp+=1
    j1+=1
    j2-=1
print(abs(sum1-sum2))
