
c = int(input())
k = int(input())
anrufe = [int(input()) for _ in range(c)]

i = 0
while i < len(anrufe):
    if anrufe[i] == 0:
        prev_anrufe_sorted = sorted(anrufe[:i])
        if len(prev_anrufe_sorted) < k:
            print(-1)
        else:
            print(sorted(prev_anrufe_sorted)[k-1])
        anrufe = prev_anrufe_sorted + anrufe[i+1:]
    i += 1
