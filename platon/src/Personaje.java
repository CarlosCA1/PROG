public class Personaje {
    String nombre;
    private int vidas;

    /**
     * Constructor por defecto
     */

    public Personaje(){
        this.nombre="Mutenroy";
        this.vidas=1000;
    }
    /**
     * Constructor que personalice el nombre
     * @param nombre del personaje
     */
    public Personaje (String nombre){
        this.nombre=nombre;
        this.vidas=100;
    }
    /**
     * Disminuye la vida según el daño
     * @param daño es el daño causado
     * @return vidas que me quedan
     */
    public int perderVida(int daño){
        if (daño<0) daño=0;
        vidas = vidas-daño;
        if (vidas<0) vidas=0;
        return vidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}
