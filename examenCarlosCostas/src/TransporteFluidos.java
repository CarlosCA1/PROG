public abstract class TransporteFluidos extends Navieira implements Facturacion{
    private String tipoFluido;
    private double volumeFluido;
    private int numeroDepositos;

    public TransporteFluidos (String tipoFluido, double volumeFluido, int numeroDepositos, String paisOrixe, String nome, int anoBotadura, String matricula, int numeroLicencia, String dataInspeccion, int numeroSalvavidas, double eslora, double volumeAuga, int numeroTripulantes){
        super(paisOrixe, nome, anoBotadura, matricula, numeroLicencia, dataInspeccion, numeroSalvavidas, eslora, volumeAuga, numeroTripulantes);
        this.tipoFluido=tipoFluido;
        this.volumeFluido=volumeFluido;
        this.numeroDepositos=numeroDepositos;

    }

    public String getTipoFluido() {
        return tipoFluido;
    }

    public void setTipoFluido(String tipoFluido) {
        this.tipoFluido = tipoFluido;
    }

    public double getVolumeFluido() {
        return volumeFluido;
    }

    public void setVolumeFluido(double volumeFluido) {
        this.volumeFluido = volumeFluido;
    }

    public int getNumeroDepositos() {
        return numeroDepositos;
    }

    public void setNumeroDepositos(int numeroDepositos) {
        this.numeroDepositos = numeroDepositos;
    }

    public double calcularFacturacion(double millas){
        return 20*millas;
    }

    public String aCadea(){
        String aux = ". O tipo de fluido é" + tipoFluido + ", o volume do fluido é de " + volumeFluido + "m3" + " e hai " + numeroDepositos + "depósitos"  + "O prezo é de " + calcularFacturacion(10) + "euros";;
        return super.aCadea()+aux;
    }
}
