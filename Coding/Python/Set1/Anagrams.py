def anagrams(str1, str2):
    if len(str1) != len(str2):
        return False
    str1_ascii = 0
    str2_ascii = 0
    for val in str1:
        str1_ascii += ord(val)
    for val in str2:
        str2_ascii += ord(val)
    return str1_ascii == str2_ascii


print(anagrams("one", "neo"))
print(anagrams("one", "neb"))
