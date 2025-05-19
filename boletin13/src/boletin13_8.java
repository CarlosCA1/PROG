import java.util.Set;
import java.util.HashSet;

public class boletin13_8 {

    public static <E> Set<E> interseccion(Set<E> conxunto1, Set<E> conxunto2) {
        Set<E> resultado = new HashSet<>(conxunto1);  // Copiamos o primeiro conxunto
        resultado.retainAll(conxunto2);                // Mantemos só os elementos que están no segundo conxunto
        return resultado;
    }
}
