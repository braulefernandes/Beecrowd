def mdc(a, b):
    while b:
        a, b = b, a % b
    return a

N = int(input())

for _ in range(N):
    entrada = input().split()
    n1 = int(entrada[0])
    d1 = int(entrada[2])
    op = entrada[3]
    n2 = int(entrada[4])
    d2 = int(entrada[6])

    if op == '+':
        num = n1 * d2 + n2 * d1
        den = d1 * d2
    elif op == '-':
        num = n1 * d2 - n2 * d1
        den = d1 * d2
    elif op == '*':
        num = n1 * n2
        den = d1 * d2
    elif op == '/':
        num = n1 * d2
        den = n2 * d1

    divisor = mdc(abs(num), abs(den))
    num_simpl = num // divisor
    den_simpl = den // divisor

    print(f"{num}/{den} = {num_simpl}/{den_simpl}")