x = [0] * 10
x[0] = int(input())

for i in range(1, 10):
    x[i] = x[i-1] * 2

for i in range(10):
    print(f"N[{i}] = {x[i]}")