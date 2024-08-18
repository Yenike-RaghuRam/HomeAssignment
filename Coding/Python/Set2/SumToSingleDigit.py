def sum_single_digit(num):
    while num > 9:
        sums = 0
        while num != 0:
            digit = num % 10
            sums += digit
            num //= 10
        num = sums
    return num


print(sum_single_digit(9))
print(sum_single_digit(11))
print(sum_single_digit(101))
print(sum_single_digit(111))


