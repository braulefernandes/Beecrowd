positivos = []
for i in range(6):
    valor = float(input())
    if valor > 0:
        positivos.append(valor)

quantidade = len(positivos)
media = sum(positivos) / quantidade

print(f"{quantidade} valores positivos")
print(f"{media:.1f}")
