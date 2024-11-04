/**
 * Le o soldo de cada un dos traballadores dunha empresa e obtén o número deles que ganan entre 1000 e 1750 €, ámbolos dous incluídos e, a porcentaxe de traballadores que ganan menos de 1000 €. Tendo en conta que non se coñece con antelación o numero de traballadores da empresa e non se admiten os soldos negativos (utiliza como condición de fin un soldo 0).
 * @version 1.0
 * @author Carlos Costas
 */

import java.util.Scanner;

public class boletin5_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario;
        int contadorEntre1000y1750 = 0;
        int contadorMenosDe1000 = 0;
        int totalTrabajadores = 0;

        while (true) {
            System.out.print("Introduce o salario do traballador (0 para finalizar): ");
            salario = scanner.nextDouble();

            if (salario == 0) {
                break;
            }
            if (salario < 0) {
                System.out.println("Os soldos negativos non son permitidos.");
                continue;
            }

            totalTrabajadores++;

            if (salario >= 1000 && salario <= 1750) {
                contadorEntre1000y1750++;
            } else if (salario < 1000) {
                contadorMenosDe1000++;
            }
        }

        if (totalTrabajadores > 0) {
            double porcentaxeMenosDe1000 = (contadorMenosDe1000 * 100.0) / totalTrabajadores;
            System.out.println("Número de traballadores que ganan entre 1000 e 1750 €: " + contadorEntre1000y1750);
            System.out.printf("Porcentaxe de traballadores que ganan menos de 1000 €: %.2f%%\n", porcentaxeMenosDe1000);
        } else {
            System.out.println("Non se introduciu ningún salario válido.");
        }

        scanner.close();
    }
}


