while True:
    cont = 0
    a, b = map(int, input().split())

    if a <= 0 or b <= 0:
        break

    if a > b:
        a, b = b, a

    for i in range(a, b + 1):
        cont += i
        print(i, end=" ")
    
    print(f"Sum={cont}")
