def merge_2_sorted_arrays(arr1, arr2):
    temp = [None] * (len(arr1) + len(arr2))
    arr1_idx = 0
    arr2_idx = 0
    temp_idx = 0
    while arr1_idx < len(arr1) and arr2_idx < len(arr2):
        if arr1[arr1_idx] <= arr2[arr2_idx]:
            temp[temp_idx] = arr1[arr1_idx]
            arr1_idx += 1
        else:
            temp[temp_idx] = arr2[arr2_idx]
            arr2_idx += 1
        temp_idx += 1
    while arr1_idx < len(arr1):
        temp[temp_idx] = arr1[arr1_idx]
        arr1_idx += 1
        temp_idx += 1
    while arr2_idx < len(arr2):
        temp[temp_idx] = arr2[arr2_idx]
        arr2_idx += 1
        temp_idx += 1
    return temp


def arrange_in_merge_format_individual_arrays(arr1, arr2):
    for idx in range(len(arr1)):
        if arr1[idx] > arr2[0]:
            temp = arr1[idx]
            arr1[idx] = arr2[0]
            arr2[0] = temp

            arr2_start_value = arr2[0]
            for arr2_idx in range(1, len(arr2)):
                if arr2[arr2_idx] < arr2_start_value:
                    arr2[arr2_idx - 1] = arr2[arr2_idx]
                else:
                    arr2[arr2_idx - 1] = arr2_start_value
                    break


print(merge_2_sorted_arrays([1, 3, 4, 5], [2, 4, 6, 8]))
arr1s = [1, 3, 4, 5]
arr2s = [2, 4, 6, 8]
arrange_in_merge_format_individual_arrays(arr1s, arr2s)
print(arr1s)
print(arr2s)
