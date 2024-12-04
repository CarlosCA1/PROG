/**
 * Devuelve los pares del array.
 * @version 1.0
 * @author Carlos Costas
 */

public class boletin7_8 {
    public static void main(String[] args) {
        int [] matrizoriginal = {1, 2, 3, 4, 5};
        for (int i = 0; i < matrizoriginal.length; i++) {
        }
        copiapares (matrizoriginal);
    }

    /**
     * Devuelve los pares del array.
     * @param pares
     * @since v1.0
     */
    static void copiapares(int [] pares) {
        pares = new int[] {2, 4};
        for (int i = 0; i < pares.length; i++) {
            System.out.println("Matriz con pares: " + pares[i]);
        }
    }
}
