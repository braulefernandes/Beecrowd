numero_repeticoes = int(input())

for n in range(1, numero_repeticoes + 1):
    print(f"{n} {n*n} {n*n*n}")
    print(f"{n} {n*n + 1} {n*n*n + 1}")