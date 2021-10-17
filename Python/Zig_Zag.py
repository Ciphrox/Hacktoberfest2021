"""
1                       13 
  2                  12  14
    3              11        15
      4          10             16
        5      9
          6  8
            7
"""


r,c =7,16

for i in range(r):
    for j in range(c):
        if  j%(2*r-2)==i or (j+i)%(2*r-2)==0:
            print(f'{j+1}  ' if j+1 in range(r,10) else j+1,end='')
        else:
            print(end='  ')
    print()
