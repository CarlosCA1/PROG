import java.lang.reflect.Array;

public class boletin13_1 {

    public static <T> T[] concatenarArrays(T[] array1, T[] array2) {
        // Crear novo array do tipo de array1, cunha lonxitude igual á suma dos dous
        @SuppressWarnings("unchecked")
        T[] resultado = (T[]) Array.newInstance(array1.getClass().getComponentType(), array1.length + array2.length);

        // Copiar elementos do primeiro array
        System.arraycopy(array1, 0, resultado, 0, array1.length);

        // Copiar elementos do segundo array
        System.arraycopy(array2, 0, resultado, array1.length, array2.length);

        return resultado;
    }
}