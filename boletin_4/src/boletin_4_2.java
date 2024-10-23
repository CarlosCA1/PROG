import java.util.Scanner;

/**
 * Según la figura escogida, calcula su superficie según los datos introducidos.
 * @version 1.0
 * @author Carlos Costas
 */

public class boletin_4_2 {
    public static void main(String[] args) {
        System.out.println("1: cuadrado");
        System.out.println("2: triángulo");
        System.out.println("3: círculo");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el número de figura: ");
        int numero = scanner.nextInt();


        switch (numero) {
            case 1:
                System.out.print("Introduzca la longitud del lado del cuadrado (m): ");
                double lado = scanner.nextDouble();
                double superficiec = lado * lado;
                System.out.println("La superficie es de " + superficiec + " m");
                break;
            case 2:
                System.out.println("Introduce la base del triángulo (m): ");
                double base = scanner.nextDouble();
                System.out.println("Introduce la altura del triángulo (m): ");
                double altura = scanner.nextDouble();
                double superficiet = (base * altura) / 2;
                System.out.println("La superficie es de " + superficiet + " m");
                break;
            case 3:
                System.out.println("Introduce el radio del círculo (m): ");
                double radio = scanner.nextDouble();
                double superficieci = 3.14 * radio * radio;
                System.out.println("La superficie es de " + superficieci + " m");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
