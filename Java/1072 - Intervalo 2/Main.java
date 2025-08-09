import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int dentro = 0, fora = 0;

        for (int i = 0; i < N; i++) {
            int x = input.nextInt();
            if (x >= 10 && x <= 20) dentro++;
            else fora++;
        }

        System.out.println(dentro + " in");
        System.out.println(fora + " out");

        input.close();
    }
}