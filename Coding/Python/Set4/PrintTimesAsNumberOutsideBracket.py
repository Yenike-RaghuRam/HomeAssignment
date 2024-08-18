def print_times_number_outside(strs):
    stk = []
    result = ""
    for val in strs:
        if val != ']':
            stk.append(val)
        else:
            new_str = result
            while stk[-1] != '[':
                new_str = stk.pop() + new_str
            stk.pop()
            times = int(stk.pop())
            result = ""
            while times != 0:
                result += new_str
                times -= 1
    return result


print(print_times_number_outside("3[b2[ca]]"))
