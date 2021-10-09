def find_next_greateset_elemt(nums):
    temp = [-1 for i in nums]
    print(temp)
    stack = []
    lnums = nums * 2
    N = len(nums)
    for i in range(len(lnums)):
        while stack and stack[-1][0] < lnums[i]:
            val, pos = stack.pop()
            # print(val, pos)
            print("temp", temp)
            temp[pos] = lnums[i]

        if i < N:
            stack.append((lnums[i], i))
            print(i, stack)
    return temp


print(find_next_greateset_elemt([5, 4, 3, 6, 1]))
