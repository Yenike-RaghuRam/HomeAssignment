def is_palindrome(num, temp, orig_num):
    if num == 0:
        return temp == orig_num
    return is_palindrome(num // 10, temp * 10 + num % 10, orig_num)


print(is_palindrome(101, 0, 101))
print(is_palindrome(100, 0, 100))
