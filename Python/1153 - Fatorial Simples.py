def fatorial(valor):
    resultado = 1
    for i in range(1, valor + 1):
        resultado *= i
    return resultado

valor = int(input())
print(fatorial(valor))