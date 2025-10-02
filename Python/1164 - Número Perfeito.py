N = int(input())

for _ in range(N):
    x = int(input())
    soma = 0
    for y in range(1, x):
        if x % y == 0:
            soma += y
    if soma == x:
        print(f"{x} eh perfeito")
    else:
        print(f"{x} nao eh perfeito")