
import heapq

c = int(input())
k = int(input())

heap = []
print_vals = []

for i in range(c):
    val = int(input())
    if val == 0:
        if len(heap) < k:
            print_vals.append(-1)
        else:
            print_vals.append(heap[-1])
    else:
        if len(heap) < k:
            heapq.heappush(heap, val)
        else:
            heap = heap[:-1]
            heapq.heappush(heap, val)

for val in print_vals: print(val)
