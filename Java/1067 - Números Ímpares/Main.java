import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();

        for (int i = 1; i <= X; i += 2) {
            System.out.println(i);
        }

        input.close();
    }
}