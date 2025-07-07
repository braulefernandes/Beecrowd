N = int(input())

for _ in range(N):
    x = int(input())
    
    if x == 0:
        print("NULL")
    else:
        tipo = "EVEN" if x % 2 == 0 else "ODD"
        sinal = "POSITIVE" if x > 0 else "NEGATIVE"
        print(f"{tipo} {sinal}")