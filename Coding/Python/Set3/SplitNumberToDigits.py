def split_number_digits(num):
    result = []
    while num != 0:
        digit = num % 10
        result.insert(0, digit)
        num //= 10
    return result


print(split_number_digits(100))
print(split_number_digits(101))
print(split_number_digits(1))

