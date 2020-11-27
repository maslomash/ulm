
# import numpy as np

m = int(input())

l = []
p_start = []
p_end = []
for _ in range(m):
    l.append(int(input()))
    p_start_str = input()
    p_end_str = input()
    p_start.append([int(ele) for ele in p_start_str.split(" ")])
    p_end.append([int(ele) for ele in p_end_str.split(" ")])

# m = 1
# l = [40000]
# p_start = [[ele for ele in range(l[0])]]
# p_end = [reversed(p_start[0])]

# def bubbleSort(arr): 
#     n = len(arr) 
#     count = 0
#     for i in range(n-1):
#         for j in range(0, n-i-1):
#             if arr[j] > arr[j+1] : 
#                 arr[j], arr[j+1] = arr[j+1], arr[j] 
#                 count += 1
#     return count

def gau(arr):
    gau = 0
    n = len(arr)
    for i in range(n-1):
        for j in range(i+1, n):
            if arr[i] > arr[j]:
                gau += 1
    return gau

# def gau(arr):
#     gau = 0
#     n = len(arr)
#     arr = np.array(arr)

#     for i in range(n-1):
#         test = arr[i] > arr[i+1:]
#         gau += np.sum(test)

#     return gau

for m_curr in range(m):
    l_curr = l[m_curr]
    p_start_curr = p_start[m_curr]
    p_end_curr = p_end[m_curr]

    rank_for_num = [0] * (max(p_end_curr) + 1)
    for rank, num_end in enumerate(p_end_curr):
        rank_for_num[num_end] = rank

    start_ranks = [rank_for_num[num_start] for num_start in p_start_curr]

    print(gau(start_ranks))
