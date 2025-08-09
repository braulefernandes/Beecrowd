import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int count = 0;

        while (count < 6) {
            if (X % 2 != 0) {
                System.out.println(X);
                count++;
            }
            X++;
        }

        input.close();
    }
}