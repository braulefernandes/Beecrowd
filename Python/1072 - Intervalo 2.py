n = int(input())
valores = [int(input()) for _ in range(n)]

in_intervalo = sum(1 for v in valores if 10 <= v <= 20)
out_intervalo = n - in_intervalo

print(f"{in_intervalo} in")
print(f"{out_intervalo} out")