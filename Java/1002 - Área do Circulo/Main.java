import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double raio = input.nextDouble();
        Double area = (Math.pow(raio, 2)) * 3.14159;
        System.out.printf("A=%.4f\n", area);
    }
}