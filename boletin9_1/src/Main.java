public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        System.out.println("Información do libro creado co construtor por defecto:");
        libro1.amosar();

        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, (short) 417);
        System.out.println("\nInformación do libro creado co construtor con parámetros:");
        libro2.amosar();
        
        libro1.setTitulo("O meu libro");
        libro1.setAutor("Autor Descoñecido");
        libro1.setAno(2025);
        libro1.setNumPaginas((short) 300);
        libro1.setValoracion(4.5f);

        System.out.println("\nInformación do libro despois de modificar os seus datos:");
        libro1.amosar();
    }
}
