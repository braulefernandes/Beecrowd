import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int h1 = input.nextInt();
        int m1 = input.nextInt();
        int h2 = input.nextInt();
        int m2 = input.nextInt();

        int inicio = h1 * 60 + m1;
        int fim = h2 * 60 + m2;

        int duracao = fim - inicio;
        if (duracao <= 0) duracao += 24 * 60;

        int horas = duracao / 60;
        int minutos = duracao % 60;

        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");

        input.close();
    }
}
