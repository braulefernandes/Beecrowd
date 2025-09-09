cont = 0
a = int(input())
b = int(input())

if a > b:
    a, b = b, a

for i in range(a, b + 1):
    if i % 13 != 0:
        cont += i

print(cont)