public abstract class TransporteContedores extends Navieira implements Facturacion {
    private double capacidadeCarga;
    private int numeroCompartimentos;

    public TransporteContedores(double prezo, double capacidadeCarga, int numeroCompartimentos, String paisOrixe, String nome, int anoBotadura, String matricula, int numeroLicencia, String dataInspeccion, int numeroSalvavidas, double eslora, double volumeAuga, int numeroTripulantes){
        super(paisOrixe, nome, anoBotadura, matricula, numeroLicencia, dataInspeccion, numeroSalvavidas, eslora, volumeAuga, numeroTripulantes);
        this.capacidadeCarga=capacidadeCarga;
        this.numeroCompartimentos=numeroCompartimentos;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getNumeroCompartimentos() {
        return numeroCompartimentos;
    }

    public void setNumeroCompartimentos(int numeroCompartimentos) {
        this.numeroCompartimentos = numeroCompartimentos;
    }

    public double calcularFacturacion(double millas){
        return 30*millas;
    }

    public String aCadea(){
        String aux = ". A capacidade de carga é de " + capacidadeCarga + " tm " + "e hai " + numeroCompartimentos + "compartimentos. O prezo é de " + calcularFacturacion(10) + "euros";
        return super.aCadea()+aux;
    }
}
