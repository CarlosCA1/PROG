package org.example;
import java.util.Scanner;

/**
 * Calcula o soldo bruto e líquido, a percibir por unha persoa. Para iso hai que ter en conta, que o soldo total inclúe os seguintes conceptos:
 * Soldo fixo.
 * Comisión: 5% sobre importe total de vendas
 * Quilometraxe: 2 € por km
 * Dietas: 30 € por día de desprazamento.
 * Para calcular o soldo líquido debemos descontarlle ao soldo bruto:
 * I.R.P.F. = 18 % do soldo total.
 * Retención a seguridade social : 36 €.
 * @version 1.0
 * @author Carlos Costas
 */

public class Boletin_2_extra_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sueldo fijo: ");
        double sueldo_fijo = scanner.nextDouble();
        System.out.print("Importe total de ventas: ");
        double importe_ventas = scanner.nextDouble();
        System.out.print("Kilómetros recorridos: ");
        double km_recorridos= scanner.nextDouble();
        System.out.print("Días de desplazamiento: ");
        double dias_desplazamiento= scanner.nextDouble();
        double comision = (5 / 100) * importe_ventas;
        double kilometraje = 2 * km_recorridos;
        double dietas = 30 * dias_desplazamiento;
        double sueldo_bruto = sueldo_fijo - comision - kilometraje - dietas;
        System.out.println("Sueldo bruto:" + sueldo_bruto + "€");
        double descuento_irpf = 18 * sueldo_bruto / 100;
        double irpf = sueldo_bruto - descuento_irpf;
        double sueldo_liquido = irpf - 36;
        System.out.println("Sueldo líquido: " + sueldo_liquido + "€");

        scanner.close();
    }
}