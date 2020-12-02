

class HashTable():

    def __init__(self, m):
        self.m = m
        self.table = [-1] * m

    def hash(self, s, i):
        raise NotImplementedError

    def insert(self, s):
        i = 0
        index = self.hash(s, i)
        while self.table[index] != -1:
            i += 1
            index = self.hash(s, i)
        self.table[index] = s

    def query(self, s):
        i = 0
        index = self.hash(s, i)
        while self.table[index] != s:
            i += 1
            index = self.hash(s, i)
        return index


class LinearHashTable(HashTable):

    def __init__(self, *args):
        super().__init__(*args)
    
    def hash(self, s, i):
        return (s % self.m + i) % self.m


class DoubleHashTable(HashTable):

    def __init__(self, *args):
        super().__init__(*args)
    
    def hash(self, s, i):
        return (s + i * (1 + (s % (self.m - 1)))) % self.m


def main():
    # Number of Konzerne
    t = int(input())
    m_arr = []
    s_arr = []
    n_arr = []

    # Loop Konzerne for input
    for _ in range(t):
        m, n, s = input().split(" ")
        m_arr.append(int(m))
        n = int(n)
        s_arr.append(int(s))

        n_arr_konzern = []
        for _ in range(n):
            n_arr_konzern.append(int(input()))
        n_arr.append(n_arr_konzern)

    # Loop Konzerne for output
    for i in range(t):
        # Create hash tables
        linear_table = LinearHashTable(m_arr[i])
        double_table = DoubleHashTable(m_arr[i])

        # Fill hash tables
        for s in n_arr[i]:
            linear_table.insert(s)
            double_table.insert(s)

        # Output index
        print(linear_table.query(s_arr[i]))
        print(double_table.query(s_arr[i]))


if __name__ == '__main__':
    main()