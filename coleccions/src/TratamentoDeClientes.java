import java.util.*;

public class TratamentoDeClientes {

    public static void main(String args[]) {
        List<Cliente> coleccionCliente;
        coleccionCliente = new ArrayList<>();
        coleccionCliente.add(new Cliente("35678Y", "Pepe", "12/09/2001"));
        coleccionCliente.add(new Cliente("44444Z", "Ana", "11/03/2011"));
        coleccionCliente.add(new Cliente("55655R", "Mari", "22/05/1991"));
        Cliente unCliente = new Cliente("77777z", "Oscar", "02/01/1981");
        coleccionCliente.add(unCliente);
        System.out.println(coleccionCliente.size());
        coleccionCliente.remove(unCliente);
        System.out.println("Colección desordenada");
        System.out.println(coleccionCliente.toString());
        System.out.println("Colección ordenada por nome");
        Collections.sort(coleccionCliente, new ComparadorNome());
        System.out.println(coleccionCliente);
        System.out.println("Colección ordenada por DNI");
        Collections.sort(coleccionCliente, new ComparadorDni());
        System.out.println(coleccionCliente);

        System.out.println(coleccionCliente.size());
        Iterator<Cliente> indice = coleccionCliente.iterator();
        for ( ;indice.hasNext(); ){
            Cliente cli = indice.next();
            System.out.println();
            if (cli.dni.equals("44444Z")) indice.remove();
        }
        System.out.println(coleccionCliente.toString());
        for (Cliente cli : coleccionCliente){
            System.out.println(cli);
            //if (cli.dni.equals("55655R")) coleccionCliente.remove(cli);
        }
        coleccionCliente.clear();
        System.out.println(coleccionCliente.size());
        System.out.println(coleccionCliente.isEmpty());
        System.out.println(coleccionCliente.contains(unCliente));
        Object [] clientes = coleccionCliente.toArray();

        Collection<Cliente> outrosClientes = new ArrayList<>();
        outrosClientes.add(new Cliente("35678B", "Juan", "12/09/2007"));
        outrosClientes.add(new Cliente("44444B", "Pablo", "11/03/2017"));
        outrosClientes.add(new Cliente("55655B", "Hipolito", "22/05/1997"));
        coleccionCliente.add(unCliente);
        coleccionCliente.addAll(outrosClientes);
        System.out.println(coleccionCliente.toString());
        coleccionCliente.retainAll(outrosClientes);
        System.out.println(coleccionCliente.toString());
        System.out.println(coleccionCliente.containsAll(outrosClientes));
        coleccionCliente.removeAll(outrosClientes);
        System.out.println(coleccionCliente.containsAll(outrosClientes));

        //Tratamento con TreeSet do Interface Set
        TreeSet<Cliente> conxuntoClientes = new TreeSet<>();
        conxuntoClientes.add(new Cliente("35678Y", "Pepe", "12/09/2001"));
        conxuntoClientes.add(new Cliente("44444Z", "Ana", "11/03/2011"));
        conxuntoClientes.add(new Cliente("55655R", "Mari", "22/05/1991"));
        conxuntoClientes.add(unCliente);
        System.out.println(conxuntoClientes.add(unCliente));
        System.out.println(conxuntoClientes);

        System.out.println(coleccionCliente);
        Collections.sort(coleccionCliente, new ComparadorDni());
        int ref = Collections.binarySearch(coleccionCliente, new Cliente("77777z", "Oscar", "02/01/1981"));
        System.out.println(ref);
    }
}
