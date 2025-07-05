valores = [int(input()) for _ in range(5)]
pares = sum(1 for v in valores if v % 2 == 0)
print(f"{pares} valores pares")