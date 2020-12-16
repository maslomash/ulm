
# arr = [1,3,4,5,6,7,8,9]
# arr = [100,101,102,103,104,105,106,107,108,109,9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
arr = [19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0]
# arr = [0,1,2,3,4,5,6,7,8,9]

def bubble_sort(arr):
    switched = True
    n = 0
    while switched:
        switched = False
        for i in range(len(arr) - 1):
            n += 1
            if arr[i] > arr[i+1]:
                arr[i], arr[i+1] = (arr[i+1], arr[i])
                switched = True

    return arr

def selection_sort1(arr):
    n = len(arr)

    count = 0
    max_val = -1
    for i in range(n):
        count += 1
        if arr[i] > max_val:
            max_val = arr[i]
    
    out = [-1] * n
    for i in range(n):
        min_val = max_val + 1
        for j in range(n):
            count += 1
            if arr[j] < min_val:
                min_val = arr[j]
                min_idx = j

        arr[min_idx] = max_val + 1
        out[i] = min_val

    print(count)
    return out

def selection_sort2(arr):
    n = len(arr)
    count = 0

    out = [-1] * n
    for i in range(n):
        min_idx = 0
        min_val = arr[0]

        for j in range(n-i):
            count += 1
            if arr[j] < min_val:
                min_val = arr[j]
                min_idx = j

        out[i] = arr.pop(min_idx)

    print(count)
    return out

print("Input: ", arr)
print("Output: ", selection_sort2(arr))