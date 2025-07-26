import java.util.Scanner;

public class Main {
    public static String criptografar(String texto) {
        StringBuilder primeira = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                primeira.append((char) (c + 3));
            } else {
                primeira.append(c);
            }
        }

        primeira.reverse();

        for (int i = primeira.length() / 2; i < primeira.length(); i++) {
            primeira.setCharAt(i, (char) (primeira.charAt(i) - 1));
        }

        return primeira.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = Integer.parseInt(input.nextLine());

        for (int i = 0; i < N; i++) {
            String linha = input.nextLine();
            String resultado = criptografar(linha);
            System.out.println(resultado);
        }

        input.close();
    }
}
