
n, m = map(int, input().split(" "))
x = []
y = []

for _ in range(m):
    x_i, y_i = map(int, input().split(" "))
    x.append(x_i)
    y.append(y_i)

x.sort()
y.sort()

if m % 2 == 0:
    idx = int(m/2)
else:
    idx = int((m-1)/2)

print(x[idx], y[idx])
