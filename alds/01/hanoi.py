
n_tests = []
k_tests = []

# Einlesen der testcases und zugehörigem n, k
test_count = int(input())
for test in range(test_count):
    n, k = input().split(" ")
    n_tests.append(int(n))
    k_tests.append(int(k))


def decide(disk, source, dest):
    global n, k, stacks
    if k <= 2**(disk-1) - 1:
        stacks[source].append(disk)
        dest = new_stack(source, dest)
    else:
        stacks[dest].append(disk)
        k -= 2**(disk-1)
        source = new_stack(source, dest)

    disk -= 1
    if disk > 0: 
        return decide(disk, source, dest)


def new_stack(source, dest):
    for i in range(3):
        if i not in [source, dest]:
            return i


def print_stack():
    global stacks
    stacks_str = [[str(ele) for ele in stack] for stack in stacks]
    print(f"1: {'|'.join(stacks_str[0])}")
    print(f"2: {'|'.join(stacks_str[1])}")
    print(f"3: {'|'.join(stacks_str[2])}")


# Alle testcases durchiterieren
for test in range(test_count):
    n = n_tests[test]
    k = k_tests[test]
    stacks = [[], [], []]

    decide(n, 0, 1)

    print_stack()
