import java.util.Set;
import java.util.HashSet;

public class boletin13_7 {

    public static <E> Set<E> union(Set<E> conxunto1, Set<E> conxunto2) {
        Set<E> resultado = new HashSet<>(conxunto1);  // Copiamos o primeiro conxunto
        resultado.addAll(conxunto2);                   // Engadimos todos os do segundo conxunto
        return resultado;
    }
}
