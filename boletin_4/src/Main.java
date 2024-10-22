import java.util.Scanner;

/**
 * Permite imprimir el tipo de consumo de un artículo, introduciendo su nombre y número de ventas anuales.
 * @version 1.0
 * @author Carlos Costas
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el nombre del artículo: ");
        String articulo = scanner.nextLine();
        System.out.print("Introduzca el número de ventas anuales: ");
        int ventas = scanner.nextInt();

        if (ventas <= 100) {
            System.out.println("El artículo [" + articulo + "] es de consumo bajo");
        }
        if (ventas > 100) {
            if (ventas <= 500)
                System.out.println("El artículo [" + articulo +"] es de consumo medio");
            }
        if (ventas > 500) {
            if (ventas <=1000)
            System.out.println("El artículo [" + articulo + "] es de consumo alto");
        }
            if (ventas > 1000) {
        System.out.println("El artículo [" + articulo +"] es de primera necesidad");
        }

    }
}