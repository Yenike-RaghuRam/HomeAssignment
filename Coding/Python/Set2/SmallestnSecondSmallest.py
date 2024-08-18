import sys


def smallnsecondsmall(arr):
    small = sys.maxsize
    second_small = sys.maxsize
    for val in arr:
        if val < small:
            second_small = small
            small = val
        elif val < second_small and val != small:
            second_small = val
    return small, second_small


print(smallnsecondsmall([1, 3, 4, 6, 4, 2]))
