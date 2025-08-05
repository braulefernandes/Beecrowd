import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] valores = new int[3];
        int[] original = new int[3];

        for (int i = 0; i < 3; i++) {
            valores[i] = input.nextInt();
            original[i] = valores[i];
        }

        Arrays.sort(valores);

        for (int val : valores) {
            System.out.println(val);
        }

        System.out.println();

        for (int val : original) {
            System.out.println(val);
        }

        input.close();
    }
}
