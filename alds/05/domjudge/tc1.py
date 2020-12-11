
import math

n, m = map(int, input().split(" "))

x = []
y = []
for _ in range(m):
    x_i, y_i = map(int, input().split(" "))
    x.append(x_i)
    y.append(y_i)


x_min, x_max = (min(x), max(x))
y_min, y_max = (min(y), max(y))

dist_min = m*(n + n)
min_idx = (-1, -1)

for Y in range(y_min, y_max + 1):
    for X in range(x_min, x_max + 1):
        dist = 0
        for x_i in x:
            for y_i in y:
                dist += abs(y_i - Y) + abs(x_i - X)
        if dist < dist_min:
            dist_min = dist
            min_idx = (X, Y)
 
print(min_idx[0], min_idx[1])