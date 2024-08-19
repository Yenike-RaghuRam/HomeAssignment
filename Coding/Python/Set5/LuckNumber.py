def helper(num_pos, counter):
    if counter > num_pos:
        return True
    if num_pos % counter == 0:
        return False
    num_pos = num_pos - (num_pos // counter)
    return helper(num_pos, counter + 1)


def is_lucky_number(num):
    return helper(num, 2)


print(is_lucky_number(13))
print(is_lucky_number(5))
