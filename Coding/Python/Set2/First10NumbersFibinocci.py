def print_first_10_fibinnoci():
    fibi = [-1] * 10
    fibi[0] = 0
    fibi[1] = 1
    for num in range(2, 10):
        fibi[num] = fibi[num - 1] + fibi[num - 2]
    print(fibi)


print_first_10_fibinnoci()
