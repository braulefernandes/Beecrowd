N1, N2, N3, N4 = map(float, input().split())

media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10

print(f"Media: {media:.1f}")

if media >= 7.0:
    print("Aluno aprovado.")
elif media < 5.0:
    print("Aluno reprovado.")
else:
    print("Aluno em exame.")
    N5 = float(input())
    print(f"Nota do exame: {N5:.1f}")
    nova_media = (media + N5) / 2
    if nova_media >= 5.0:
        print("Aluno aprovado.")
    else:
        print("Aluno reprovado.")
    print(f"Media final: {nova_media:.1f}")
