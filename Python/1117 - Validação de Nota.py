cont = 0
aux = 0

while True:
    nota = float(input())
    if 0 <= nota <= 10:
        aux += nota
        cont += 1
        if cont == 2:
            media = aux / 2
            print(f"media = {media}")
            break
    else:
        print("nota invalida")