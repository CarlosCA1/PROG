package org.example;
import java.util.Scanner;

/**
 * Permite introducir una nota e imprimir el tipo de calificación.
 * Permite teclear un mes e imprimir el número de días del mismo.
 * @version 1.0
 * @author Carlos Costas
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca nota: ");
        int nota = scanner.nextInt();

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Valor no válido");

                //case5-> { . sout aprobado
                //Con flechas no hay que poner break
        }
        // Dado o mes, que nos devolte o número de días
        System.out.println("Teclea el año: ");
        int año = scanner.nextInt ();
        System.out.println("Teclea o mes (1-12) : ");
        /*
        Un año es bisiesto si es divisible entre 4 y no divisible entre 100,
        y también si es divisible entre 400
         */
        boolean bisiesto;
        if (año % 4 ==0 && !(año % 100 ==0)) || año % 400 == 0) bisiesto = true;
            else bisiesto = false;
        int mes = scanner.nextInt();
        int dias = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                yield 31;
            }
            case 2 -> {
                if (bisiesto) yield 29;
                else yield 28;
            }
            case 4, 6, 9, 11 -> {
                yield 30;
            }
            default -> {
                System.out.println("Error: valor de mes incorrecto");
                yield -1;
            }
        };

        if (dias != -1) {
            System.out.println("El número de días del mes " + mes + " es " + dias);
        }
            scanner.close();
    }
}