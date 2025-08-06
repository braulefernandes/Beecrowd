import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ddd = input.nextInt();

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(61, "Brasilia");
        mapa.put(71, "Salvador");
        mapa.put(11, "Sao Paulo");
        mapa.put(21, "Rio de Janeiro");
        mapa.put(32, "Juiz de Fora");
        mapa.put(19, "Campinas");
        mapa.put(27, "Vitoria");
        mapa.put(31, "Belo Horizonte");

        if (mapa.containsKey(ddd)) {
            System.out.println(mapa.get(ddd));
        } else {
            System.out.println("DDD nao cadastrado");
        }

        input.close();
    }
}
