import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploClaseCollections {
    public static void main(String args[]) {
        List<Cliente> coleccionCliente;
        coleccionCliente = new ArrayList<>();
        coleccionCliente.add(new Cliente("35678Y", "Pepe", "12/09/2001"));
        coleccionCliente.add(new Cliente("44444Z", "Ana", "11/03/2011"));
        coleccionCliente.add(new Cliente("55655R", "Mari", "22/05/1991"));
        Cliente unCliente = new Cliente("77777z", "Oscar", "02/01/1981");
        coleccionCliente.add(unCliente);
        System.out.println(coleccionCliente);
        Collections.fill(coleccionCliente, new Cliente("00000A","","01/01/1999"));
        System.out.println(coleccionCliente);
        Collections.sort(coleccionCliente);
        System.out.println(coleccionCliente);
        Collections.sort(coleccionCliente, new ComparadorDni());
        int indice = Collections.binarySearch(coleccionCliente, new Cliente(null,"","11/03/2011"));
        System.out.println(indice);
        System.out.println(coleccionCliente);
        //int indice2 = Collections.binarySearch(coleccionCliente, new Cliente("77777z", null, "0"), new ComparadorDni());
        //System.out.println(indice2);
        Collections.swap(coleccionCliente, 0,3);
        System.out.println(coleccionCliente);
        Collections.replaceAll(coleccionCliente, coleccionCliente.get(0), new Cliente ("11111C","Xoana","02/04/2000"));
        System.out.println(coleccionCliente);
        System.out.println("Copia de coleccións");
        List <Cliente> outraLista  = new ArrayList<>();
        outraLista.add(new Cliente("11111H","Xoan","02/03/2000"));
        Collections.copy(coleccionCliente, outraLista);
        System.out.println(coleccionCliente);
        Collections.shuffle(coleccionCliente);
        System.out.println(coleccionCliente);
        int frecuencia = Collections.frequency(coleccionCliente, coleccionCliente.get(1));
        System.out.println(frecuencia);
        frecuencia = Collections.frequency(coleccionCliente, new Cliente("11111H","Xoan","02/03/2000"));
        System.out.println(frecuencia);
        Cliente maior = Collections.max(coleccionCliente);
        System.out.println(maior.dni);
        Collections.reverse(coleccionCliente);
        System.out.println(coleccionCliente);
    }
}
