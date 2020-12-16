
count = 8

func1 = lambda x: count - x 
func2 = lambda x: (count - x)**2
func3 = lambda x: 2**(count - x)
func4 = lambda x: -4 * (count - x)

func = func4

g1 = 0
g2 = 0

g1 += func(1)
print(1, func(1), g1, g2)

gauner1_active = False
j = 0
for i in range(2, count):
    if j == 1:
        j = 0
        if gauner1_active:
            g1 += func(i) + func(i-1)
            print(i, func(i), g1, g2)
        else:
            g2 += func(i) + func(i-1)
            print(i, func(i), g1, g2)
        gauner1_active = gauner1_active == False
    else:
        j += 1

g1 += func(count)
print("n", func(count), g1, g2)
print(f"diff g1-g2={g1-g2}")