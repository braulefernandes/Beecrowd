renda = float(input())

imposto = 0.0

if renda <= 2000.00:
    print("Isento")
else:
    if renda > 2000.00:
        valor = min(renda, 3000.00) - 2000.00
        imposto += valor * 0.08
    if renda > 3000.00:
        valor = min(renda, 4500.00) - 3000.00
        imposto += valor * 0.18
    if renda > 4500.00:
        valor = renda - 4500.00
        imposto += valor * 0.28

    print(f"R$ {imposto:.2f}")