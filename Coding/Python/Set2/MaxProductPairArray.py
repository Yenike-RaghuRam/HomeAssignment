import sys


def max_product_pair(arr):
    pos_max = -sys.maxsize - 1
    pos_second_max = -sys.maxsize - 1
    neg_max = -sys.maxsize - 1
    neg_second_max = -sys.maxsize - 1

    for val in arr:
        if val > pos_max:
            pos_second_max = pos_max
            pos_max = val
        elif val > pos_second_max and val != pos_max:
            pos_second_max = val

    for val in arr:
        if abs(val) > neg_max:
            neg_second_max = neg_max
            neg_max = abs(val)
        elif abs(val) > neg_second_max and abs(val) != neg_max:
            neg_second_max = abs(val)

    return max(pos_max * pos_second_max, neg_max * neg_second_max)


print(max_product_pair([-1, -3, -4, 2, 0, -5]))
