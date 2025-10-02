while (True):
    somatorio = 0
    a = int(input())
    if (a==0):
        break

    elif (a%2==0):
        for i in range (a,a+10-1,2):
            somatorio+=i

    else:
        for i in range (a+1,a+10,2):
            somatorio+=i

    print(somatorio)