import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int Y = input.nextInt();

        int soma = 0;

        int inicio = Math.min(X, Y) + 1;
        int fim = Math.max(X, Y);

        for (int i = inicio; i < fim; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);

        input.close();
    }
}