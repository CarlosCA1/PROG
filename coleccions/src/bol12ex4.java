import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bol12ex4 {
    public static void main(String[] args) {
        List<Integer> coleccionPositivos;
        coleccionPositivos = new ArrayList<>();
        List<Integer> coleccionNegativos;
        coleccionNegativos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número real: ");
        int numero = scanner.nextInt();
        if (numero == 0) {
            System.out.println("Fin");
        }
        if (numero > 0){
            coleccionPositivos.add(numero);
        } if (numero < 0){
            coleccionNegativos.add(numero);
        }
        System.out.println("Positivos: " + coleccionPositivos);
        System.out.println("Negativos: " + coleccionNegativos);
    }
}
