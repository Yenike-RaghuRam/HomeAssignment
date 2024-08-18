def left_rotatearray(arr, n):
    reverse_array(arr, 0, len(arr) - 1)
    reverse_array(arr, 0, len(arr) - n - 1)
    reverse_array(arr, len(arr) - n, len(arr) - 1)


def right_rotatearray(arr, n):
    reverse_array(arr, 0, len(arr) - 1)
    reverse_array(arr, 0, n - 1)
    reverse_array(arr, n, len(arr) - 1)


def reverse_array(arr, start_idx, end_idx):
    while start_idx < end_idx:
        temp = arr[start_idx]
        arr[start_idx] = arr[end_idx]
        arr[end_idx] = temp
        start_idx += 1
        end_idx -= 1


arrs = [1, 2, 3, 4, 5]
left_rotatearray(arrs, 2)
print(arrs)
right_rotatearray(arrs, 2)
print(arrs)
