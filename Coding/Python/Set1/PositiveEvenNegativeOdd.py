def rearrange_pos_even_neg_odd(arr):
    even_idx = 0
    odd_idx = 1
    result = [None] * len(arr)
    for val in arr:
        if val > 0:
            result[even_idx] = val
            even_idx += 2
        else:
            result[odd_idx] = val
            odd_idx += 2
    return result


def rearrange_pos_even_neg_odd_withoutorder(arrf):
    pos_index = 0
    neg_index = len(arrf) - 1
    while pos_index < neg_index:
        while pos_index < len(arrf):
            if arrf[pos_index] < 0:
                break
            pos_index += 2
        while neg_index >= 0:
            if arrf[neg_index] > 0:
                break
            neg_index -= 2
        if pos_index < len(arrf) and neg_index >= 0:
            temp = arrf[pos_index]
            arrf[pos_index] = arrf[neg_index]
            arrf[neg_index] = temp


print(rearrange_pos_even_neg_odd([1, 2, -4, 6, -3, -2]))
arr = [1, 2, -4, 6, -3, -2]
rearrange_pos_even_neg_odd_withoutorder(arr)
print(arr)
