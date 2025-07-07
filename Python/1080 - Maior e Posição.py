maior = -1
posicao = 0

for i in range(1, 101):
    valor = int(input())
    if valor > maior:
        maior = valor
        posicao = i

print(maior)
print(posicao)