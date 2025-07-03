h1, m1, h2, m2 = map(int, input().split())

inicio = h1 * 60 + m1
fim = h2 * 60 + m2

duracao = (fim - inicio) if fim > inicio else (24 * 60 - inicio + fim)

horas = duracao // 60
minutos = duracao % 60

print(f"O JOGO DUROU {horas} HORA(S) E {minutos} MINUTO(S)")