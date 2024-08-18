def remove_leading_zeroes(strs):
    newstr = ""
    for idx in range(len(strs)):
        if strs[idx] != "0":
            break
    for newidx in range(idx, len(strs)):
        newstr += strs[newidx]

    return newstr


print(remove_leading_zeroes("0000012345"))
print(remove_leading_zeroes("0000010005"))

