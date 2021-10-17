#quick Sorting
def quick_sort(list):
    if len(list)<2:
        return list
    else:
        pivot=int(list.pop())
        right_items,left_items=[],[]
        for item in list:
            if int(item)>pivot:
                right_items.append(int(item))
            else:
                left_items.append(int(item))
    return quick_sort(left_items)+[pivot]+quick_sort(right_items)
a=input("enter numbers separated by space :"). split()
print(quick_sort(a))
