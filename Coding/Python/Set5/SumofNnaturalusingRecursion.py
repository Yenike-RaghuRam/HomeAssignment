def sum_of_n(num):
    if num == 0:
        return 0
    return num + sum_of_n(num - 1)


print(sum_of_n(5))
