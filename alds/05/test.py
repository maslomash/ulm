
# import numpy as np

# string1 = "test"
# string2 = "test"

# string1 = " " + string1
# string2 = " " + string2

# n = len(string1)
# m = len(string2)

# mat = np.matrix(np.zeros((n, m), dtype=np.uint16))

# for i in range(n):
#     for j in range(m):
#         if i == 0 or j == 0:
#             continue
#         elif string1[i] == string2[j]:
#             mat[i, j] = mat[i-1, j-1] + 1
#         elif string1[i] != string2[j]:
#             mat[i, j] = max((mat[i-1, j], mat[i, j-1]))

# print(mat[-1,-1])
# print(mat)


arr = [1,2,3,4,5,10,78,10241]
n = len(arr)

out = []
for i in range(n):
    s = 0
    for j in range(n):
        s += abs(arr[i] - arr[j])
    out.append(s)

print(out)