inter = 0
gremio = 0
empate = 0
numero_de_grenais = 1
while(True):
    gols_inter, gols_gremio = map(int, input().split(" "))
    if (gols_inter > gols_gremio):
        inter+=1
    elif (gols_inter == gols_gremio):
        empate+=1
    else:
        gremio+=1

    print("Novo grenal (1-sim 2-nao)")
    x = int(input())
    if(x==1):
        numero_de_grenais+=1
    if(x==2):
        break

print(f"{numero_de_grenais} grenais")
print(f"Inter:{inter}")
print(f"Gremio:{gremio}")
print(f"Empates:{empate}")

if(inter>gremio):
    print("Inter venceu mais")
if(inter<gremio):
    print("Gremio venceu mais")