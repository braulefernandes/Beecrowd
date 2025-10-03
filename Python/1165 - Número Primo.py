def primo(n):
    if n <= 1:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True


def verifica_primo(valores):
    for n in valores:
        if primo(n):
            print(f"{n} eh primo")
        else:
            print(f"{n} nao eh primo")

repeticoes = int(input())
valores = [int(input()) for _ in range(repeticoes)]
verifica_primo(valores)