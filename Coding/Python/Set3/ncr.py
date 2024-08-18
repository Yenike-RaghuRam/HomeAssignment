def factorial(num):
    result = 1
    for x in range(num, 1, -1):
        result *= x
    return result


def ncr(n, r):
    return factorial(n) // (factorial(n - r) * factorial(r))


print(ncr(5, 2))
print(ncr(3, 1))
