import java.util.ArrayList;

public class Cliente {
    private String id;
    private String nome;
    private String telefono;

    public Cliente (String id, String nome, String telefono){
        this.id=id;
        this.nome=nome;
        this.telefono=telefono;
    }

    public String listarClientes(){
        String mensaxe = "Identificador de cliente: " + id + ", nome: " + nome +", teléfono: " + telefono;
        return mensaxe;
    }

    public static void agregarCliente(ArrayList<Cliente> listaClientes, String id, String nombre, String telefono) {
        // Crear un nuevo objeto Cliente
        Cliente novoCliente = new Cliente(id, nombre, telefono);
        // Añadirlo a la lista de clientes
        listaClientes.add(novoCliente);
        System.out.println(novoCliente.listarClientes());
    }
}

