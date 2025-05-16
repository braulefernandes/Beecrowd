P1,NP1,VUP1 = map(float,input().split( ))
P2,NP2,VUP2 = map(float,input().split( ))

soma1 = NP1*VUP1
soma2 = NP2*VUP2
somatotal = soma1 + soma2

print(f"VALOR A PAGAR: R$ {somatotal:.2f}")