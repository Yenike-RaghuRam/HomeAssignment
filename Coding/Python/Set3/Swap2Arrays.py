def swap_arrays(arr1, arr2):
    for idx in range(len(arr1)):
        temp = arr1[idx]
        arr1[idx] = arr2[idx]
        arr2[idx] = temp


arr1s = [6, 7, 8, 9, 10]
arr2s = [1, 2, 3, 4, 5]
swap_arrays(arr1s, arr2s)
print(arr1s)
print(arr2s)
