import java.util.Scanner;

public class Main {
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
                    double descuento_irpf = (18 /100) * sueldo_bruto;
                    double irpf = sueldo_bruto - descuento_irpf;
                    double sueldo_liquido = sueldo_bruto - irpf - 36;
        System.out.println("Sueldo líquido" + sueldo_liquido + "€");

        scanner.close();
    }
}