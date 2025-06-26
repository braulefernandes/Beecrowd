N = int(input())

for _ in range(N):
    linha = input()

    primeira_passagem = ""
    for c in linha:
        if c.isalpha():
            primeira_passagem += chr(ord(c) + 3)
        else:
            primeira_passagem += c

    segunda_passagem = primeira_passagem[::-1]

    metade = len(segunda_passagem) // 2
    resultado = ""
    for i in range(len(segunda_passagem)):
        if i >= metade:
            resultado += chr(ord(segunda_passagem[i]) - 1)
        else:
            resultado += segunda_passagem[i]

    print(resultado)