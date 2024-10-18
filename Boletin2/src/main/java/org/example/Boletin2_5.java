package org.example;
import java.util.Scanner;

/**
 * Le o valor dunha distancia en millas mariñas e as pasa a metros ( 1 milla mariña = 1852 m ).
 * @version 1.0
 * @author Carlos Costas
 */

public class Boletin2_5 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce o cambio millas mariñas-metros:");
        double cambio = entradaTeclado.nextDouble();
        System.out.println("Introduce a distancia en millas:");
        double millas = entradaTeclado.nextDouble();
        double metros = millas * cambio;
        System.out.println("" + millas + "millas son " + metros + "metros.");
        entradaTeclado.close();
    }
}