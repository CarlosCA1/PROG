import java.util.Date;
public class Asalariado extends Traballador {
    private double soldo;
    private double porcentaxeSeguridadeSocial;
    private double porcentaxeIRPF;
    private String cargo;

    public Asalariado(String dni, String nome, Date dataAlta, double soldo, double porcentaxeSeguridadeSocial, double porcentaxeIRPF, String cargo) {
        super(dni, nome, dataAlta);
        this.soldo = soldo;
        this.porcentaxeSeguridadeSocial = porcentaxeSeguridadeSocial;
        this.porcentaxeIRPF = porcentaxeIRPF;
        this.cargo = cargo;
    }

    public double getSoldo() {
        return soldo;
    }

    public void setSoldo(double soldo) {
        this.soldo = soldo;
    }

    public double getPorcentaxeSeguridadeSocial() {
        return porcentaxeSeguridadeSocial;
    }

    public void setPorcentaxeSeguridadeSocial(double porcentaxeSeguridadeSocial) {
        this.porcentaxeSeguridadeSocial = porcentaxeSeguridadeSocial;
    }

    public double getPorcentaxeIRPF() {
        return porcentaxeIRPF;
    }

    public void setPorcentaxeIRPF(double porcentaxeIRPF) {
        this.porcentaxeIRPF = porcentaxeIRPF;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String aCadea() {
        return "Asalariado: " + nome + ", DNI: " + dni + ", Data Alta: " + dataAlta + ", Cargo: " + cargo +
                ", Soldo: " + soldo + ", Seguridade Social: " + porcentaxeSeguridadeSocial + "%, IRPF: " + porcentaxeIRPF + "%";
    }

    @Override
    public double gastosIngresos() {
        double gasto = soldo + (soldo * porcentaxeSeguridadeSocial / 100); // Soldo máis seguridade social
        return -gasto; // Gastos para a asociación
    }
}


