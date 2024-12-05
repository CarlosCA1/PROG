//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int numero;
                long resultado = 1;

                // Pedir un número al usuario
                System.out.print("Introduce un número para calcular su factorial (n >= 0): ");
                numero = scanner.nextInt();

                // Validar que el número sea no negativo
                if (numero < 0) {
                    System.out.println("El factorial no está definido para números negativos.");
                } else {
                    // Calcular el factorial usando un bucle for
                    for (int i = 1; i <= numero; i++) {
                        resultado *= i;
                    }
                    System.out.println("El factorial de " + numero + " es " + resultado + ".");
                }
            }
}