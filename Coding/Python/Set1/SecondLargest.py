import sys


def second_largest(arr):
    largest = -sys.maxsize - 1
    second = -sys.maxsize - 1
    for val in arr:
        if val > largest:
            second = largest
            largest = val
        elif val > second and val != largest:
            second = val
    if second == -sys.maxsize-1:
        return -1
    return second


print(second_largest([1, 3, 4, 6, 4]))
print(second_largest([1, 1]))

