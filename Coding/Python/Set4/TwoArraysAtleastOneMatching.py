def check_atleast_one_matching_number(arr1, arr2):
    temp_set = set()
    for val in arr2:
        temp_set.add(val)
    for val in arr1:
        if val in temp_set:
            return True
    return False


print(check_atleast_one_matching_number([1, 3, 1, 4, 9, 5, 2], [2, 1, 3, 4, 10]))
print(check_atleast_one_matching_number([1, 3, 1, 4, 9, 5, 2], [6, 7]))
