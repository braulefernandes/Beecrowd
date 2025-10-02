N = int(input())

while (N!=0):
    somatorio = 0
    a, b = map(int, input().split())

    if (a%2==0):
        for i in range (a+1,(a+2*b)+1,2):
            somatorio+=i

    else:
        for i in range (a,(a+2*b),2):
            somatorio+=i

    N-=1
    print(somatorio)