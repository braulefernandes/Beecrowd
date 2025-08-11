import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 2; i <= N; i += 2) {
            System.out.println(i + "^2 = " + (i * i));
        }

        input.close();
    }
}