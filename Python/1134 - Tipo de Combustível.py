alcool = 0
gasolina = 0
diesel = 0
tipo = 0

while tipo != 4:
    tipo = int(input())
    while tipo < 1 or tipo > 4:
        tipo = int(input())
    if tipo == 1:
        alcool += 1
    elif tipo == 2:
        gasolina += 1
    elif tipo == 3:
        diesel += 1

print("MUITO OBRIGADO")
print(f"Alcool: {alcool}")
print(f"Gasolina: {gasolina}")
print(f"Diesel: {diesel}")