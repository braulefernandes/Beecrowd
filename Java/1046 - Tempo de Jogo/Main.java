import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio = input.nextInt();
        int fim = input.nextInt();

        int duracao = (fim - inicio + 24) % 24;
        if (duracao == 0) duracao = 24;

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        input.close();
    }
}
