valores = []
while True:
    tentativa = float(input())
    if tentativa <= 0:
        break
    valores.append(tentativa)

media = sum(valores) / len(valores)
print(f"{media:.2f}")