import java.util.*;

public class Academia {

    // Método para inserir novo académico se a letra é válida e non está ocupada
    public static boolean nuevoAcademico(Map<Character, Academico> academia, Academico novo, Character letra) {
        letra = Character.toUpperCase(letra);

        // Letras do abecedario español (maiusculas)
        String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

        if (abecedario.indexOf(letra) == -1) {
            System.out.println("Letra inválida para sillón: " + letra);
            return false;
        }

        if (academia.containsKey(letra)) {
            System.out.println("O sillón " + letra + " xa está ocupado.");
            return false;
        }

        academia.put(letra, novo);
        return true;
    }

    public static void main(String[] args) {
        Map<Character, Academico> academia = new HashMap<>();

        // Crear cinco académicos
        Academico a1 = new Academico("Ana Pérez", 2001);
        Academico a2 = new Academico("Bernardo López", 1998);
        Academico a3 = new Academico("Carmen Suárez", 2010);
        Academico a4 = new Academico("David Rodríguez", 2005);
        Academico a5 = new Academico("Elena Martínez", 2015);

        // Insertar académicos con letra
        nuevoAcademico(academia, a1, 'A');
        nuevoAcademico(academia, a2, 'B');
        nuevoAcademico(academia, a3, 'C');
        nuevoAcademico(academia, a4, 'D');
        nuevoAcademico(academia, a5, 'E');

        // 1. Listado sen letra, ordenado por nome
        List<Academico> senLetra = new ArrayList<>(academia.values());
        senLetra.sort(Comparator.naturalOrder());
        System.out.println("Académicos sen letra, ordenados por nome:");
        senLetra.forEach(System.out::println);

        // 2. Listado sen letra, ordenado por ano de ingreso
        senLetra.sort(Comparator.comparingInt(Academico::getAnoIngreso));
        System.out.println("\nAcadémicos sen letra, ordenados por ano de ingreso:");
        senLetra.forEach(System.out::println);

        // 3. Listado con letra, ordenado por letra (clave)
        System.out.println("\nAcadémicos con letra, ordenados por letra:");
        academia.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        // 4. Listado con letra, ordenado por nome (valor)
        System.out.println("\nAcadémicos con letra, ordenados por nome:");
        academia.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        // 5. Listado con letra, ordenado por ano de ingreso (valor)
        System.out.println("\nAcadémicos con letra, ordenados por ano de ingreso:");
        academia.entrySet().stream()
                .sorted(Comparator.comparing(e -> e.getValue().getAnoIngreso()))
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
