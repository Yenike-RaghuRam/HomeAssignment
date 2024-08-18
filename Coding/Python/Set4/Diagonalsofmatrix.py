def diagonal_matrix(arrs):
    for idx in range(len(arrs)):
        print(arrs[idx][idx], end=" ")


two_d_arr = [[None for _ in range(4)] for _ in range(4)]
vals = [1, 2, 3, 4, 4, 3, 2, 1, 7, 8, 9, 6, 6, 5, 4, 3]
vals_index = 0
for row in range(len(two_d_arr)):
    for col in range(len(two_d_arr[0])):
        two_d_arr[row][col] = vals[vals_index]
        vals_index += 1
diagonal_matrix(two_d_arr)



