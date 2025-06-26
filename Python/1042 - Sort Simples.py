a, b, c = map(int,input().split(" "))

vetor = [a, b, c]

vetor_ordenado = sorted(vetor)

for i in range(3):
    print(vetor_ordenado[i])

print()

for i in range(3):
    print(vetor[i])