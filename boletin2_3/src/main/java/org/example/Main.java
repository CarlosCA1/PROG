import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String cambio, euros;
        double dolares;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce o cambio dolar-euro do dia de hoxe:");
        cambio = entradaTeclado.next();
        System.out.println("Introduce a cantidade de euros a cambiar:");
        euros = entradaTeclado.next();
        dolares = Double.parseDouble (euros)/ Double.parseDouble (cambio);
        System.out.println(dolares +"dolares de cambio, por"+ euros+ "euros.");
        entradaTeclado.close();
    }
}