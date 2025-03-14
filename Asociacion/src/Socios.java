public class Socios extends MembroAsociacion implements CalculoGastosIngresos {
    private String direccion;
    private String provincia;
    private double cuota;
    private Data dataAlta;

    public Socio(String dni,String nome, String direccion, String provincia, double cuota,Data dataAlta){
        super(dni, nome);
        this.direccion=direccion;
        this.provincia=provincia;
        setCuota(cuota);
        this.dataAlta=dataAlta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        if (cuota<0.0) this.cuota = 0;
        else this.cuota=cuota;
    }

    public Data getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Data dataAlta) {
        this.dataAlta = dataAlta;
    }
    public double gastosIngresos(){

        return 0;
    }
    public String aCadea(){
        String aux=", con direccion "+direccion + ", na provincia"+provincia+", con data de alta "+dataAlta+dataAlta.toString()+", con cuota"+cuota+" euros";
        return super.aCadea()+aux;
    }
}
