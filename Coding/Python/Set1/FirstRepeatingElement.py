def first_repeating(arr):
    temp_set = set()
    for val in arr:
        if val in temp_set:
            return val
        temp_set.add(val)

print(first_repeating([1, 2, 3, 3, 3, 6, 6]))
print(first_repeating([1, 6, 2, 3, 3, 3, 6, 6]))

