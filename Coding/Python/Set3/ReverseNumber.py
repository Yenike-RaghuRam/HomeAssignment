def reverse_number(num):
    result = 0
    while num != 0:
        digit = num % 10
        result = result * 10 + digit
        num //= 10
    return result


print(reverse_number(123))
