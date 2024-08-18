import math


def perfect_number(num):
    sum_divisors = 1
    for val in range(2, int(math.sqrt(num)) + 1):
        if num % val == 0:
            sum_divisors += val
            sum_divisors += num//val
    return num == sum_divisors


print(perfect_number(8))
