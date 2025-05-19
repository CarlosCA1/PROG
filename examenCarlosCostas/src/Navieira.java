public class Navieira {
    private String paisOrixe;
    private String nome;
    private int anoBotadura;
    private String matricula;
    private int numeroLicencia;
    private String dataInspeccion;
    private int numeroSalvavidas;
    private double eslora;
    private double volumeAuga;
    private int numeroTripulantes;

    public Navieira (String paisOrixe, String nome, int anoBotadura, String matricula, int numeroLicencia, String dataInspeccion, int numeroSalvavidas, double eslora, double volumeAuga, int numeroTripulantes) {
        this.paisOrixe=paisOrixe;
        this.nome=nome;
        this.anoBotadura=anoBotadura;
        this.matricula=matricula;
        this.numeroLicencia=numeroLicencia;
        this.dataInspeccion=dataInspeccion;
        this.numeroSalvavidas=numeroSalvavidas;
        this.eslora=eslora;
        this.volumeAuga=volumeAuga;
        this.numeroTripulantes=numeroTripulantes;
    }

    public String getPaisOrixe() {
        return paisOrixe;
    }

    public void setPaisOrixe(String paisOrixe) {
        this.paisOrixe = paisOrixe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoBotadura() {
        return anoBotadura;
    }

    public void setAnoBotadura(int anoBotadura) {
        this.anoBotadura = anoBotadura;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public String getDataInspeccion() {
        return dataInspeccion;
    }

    public void setDataInspeccion(String dataInspeccion) {
        this.dataInspeccion = dataInspeccion;
    }

    public int getNumeroSalvavidas() {
        return numeroSalvavidas;
    }

    public void setNumeroSalvavidas(int numeroSalvavidas) {
        this.numeroSalvavidas = numeroSalvavidas;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public double getVolumeAuga() {
        return volumeAuga;
    }

    public void setVolumeAuga(double volumeAuga) {
        this.volumeAuga = volumeAuga;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public String aCadea (){
        String mensaxe = "O barco " + nome + ", de " + paisOrixe + ", do ano" + anoBotadura + ", con número de licenza " + numeroLicencia + " e inspeccionado no " + dataInspeccion + "ten "+ numeroSalvavidas + ", unha eslora de" + eslora + "m" + ", un volume de auga de " + volumeAuga + "m3" + " e " + numeroTripulantes + "tripulantes";
        return mensaxe;
    }
}
