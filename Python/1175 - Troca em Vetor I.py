N = [int(input()) for _ in range(20)]

for i in range(10):
    aux = N[i]
    N[i] = N[19 - i]
    N[19 - i] = aux

for i in range(20):
    print(f"N[{i}] = {N[i]}")