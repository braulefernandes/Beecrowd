import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tempo = input.nextInt();
        int velocidade = input.nextInt();

        double litros = (tempo * velocidade) / 12.0;

        System.out.printf("%.3f%n", litros);

        input.close();
    }
}
