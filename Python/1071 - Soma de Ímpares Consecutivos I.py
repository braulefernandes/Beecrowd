x = int(input())
y = int(input())

inicio = min(x, y) + 1
fim = max(x, y)

soma = sum(i for i in range(inicio, fim) if i % 2 != 0)
print(soma)