public class Main {
    public static void copiarArray(int[] original) {
        int[] copia = new int[original.length]; // Creamos un nuevo arreglo con el mismo tamaño
        System.arraycopy(original, 0, copia, 0, original.length); // Copiamos el contenido
        // Mostrar el arreglo copiado
        System.out.println("Array copiado: ");
        for (int i : copia) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arregloOriginal = {1, 2, 3, 4, 5};
        copiarArray(arregloOriginal);
    }
}
