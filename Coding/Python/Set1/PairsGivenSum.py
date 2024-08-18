def pairs_given_sum(arr, sumf):
    pairList = []
    temp_set = set()
    for val in arr:
        remain_sum = sumf - val
        if remain_sum in temp_set:
            pairList.append((val, remain_sum))
        temp_set.add(val)
    return pairList


print(pairs_given_sum([1, 3, 4, 6, 4, 2, 6], 8))
