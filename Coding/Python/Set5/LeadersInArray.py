def leaders_in_array(arrs):
    leader = [arrs[-1]]
    curr_leader = arrs[-1]
    for idx in range(len(arrs) - 2, -1, -1):
        if arrs[idx] > curr_leader:
            leader.insert(0, arrs[idx])
            curr_leader = arrs[idx]
    return leader


print(leaders_in_array([16, 17, 4, 3, 5, 2]))
