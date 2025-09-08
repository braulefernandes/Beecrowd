cont = 0
aux = 0

while True:
    nota = float(input())
    if 0 <= nota <= 10:
        aux += nota
        cont += 1
        if cont == 2:
            media = aux / 2
            print(f"media = {media:.2f}")
            while True:
                print("novo calculo (1-sim 2-nao)")
                x = int(input())
                if x == 1:
                    cont = 0
                    aux = 0
                    break
                elif x == 2:
                    exit()
    else:
        print("nota invalida")