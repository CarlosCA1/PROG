/**
 * Dados dos números, muestra los comprendidos entre ellos
 * @version 1.0
 * @author Carlos Costas
 */

public class Main {
    /**
     * Método principal, entrada de la aplicación
     *
     * @param args no usados
     */
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        numerosComprendidos(a, b);
    }

    /**
     * Muestra los números comprendidos entre dos números
     *
     * @param num1
     * @param num2
     * @since v1.0
     */
    static void numerosComprendidos(int num1, int num2) {
        if (num1 > num2) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }
        for (int i = num1 + 1; i < num2; i++) {
            System.out.println(i);
        }
    }}