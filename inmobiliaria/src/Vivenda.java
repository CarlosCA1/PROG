public class Vivenda extends Inmoble {
    private String portal;
    private String piso;
    private int numero_habitacions;
    private PrazaGaraxe garaxe;
    private String observacions;

    public Vivenda(String rua, int numero, String localidade, double prezo, boolean aluguer, String numero_habitacions, int garaxe, String observacions, String portal, String piso) {
        super(rua, numero, localidade, prezo, aluguer);
        setNumero_habitacions(numero_habitacions);
        this.garaxe=garaxe;
        this.observacions=observacions;
        this.portal=portal;
        this.piso=piso;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public int getNumero_habitacions() {
        return numero_habitacions;
    }

    public void setNumero_habitacions(int numero_habitacions) {
        this.numero_habitacions = Math.abs(numero_habitacions);
    }

    public PrazaGaraxe getGaraxe() {
        return garaxe;
    }

    public void setGaraxe(PrazaGaraxe garaxe) {
        this.garaxe = garaxe;
    }

    public String getObservacions() {
        return observacions;
    }

    public void setObservacions(String observacions) {
        this.observacions = observacions;
    }

    public String toString (){
        String texto = super.toString() + " no portal " + portal + ", no piso " + piso + ", número de habitacións: " + numero_habitacions;
        texto = texto + garaxe.toString();
            return texto;
    }

    public double calcularGanancia() {
        if (isAluguer()) return getPrezo();
        else return getPrezo() * 2 / 100;
    }
}
