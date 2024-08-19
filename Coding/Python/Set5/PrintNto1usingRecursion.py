def print_n_one(num):
    if num == 0:
        return
    print(num, end=" ")
    print_n_one(num - 1)


print_n_one(10)
