import java.util.Date;
public class Socio extends Persoa {
    private double cuotaMensual;

    public Socio(String dni, String nome, Date dataAlta, double cuotaMensual) {
        super(dni, nome, dataAlta);
        this.cuotaMensual = cuotaMensual;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    @Override
    public String aCadea() {
        return "Socio: " + nome + ", DNI: " + dni + ", Data Alta: " + dataAlta + ", Cuota Mensual: " + cuotaMensual;
    }

    @Override
    public double gastosIngresos() {
        return cuotaMensual; // Os socios son ingresos
    }
}


