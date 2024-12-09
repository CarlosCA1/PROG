import java.util.Scanner;

public class boletin7_4 {
    public static void main(String[] args) {
        String [][] hundirLaFlota = {{"B", "~", "~", "B"},
                                    {"~", "B", "~", "B"},
                                    {"B", "~", "B", "~"},
                                    {"~", "B", "~", "B"}
        };
        for (int i = 0; i < hundirLaFlota.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < hundirLaFlota[i].length; j++) {
                String flotaInicial = hundirLaFlota[i][j];
                System.out.print(flotaInicial);
                disparar (flotaInicial, i, j)
            }
        }
    }
    public static void disparar (String flotaInicial) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el primer plato (empezando con mayúsculas): ");
        String primerPlato = scanner.nextLine();
    }
}
