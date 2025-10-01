def sequencia():
    return sum(1 / x for x in range(1, 101))

print(f"{sequencia():.2f}")