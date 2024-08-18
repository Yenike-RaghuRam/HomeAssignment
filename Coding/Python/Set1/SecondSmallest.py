import sys


def second_smallest(arr):
    small = sys.maxsize
    second_small = sys.maxsize
    for val in arr:
        if val < small:
            second_small = small
            small = val
        elif val < second_small and val != small:
            second_small = val
    if second_small == sys.maxsize:
        return -1
    return second_small


print(second_smallest([1, 3, 4, 6, 4]))
print(second_smallest([1, 1]))
