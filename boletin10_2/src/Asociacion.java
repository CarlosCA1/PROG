import java.util.ArrayList;
import java.util.Date;

public class Asociacion {
    private ArrayList<Persoa> socios;
    private ArrayList<Traballador> traballadores;

    public Asociacion() {
        socios = new ArrayList<>();
        traballadores = new ArrayList<>();
    }

    public void engadirSocio(Socio socio) {
        socios.add(socio);
    }

    public void engadirTraballador(Traballador traballador) {
        traballadores.add(traballador);
    }

    public double calcularGastosIngresos() {
        double total = 0;
        for (Persoa socio : socios) {
            total += socio.gastosIngresos(); // Calcular ingresos dos socios
        }
        for (Traballador traballador : traballadores) {
            total += traballador.gastosIngresos(); // Calcular gastos dos traballadores
        }
        return total;
    }}
