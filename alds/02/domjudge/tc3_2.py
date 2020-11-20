
class MaxHeap:
    def __init__(self, heap): 
        self.size = len(heap) 
        self.Heap = heap

    def leftChild(self, pos):
        lef = 2 * pos + 1
        if lef <= (self.size - 1):
            return lef

    def rightChild(self, pos): 
        rig = 2 * pos + 2
        if rig <= (self.size - 1):
            return rig
  
    def swap(self, fpos, spos): 
        self.Heap[fpos], self.Heap[spos] = (self.Heap[spos], self.Heap[fpos])

    @property
    def root(self):
        return self.Heap[0]

    def replaceRoot(self, val):
        pos = 0
        self.Heap[pos] = val
        self.siftDown(pos)

    def siftDown(self, pos):
        pos_val = self.Heap[pos]

        lef = self.leftChild(pos)
        if lef:
            lef_val = self.Heap[lef]

            rig =  self.rightChild(pos)
            if rig:
                rig_val = self.Heap[rig]

                if lef_val > rig_val:
                    if pos_val < lef_val:
                        self.swap(pos, lef)
                        self.siftDown(lef)
                else:
                    if pos_val < rig_val:
                        self.swap(pos, rig)
                        self.siftDown(rig)
            else:
                if pos_val < lef_val:
                    self.swap(pos, lef)

    @classmethod
    def heapify(cls, arr):
        obj = cls(arr)
        pos = (obj.size // 2) - 1

        while pos >= 0:
            obj.siftDown(pos)
            pos -= 1

        return obj


if __name__ == '__main__':

    c = int(input())
    k = int(input())

    arr = []
    print_vals = []

    valid_calls = 0
    test_calls = 0
    while valid_calls < k:
        val = int(input())
        if val == 0:
            print_vals.append(-1)
            test_calls += 1
        else:
            arr.append(val)
            valid_calls += 1

    heap = MaxHeap.heapify(arr)

    total_calls = test_calls + valid_calls
    for _ in range(c-total_calls):
        val = int(input())
        if val == 0:
            print_vals.append(heap.root)
        else:
            if val < heap.root:
                heap.replaceRoot(val)


    for val in print_vals: print(val)
