
import numpy as np

a = np.array([10, 9, 0,1,2,3,4,5,6,7,8], dtype=np.int)
print("a", a)
n = len(a)

m = 0
for i in range(n):
    if m < a[i]:
        m = a[i]
print("m", m)

b = np.zeros((m + 1), dtype=np.int)
for i in range(n):
    b[a[i]] = b[a[i]] + 1
print("b", b)

c = np.empty((m + 1), dtype=np.int)
j = 0
for i in range(m + 1):
    while b[i] > 0:
        c[j] = i
        j += 1
        b[i] = b[i] - 1
print("c", c)
