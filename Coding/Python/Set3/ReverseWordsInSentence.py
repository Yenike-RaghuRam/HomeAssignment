def reverse_words_sentence(strs):
    result = ""
    words = strs.split(" ")
    for idx in range(len(words) - 1, -1, -1):
        if idx != 0:
            result += words[idx] + " "
        else:
            result += words[idx]
    return result


print(reverse_words_sentence("geeks quiz practice code"))
