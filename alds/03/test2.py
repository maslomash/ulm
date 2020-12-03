
a = [5]

def gau(a):
    n = len(a)
    gau = 0
    for i in range(n-1):
        for j in range(i+1, n):
            if a[j] < a[i]:
                gau += 1
    return gau

print(gau(a))
