l = int(input())
for x in range(l):
    x = x + 1
    s = ' ' * (l - x)
    b = '#' * x
    output_str = (s+b).rstrip()
    print(output_str)
