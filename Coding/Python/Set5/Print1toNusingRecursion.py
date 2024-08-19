def print_one_n(num):
    if num == 0:
        return
    print_one_n(num - 1)
    print(num, end=" ")


print_one_n(10)
