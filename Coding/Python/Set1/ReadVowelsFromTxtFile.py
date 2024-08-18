with open("One.txt") as txt:
    vowels = ['a', 'e', 'i', 'o', 'u']
    for val in txt.read():
        if val.lower() in vowels:
            print(val)
