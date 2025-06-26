total_dias = int(input())

anos = total_dias // 365
resto = total_dias % 365

meses = resto // 30
dias = resto % 30

print(f"{anos} ano(s)")
print(f"{meses} mes(es)")
print(f"{dias} dia(s)")