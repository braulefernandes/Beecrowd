i = 0.0
while i <= 2.0 + 1e-9:
    for j in range(1, 4):
        if abs(i - round(i)) < 1e-9:
            print(f"I={i:.0f} J={j + i:.0f}")
        else:
            print(f"I={i:.1f} J={j + i:.1f}")
    i += 0.2
