dia_inicio = int(input().split()[1])
h_inicio, m_inicio, s_inicio = map(int, input().split(" : "))

dia_fim = int(input().split()[1])
h_fim, m_fim, s_fim = map(int, input().split(" : "))

segundos_inicio = dia_inicio * 86400 + h_inicio * 3600 + m_inicio * 60 + s_inicio
segundos_fim = dia_fim * 86400 + h_fim * 3600 + m_fim * 60 + s_fim

duracao = segundos_fim - segundos_inicio

dias = duracao // 86400
duracao %= 86400

horas = duracao // 3600
duracao %= 3600

minutos = duracao // 60
segundos = duracao % 60

print(f"{dias} dia(s)")
print(f"{horas} hora(s)")
print(f"{minutos} minuto(s)")
print(f"{segundos} segundo(s)")