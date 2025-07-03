a,b,c = map(float,input().split(" "))

if (a+b>c and a+c>b and b+c>a):
    d = a+b+c
    print(f"Perimetro = {d:.1f}")

else:
    d = ((a+b)*c)/2
    print(f"Area = {d:.1f}")