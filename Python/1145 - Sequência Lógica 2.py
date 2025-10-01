quebraLinha, fimSequencia = map(int, input().split())

def sequencia(n):
    if n % quebraLinha == 0:
        print(n)
    else:
        print(n, end=" ")

for i in range(1, fimSequencia + 1):
    sequencia(i)