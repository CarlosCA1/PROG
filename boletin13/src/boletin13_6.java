import java.util.*;

public class boletin13_6 {

    public static void main(String[] args) {
        // Exemplo: lista con números entre 1 e 10 (pódese modificar)
        List<Integer> lista = Arrays.asList(1, 3, 5, 7, 3, 2, 5, 10, 1, 4, 6, 7, 7);

        System.out.println("Lista orixinal: " + lista);

        Set<Integer> senRepetir = new HashSet<>();
        Set<Integer> repetidos = new HashSet<>();

        Set<Integer> vistos = new HashSet<>();

        for (Integer num : lista) {
            if (!vistos.add(num)) {
                // Se num xa estaba en 'vistos', é repetido
                repetidos.add(num);
            } else {
                // Se é a primeira vez, engádese a 'senRepetir' (de momento)
                senRepetir.add(num);
            }
        }

        // Eliminar do conxunto 'senRepetir' os elementos que están en 'repetidos'
        senRepetir.removeAll(repetidos);

        System.out.println("Conxunto de elementos sen repetir: " + senRepetir);
        System.out.println("Conxunto de elementos repetidos: " + repetidos);
    }
}
