import java.util.Comparator;

public class ComparadorIdade implements Comparator<Cliente> {
    public int compare (Cliente c1, Cliente c2){
        return c1.compareTo(c2);
    }
}
