import java.io.*;
import java.util.*;

class Cliente implements Serializable {
    private int id;
    private String nome;
    private String telefono;

    public Cliente(int id, String nome, String telefono) {
        this.id = id;
        this.nome = nome;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Teléfono: " + telefono;
    }
}

public class boletin12_1 {
    private static final String FILE_NAME = "clientes.dat";
    private static List<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
        cargarDatos();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ CLIENTES ---");
            System.out.println("1. Engadir novo cliente");
            System.out.println("2. Modificar datos");
            System.out.println("3. Dar de baixa cliente");
            System.out.println("4. Listar clientes");
            System.out.println("0. Saír");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            switch (opcion) {
                case 1 -> engadirCliente(sc);
                case 2 -> modificarCliente(sc);
                case 3 -> eliminarCliente(sc);
                case 4 -> listarClientes();
                case 0 -> System.out.println("Gardando datos e saíndo...");
                default -> System.out.println("Opción non válida.");
            }
        } while (opcion != 0);

        gardarDatos();
        sc.close();
    }

    private static void engadirCliente(Scanner sc) {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        clientes.add(new Cliente(id, nome, telefono));
        System.out.println("Cliente engadido.");
    }

    private static void modificarCliente(Scanner sc) {
        System.out.print("ID do cliente a modificar: ");
        int id = sc.nextInt();
        sc.nextLine();
        Cliente cliente = buscarCliente(id);
        if (cliente != null) {
            System.out.print("Novo nome: ");
            String nome = sc.nextLine();
            System.out.print("Novo teléfono: ");
            String telefono = sc.nextLine();
            cliente.setNome(nome);
            cliente.setTelefono(telefono);
            System.out.println("Datos actualizados.");
        } else {
            System.out.println("Cliente non atopado.");
        }
    }

    private static void eliminarCliente(Scanner sc) {
        System.out.print("ID do cliente a eliminar: ");
        int id = sc.nextInt();
        Cliente cliente = buscarCliente(id);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Cliente eliminado.");
        } else {
            System.out.println("Cliente non atopado.");
        }
    }

    private static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Non hai clientes.");
        } else {
            for (Cliente c : clientes) {
                System.out.println(c);
            }
        }
    }

    private static Cliente buscarCliente(int id) {
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private static void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            clientes = (List<Cliente>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Se o ficheiro non existe ou está baleiro, empezamos cunha lista nova
            clientes = new ArrayList<>();
        }
    }

    private static void gardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(clientes);
        } catch (IOException e) {
            System.out.println("Erro ao gardar os datos: " + e.getMessage());
        }
    }
}
