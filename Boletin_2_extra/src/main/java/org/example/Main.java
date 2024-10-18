package org.example;
import java.util.Scanner;

/**
 * Saca por pantalla a porcentaxe descontada nunha compra. Introducindo, por teclado, o prezo da tarifa e o prezo pagado.
 * @version 1.0
 * @author Carlos Costas
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Prezo da tarifa: ");
        double prezo_tarifa = scanner.nextDouble();
        System.out.print("Prezo pagado: ");
        double prezo_pagado = scanner.nextDouble();
        double prezo_total = prezo_tarifa + prezo_pagado;
        double porcentaxe = (prezo_tarifa * 100) / prezo_total;
        System.out.println("Porcentaxe descontada: " + porcentaxe + "%");
        scanner.close();

    }
}