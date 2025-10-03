A = [float(input()) for _ in range(100)]

for i in range(100):
    if A[i] <= 10:
        print(f"A[{i}] = {A[i]:.1f}")