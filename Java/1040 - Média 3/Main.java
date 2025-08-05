import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double N1 = input.nextDouble();
        double N2 = input.nextDouble();
        double N3 = input.nextDouble();
        double N4 = input.nextDouble();

        double media = (N1 * 2 + N2 * 3 + N3 * 4 + N4) / 10;
        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double exame = input.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", exame);
            media = (media + exame) / 2;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", media);
        }

        input.close();
    }
}
