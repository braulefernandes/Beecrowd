import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            double A = input.nextDouble();
            double B = input.nextDouble();
            double C = input.nextDouble();

            double media = (A * 2 + B * 3 + C * 5) / 10;

            System.out.printf("%.1f%n", media);
        }

        input.close();
    }
}