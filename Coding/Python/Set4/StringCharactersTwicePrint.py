def print_string_characters_twice(strs):
    new_str = ""
    for val in strs:
        new_str += val + val
    print(new_str)


print_string_characters_twice("welcome")
