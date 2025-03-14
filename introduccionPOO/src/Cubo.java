public class Cubo extends Solido{
    private double lado;

    public Cubo(){
        super();
        lado = 0;
    }
    public Cubo (double x, double y, double l){
        super(x,y);
        setLado(l);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = Math.abs(lado);
    }

    public double calcularArea(){
        return lado*lado*6;
    }

    public double calcularVolumen(){
        return Math.pow(lado, 3);
    }

    public String aCadena(){
        return "Cubo de lado= " + lado + ", centro x= " + getX() + " y= " + getY();
    }
}
