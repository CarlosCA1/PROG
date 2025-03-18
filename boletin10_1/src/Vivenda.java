public class Vivenda extends Inmueble {
    private int númeroHabitacións;
    private boolean tenGaraxe;
    private boolean tenTrasteiro;
    private boolean tenAdega;
    private String observacións;

    // Construtor
    public Vivenda(String rúa, int número, String localidade, double prezo, boolean vendido, int númeroHabitacións, boolean tenGaraxe, boolean tenTrasteiro, boolean tenAdega, String observacións) {
        super(rúa, número, localidade, prezo, vendido);
        this.númeroHabitacións = númeroHabitacións;
        this.tenGaraxe = tenGaraxe;
        this.tenTrasteiro = tenTrasteiro;
        this.tenAdega = tenAdega;
        this.observacións = observacións;
    }

    @Override
    public String obterDatos() {
        return "Vivenda:\n" +
                "Rúa: " + rúa + "\n" +
                "Número: " + número + "\n" +
                "Localidade: " + localidade + "\n" +
                "Número de habitacións: " + númeroHabitacións + "\n" +
                "Ten praza de garaxe: " + (tenGaraxe ? "Sí" : "Non") + "\n" +
                "Ten trasteiro: " + (tenTrasteiro ? "Sí" : "Non") + "\n" +
                "Ten adega: " + (tenAdega ? "Sí" : "Non") + "\n" +
                "Observacións: " + observacións + "\n" +
                "Prezo: " + prezo + " €";
    }

    @Override
    protected double obterPorcentaxeGanancia() {
        return 0.02; // 2% de ganancia para vivendas vendidas
    }
}
