import java.util.Date;
public class Main {
public static void main(String[] args) {
    // Crear a asociación
    Asociacion asociacion = new Asociacion();

    // Crear socios
    Socio socio1 = new Socio("12345678A", "Juan Pérez", new Date(), 50);
    Socio socio2 = new Socio("87654321B", "Ana López", new Date(), 40);

    // Crear traballadores
    Asalariado asalariado1 = new Asalariado("11223344C", "Carlos García", new Date(), 2000, 6, 15, "Gerente");
    Voluntario voluntario1 = new Voluntario("22334455D", "Luis Fernández", new Date(), 30, "Médico", 10);

    // Engadir a socios e traballadores á asociación
    asociacion.engadirSocio(socio1);
    asociacion.engadirSocio(socio2);
    asociacion.engadirTraballador(asalariado1);
    asociacion.engadirTraballador(voluntario1);

    // Calcular os gastos/ingresos totais da asociación
    double total = asociacion.calcularGastosIngresos();
    System.out.println("Total gastos/ingresos da asociación: " + total + " €");
}
}
