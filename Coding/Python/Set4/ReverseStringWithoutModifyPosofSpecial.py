def reverse_without_modify_pos_special(strs):
    str_lis = list(strs)
    start_index = 0
    end_index = len(str_lis) - 1
    while start_index < end_index:
        if not strs[start_index].isalnum():
            start_index += 1
        elif not strs[end_index].isalnum():
            end_index -= 1
        else:
            temp = str_lis[start_index]
            str_lis[start_index] = str_lis[end_index]
            str_lis[end_index] = temp
            start_index += 1
            end_index -= 1
    return "".join(str_lis)


print(reverse_without_modify_pos_special("Hello@1a"))
