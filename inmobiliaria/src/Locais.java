public class Locais extends Inmoble {
    public int portal;
    public int piso;
    public double metros_cadrados;
    public String observacions;
    private boolean acondicionado;
    private boolean fachada;
    private boolean entrada;

    public Locais(String rua, int numero, String localidade, double prezo, int portal, int piso, double metros_cadrados, String observacions) {
        super(rua, numero, localidade, prezo);
        this.portal=portal;
        this.piso=piso;
        this.metros_cadrados=metros_cadrados;
        this.observacions=observacions;
    }
}
