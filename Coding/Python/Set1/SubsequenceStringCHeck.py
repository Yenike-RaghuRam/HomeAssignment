def is_sub_sequence(str1, str2):
    if len(str1) > len(str2):
        return False
    str2_index = len(str2) - 1
    str1_index = len(str1) - 1
    while str2_index >= 0 and str1_index >=0:
        if str1[str1_index] == str2[str2_index]:
            str1_index -= 1
        str2_index -= 1
    return str1_index < 0


print(is_sub_sequence("aa", "bacdaze"))