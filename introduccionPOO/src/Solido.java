public abstract class Solido extends FiguraGeometrica {
    public Solido(){
        super();
    }
    public Solido(double x, double y){
        super(x,y);
    }

    public abstract double calcularVolumen();
}
