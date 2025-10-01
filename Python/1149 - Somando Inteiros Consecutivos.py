valores = list(map(int, input().split()))
A = valores[0]

for N in valores[1:]:
    if N > 0:
        break

soma = sum(A + i for i in range(N))
print(soma)