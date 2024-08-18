def findeleminanotinb(arrA, arrB):
    temp_set = set()
    result = []
    for val in arrB:
        temp_set.add(val)
    for val in arrA:
        if val not in temp_set:
            result.append(val)
    return result


print(findeleminanotinb([1, 2, 3, 4, 5], [2, 3]))
