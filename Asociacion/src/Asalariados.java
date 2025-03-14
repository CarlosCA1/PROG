public class Asalariados extends Traballadores implements CalculoGastosIngresos{
    private String cargo;
    private double soldo;
    private double ss;
    private double irpf;

    public Asalariados(String dni, String nome, Data dataIngreso, String cargo, double soldo, double ss, double irpf){
        super(dni, nome, dataIngreso);
        setCargo(cargo);
        setSoldo(soldo);
        setSs(ss);
        setIrpf(irpf);

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSoldo() {
        return soldo;
    }

    public void setSoldo(double soldo) {
        this.soldo = Math.abs(soldo);
    }

    public double getSs() {
        return ss;
    }

    public void setSs(double ss) {
        this.ss = Math.abs(ss);
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = Math.abs(irpf);
    }

    public double gastosIngresos() {
        return -soldo -soldo*15/100;
    }
    public String aCadea(){
        String aux=", con cargo "+cargo+", con soldo "+soldo+" euros, cunha contribucion a SS de "+ss+"%, e unha remuneracion o IRPF de "+irpf;
        return aCadea()+aux;
    }
}