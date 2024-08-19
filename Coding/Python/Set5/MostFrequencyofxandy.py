def element_more_frequency_x_y(arrs, x, y):
    freq_x = 0
    freq_y = 0
    for val in arrs:
        if val == x:
            freq_x += 1
        elif val == y:
            freq_y += 1
    if freq_x > freq_y:
        return x
    elif freq_x < freq_y:
        return y
    else:
        return min(x, y)


print(element_more_frequency_x_y([1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5], 4, 5))
