import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int primeiroValor = input.nextInt();
        int segundoValor = input.nextInt();
        int produto = primeiroValor * segundoValor;
        System.out.printf("PROD = %d\n", produto);
    }
}