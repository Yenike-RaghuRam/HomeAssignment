def add_two_numbers(num1, num2):
    while num2 != 0:
        carry = num1 & num2
        num1 = num1 ^ num2
        num2 = carry

    return num1


print(add_two_numbers(1, 2))
