import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caso = 1;

        while (true) {
            int n = input.nextInt();
            int q = input.nextInt();
            if (n == 0 && q == 0) break;

            int[] numeros = new int[n];
            for (int i = 0; i < n; i++) {
                numeros[i] = input.nextInt();
            }

            Arrays.sort(numeros);
            System.out.println("CASE# " + caso + ":");
            for (int i = 0; i < q; i++) {
                int query = input.nextInt();
                int pos = Arrays.binarySearch(numeros, query);

                while (pos > 0 && numeros[pos - 1] == query) {
                    pos--;
                }

                if (pos >= 0 && numeros[pos] == query) {
                    System.out.println(query + " found at " + (pos + 1));
                } else {
                    System.out.println(query + " not found");
                }
            }

            caso++;
        }

        input.close();
    }
}
