import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] lados = {input.nextDouble(), input.nextDouble(), input.nextDouble()};
        Arrays.sort(lados);

        double A = lados[2], B = lados[1], C = lados[0];

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == B * B + C * C) System.out.println("TRIANGULO RETANGULO");
            if (A * A > B * B + C * C) System.out.println("TRIANGULO OBTUSANGULO");
            if (A * A < B * B + C * C) System.out.println("TRIANGULO ACUTANGULO");
            if (A == B && B == C) System.out.println("TRIANGULO EQUILATERO");
            else if (A == B || B == C || A == C) System.out.println("TRIANGULO ISOSCELES");
        }

        input.close();
    }
}
