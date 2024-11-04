//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * Realiza una cuenta atrás del 10 al 0.
 * @version 1.0
 * @author Carlos Costas
 */

public class Main {
    public static void main(String[] args) {
       for (int i = 10; i >= 0; i--) {
           System.out.println("Cuenta atrás con for: " + i);
       }
       int z = 10;
       while (z>=0) {
           System.out.println("Cuenta atrás con while: " + z);
           z--;
       }
    }
}