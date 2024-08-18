def total_pair_equal_elements(arr):
    dict_pairs = {}
    for val in arr:
        if val in dict_pairs:
            dict_pairs[val] += 1
        else:
            dict_pairs[val] = 1
    pairs = 0
    for val in dict_pairs.values():
        pairs += val // 2
    return pairs


print(total_pair_equal_elements([6, 5, 2, 3, 5, 2, 2, 1]))
