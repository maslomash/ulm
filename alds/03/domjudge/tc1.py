
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


def bubbleSort(arr): 
    n = len(arr) 
    count = 0
    for i in range(n-1):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1] : 
                arr[j], arr[j+1] = arr[j+1], arr[j] 
                count += 1
    return count

for m_curr in range(m):
    ranks = []
    for num_start in p_start[m_curr]:
        for rank in range(len(p_end[m_curr])):
            if num_start == p_end[m_curr][rank]:
                ranks.append(rank)
                break

    print(bubbleSort(ranks))
