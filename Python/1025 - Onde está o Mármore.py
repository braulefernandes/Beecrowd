caso = 0
while True:
    entrada = input().strip()
    if not entrada:
        continue

    N, Q = map(int, entrada.split())

    if N == 0 and Q == 0:
        break

    marmores = []
    for _ in range(N):
        marmores.append(int(input().strip()))
    marmores.sort()

    caso += 1
    print(f"CASE# {caso}:")

    for _ in range(Q):
        consulta = int(input().strip())

        inicio, fim = 0, len(marmores)
        while inicio < fim:
            meio = (inicio + fim) // 2
            if marmores[meio] < consulta:
                inicio = meio + 1
            else:
                fim = meio

        if inicio >= len(marmores) or marmores[inicio] != consulta:
            print(f"{consulta} not found")
        else:
            print(f"{consulta} found at {inicio + 1}")
