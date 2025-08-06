import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nivel1 = input.next();
        String nivel2 = input.next();
        String nivel3 = input.next();

        if (nivel1.equals("vertebrado")) {
            if (nivel2.equals("ave")) {
                if (nivel3.equals("carnivoro")) System.out.println("aguia");
                else System.out.println("pomba");
            } else {
                if (nivel3.equals("onivoro")) System.out.println("homem");
                else System.out.println("vaca");
            }
        } else {
            if (nivel2.equals("inseto")) {
                if (nivel3.equals("hematofago")) System.out.println("pulga");
                else System.out.println("lagarta");
            } else {
                if (nivel3.equals("hematofago")) System.out.println("sanguessuga");
                else System.out.println("minhoca");
            }
        }

        input.close();
    }
}