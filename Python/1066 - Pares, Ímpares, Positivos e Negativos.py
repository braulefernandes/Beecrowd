valores = [int(input()) for _ in range(5)]

pares = sum(1 for v in valores if v % 2 == 0)
impares = sum(1 for v in valores if v % 2 != 0)
positivos = sum(1 for v in valores if v > 0)
negativos = sum(1 for v in valores if v < 0)

print(f"{pares} valor(es) par(es)")
print(f"{impares} valor(es) impar(es)")
print(f"{positivos} valor(es) positivo(s)")
print(f"{negativos} valor(es) negativo(s)")