a, b, c = map(int, input().split())

maiorAB = int((a + b + abs(a-b))/2)

if (maiorAB > c):
    print(f"{maiorAB} eh o maior")
else:
    print(f"{c} eh o maior")