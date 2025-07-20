import java.util.Scanner;

public class Main {
    public static int mdc(int a, int b) {
        return b == 0 ? a : mdc(b, a % b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            int n1 = input.nextInt();
            String op1 = input.next();
            int d1 = input.nextInt();
            String operador = input.next();
            int n2 = input.nextInt();
            String op2 = input.next();
            int d2 = input.nextInt();

            int num = 0, den = 0;

            if (operador.equals("+")) {
                num = n1 * d2 + n2 * d1;
                den = d1 * d2;
            } else if (operador.equals("-")) {
                num = n1 * d2 - n2 * d1;
                den = d1 * d2;
            } else if (operador.equals("*")) {
                num = n1 * n2;
                den = d1 * d2;
            } else if (operador.equals("/")) {
                num = n1 * d2;
                den = n2 * d1;
            }

            int mdc = mdc(Math.abs(num), Math.abs(den));
            System.out.printf("%d/%d = %d/%d%n", num, den, num / mdc, den / mdc);
        }

        input.close();
    }
}