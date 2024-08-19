def reverse_subarray_size_k(arrs, k):
    for idx in range(0, len(arrs), k):
        start = idx
        end = min(idx + k - 1, len(arrs) - 1)
        while start < end:
            temp = arrs[start]
            arrs[start] = arrs[end]
            arrs[end] = temp
            start += 1
            end -= 1
    return arrs


print(reverse_subarray_size_k([1, 2, 3, 4, 5], 3))
