def remove_consecutive_duplicates_string(strs):
    result = ""
    result += strs[0]
    prev_idx_repeated = 0
    for idx in range(len(strs)):
        if strs[idx] != strs[prev_idx_repeated]:
            result += strs[idx]
            prev_idx_repeated = idx
    return result


print(remove_consecutive_duplicates_string("aabccba"))
