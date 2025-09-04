while(True):
    x,y = map(int,input().split(" "))
    if(x!=y and x>y):
        print("Decrescente")
    elif(x!=y and x<y):
        print("Crescente")
    else:
        break