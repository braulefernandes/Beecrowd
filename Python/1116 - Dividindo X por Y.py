N = int(input())
for i in range (1, N+1):
    x,y = map(int,input().split(" "))
    if(y==0):
        print("divisao impossivel")
    else:
        print(f"{x/y}")