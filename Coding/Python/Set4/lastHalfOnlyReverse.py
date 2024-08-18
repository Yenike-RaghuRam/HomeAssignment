def reverse_second_half_only(strs):
    str_lis = list(strs)
    length = len(strs)
    if length % 2 == 0:
        mid = length // 2
        newstr = "".join(str_lis[:mid])
        start = mid
        end = len(strs) - 1
        while start < end:
            temp = str_lis[start]
            str_lis[start] = str_lis[end]
            str_lis[end] = temp
            start += 1
            end -= 1
        newstr += "".join(str_lis[mid:])
    else:
        mid = length // 2
        newstr = "".join(str_lis[:mid + 1])
        start = mid + 1
        end = len(strs) - 1
        while start < end:
            temp = str_lis[start]
            str_lis[start] = str_lis[end]
            str_lis[end] = temp
            start += 1
            end -= 1
        newstr += "".join(str_lis[mid+1:])

    return newstr


print(reverse_second_half_only("1234"))
print(reverse_second_half_only("12345"))

