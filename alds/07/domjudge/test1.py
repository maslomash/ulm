
n, m = map(int, input().split(" "))

mat = [[-1]*n]*n

for _ in range(m):
    u, v, w = map(int, input().split(" "))
    mat[u][v] = w

for i in range(1, n):
    