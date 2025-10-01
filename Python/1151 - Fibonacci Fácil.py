N = int(input())
ante, atual = 0, 1

for i in range(1, N + 1):
    if i == N:
        print(ante)
    else:
        print(ante, end=" ")
    prox = ante + atual
    ante, atual = atual, prox