while(True):
    N = int(input())

    if (N == 0):
        break

    else:
        for i in range (1,N+1):
            if(i!=N):
                print(f"{i}", end=" ")
            else:
                print(f"{i}")