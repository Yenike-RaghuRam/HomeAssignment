def segregate_os_1s(arr):
    one_idx = 0
    for idx in range(len(arr)):
        if arr[idx] == 0:
            temp = arr[idx]
            arr[idx] = arr[one_idx]
            arr[one_idx] = temp
            one_idx += 1


arrs = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
segregate_os_1s(arrs)
print(arrs)
