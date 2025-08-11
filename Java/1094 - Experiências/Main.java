import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int total = 0;
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;

        for (int i = 0; i < N; i++) {
            int quantidade = input.nextInt();
            String tipo = input.next();

            total += quantidade;

            if (tipo.equals("C")) {
                coelhos += quantidade;
            } else if (tipo.equals("R")) {
                ratos += quantidade;
            } else if (tipo.equals("S")) {
                sapos += quantidade;
            }
        }

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);

        System.out.printf("Percentual de coelhos: %.2f %%\n", (coelhos * 100.0) / total);
        System.out.printf("Percentual de ratos: %.2f %%\n", (ratos * 100.0) / total);
        System.out.printf("Percentual de sapos: %.2f %%\n", (sapos * 100.0) / total);

        input.close();
    }
}