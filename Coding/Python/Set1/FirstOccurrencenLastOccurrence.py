def firstOccurrence(arr, target):
    low = 0
    high = len(arr) - 1
    result_index = -1
    while low <= high:
        mid = low + (high - low) // 2
        if arr[mid] == target:
            result_index = mid
            high = mid - 1
        elif arr[mid] > target:
            high = mid - 1
        else:
            low = mid + 1
    return result_index


def lastOccurrence(arr, target):
    low = 0
    high = len(arr) - 1
    result_index = -1
    while low <= high:
        mid = low + (high - low) // 2
        if arr[mid] == target:
            result_index = mid
            low = mid + 1
        elif arr[mid] > target:
            high = mid - 1
        else:
            low = mid + 1
    return result_index


print(firstOccurrence([1, 3, 5, 5, 5, 5, 67, 123, 125], 5))
print(lastOccurrence([1, 3, 5, 5, 5, 5, 67, 123, 125], 5))
