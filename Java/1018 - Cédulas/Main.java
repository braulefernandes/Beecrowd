import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        System.out.println(N);

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        for (int nota : notas) {
            int qtd = N / nota;
            System.out.println(qtd + " nota(s) de R$ " + nota + ",00");
            N %= nota;
        }

        input.close();
    }
}