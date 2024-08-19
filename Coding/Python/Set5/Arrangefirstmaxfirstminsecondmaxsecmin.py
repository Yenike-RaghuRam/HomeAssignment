def arrange_array_max_min_secmax_secmin(arrs):
    max_value = arrs[-1] + 1
    min_index = 0
    max_index = len(arrs) - 1
    for idx in range(len(arrs)):
        if idx % 2 == 0:
            arrs[idx] += arrs[max_index] % max_value * max_value
            max_index -= 1
        else:
            arrs[idx] += arrs[min_index] % max_value * max_value
            min_index += 1
    for idx in range(len(arrs)):
        arrs[idx] //= max_value
    return arrs


print(arrange_array_max_min_secmax_secmin([1, 2, 3, 4, 5, 6]))
