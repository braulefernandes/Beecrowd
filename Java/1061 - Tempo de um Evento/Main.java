import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.next(); // "Dia"
        int dia1 = input.nextInt();

        int h1 = input.nextInt();
        input.next(); // :
        int m1 = input.nextInt();
        input.next(); // :
        int s1 = input.nextInt();

        input.next(); // "Dia"
        int dia2 = input.nextInt();

        int h2 = input.nextInt();
        input.next(); // :
        int m2 = input.nextInt();
        input.next(); // :
        int s2 = input.nextInt();

        int inicio = dia1 * 86400 + h1 * 3600 + m1 * 60 + s1;
        int fim = dia2 * 86400 + h2 * 3600 + m2 * 60 + s2;

        int duracao = fim - inicio;

        int dias = duracao / 86400;
        duracao %= 86400;

        int horas = duracao / 3600;
        duracao %= 3600;

        int minutos = duracao / 60;
        int segundos = duracao % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        input.close();
    }
}
