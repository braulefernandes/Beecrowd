X = int(input())
Z = int(input())

while Z <= X:
    Z = int(input())

soma = X
cont = 1
while soma <= Z:
    X += 1
    soma += X
    cont += 1

print(cont)