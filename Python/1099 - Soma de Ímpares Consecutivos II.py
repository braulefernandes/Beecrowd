N = int(input())

for i in range(0, N):
    cont = 0
    a, b = map(int, input().split(" "))

    if a > b:
        aux = a
        a = b
        b = aux

    for j in range(a + 1, b):
        if j % 2 != 0:
            cont += j

    print(cont)