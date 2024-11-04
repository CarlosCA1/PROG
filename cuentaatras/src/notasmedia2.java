import java.util.Scanner;

/**
 * El programa solicita notas e imprime la media de las mismas. Para pararlo, introduce -1.
 * @version 1.0
 * @author Carlos Costas
 */

public class notasmedia2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);{
        double sumanotas = 0.0, nota = 0.0;
        int cantidad = 0;
        do {
            System.out.println("Introduce la nota (-1 para salir): ");
            nota = sc.nextDouble();
            if (nota != -1) {
                sumanotas = sumanotas + nota;
                cantidad++;
            }
        } while (nota != -1);
        System.out.println("La media es: " + sumanotas/cantidad);

        }
    }
}