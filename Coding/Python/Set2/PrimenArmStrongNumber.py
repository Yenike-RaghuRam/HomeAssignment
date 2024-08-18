import math


def prime_num(num):
    if num == 2:
        return True
    for divi in range(3, int(math.sqrt(num)) + 1):
        if num % divi == 0:
            return False
    return True


print(prime_num(5))
print(prime_num(25))


def armstrong_num(num):
    num_str = str(num)
    orig_num = num
    temp_num = 0
    while num != 0:
        digit = num % 10
        temp_num += int(math.pow(digit, len(num_str)))
        num = math.floor(num/10)
    return orig_num == temp_num


print(armstrong_num(153))
print(armstrong_num(111))
