def sum_of_digits(num):
    sum = 0
    while num != 0:
        digit = num % 10
        sum += digit
        num //= 10
    return sum


print(sum_of_digits(99))
