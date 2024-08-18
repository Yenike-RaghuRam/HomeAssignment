def elem_afterall_decreasing(arr):
    for idx in range(len(arr) - 2, -1, -1):
        if arr[idx] < arr[idx + 1]:
            return arr[idx + 1]
    return -1


print(elem_afterall_decreasing([0, 1, 2, 3, 2, 1]))
