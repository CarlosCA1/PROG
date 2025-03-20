public class Main {
    public static void main(String[] args) {
        PrazaGaraxe pazaGaraxe = new PrazaGaraxe("Rúa X", 101, "Santiago", 30000, true, true, 1, 5, 3);
        LocalComercial localComercial = new LocalComercial("Rúa Y", 202, "A Coruña", 50000, false, true, true, true, "1A", 0, 200, "Local con boa ubicación.");
        Vivenda vivenda = new Vivenda("Rúa Z", 303, "Vigo", 120000, true, 3, true, false, true, "Vivenda con xardín.");

        System.out.println(pazaGaraxe.obterDatos());
        System.out.println(localComercial.obterDatos());
        System.out.println(vivenda.obterDatos());

        System.out.println("Ganancia Paza de Garaxe (vendida): " + pazaGaraxe.calcularGanancia() + " €");
        System.out.println("Ganancia Local Comercial (alugado): " + localComercial.calcularGanancia() + " €");
        System.out.println("Ganancia Vivenda (vendida): " + vivenda.calcularGanancia() + " €");
    }
}
