def sequencia():
    return 1 + sum(x / (2 ** (i + 1)) for i, x in enumerate(range(3, 40, 2)))

print(f"{sequencia():.2f}")