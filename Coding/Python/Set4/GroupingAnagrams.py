def group_anagrams(strs_list):
    ascii_str_dict = {}
    for val in strs_list:
        ascii_val = 0
        for chrt in val:
            ascii_val += ord(chrt)
        if ascii_val in ascii_str_dict:
            ascii_str_dict.get(ascii_val).append(val)
        else:
            ascii_str_dict[ascii_val] = [val]
    return [x for x in ascii_str_dict.values()]


print(group_anagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
