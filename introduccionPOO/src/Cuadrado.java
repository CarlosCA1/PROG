public class Cuadrado extends Centro{
    private double lado;
    public Cuadrado (double x, double y, double l){
        super (x,y);
        setLado(l);
    }
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        if (lado>0) this.lado=lado;
        else this.lado=0;
    }
    public double calcularArea(){
        return lado*lado;
    }
    public double calcularPerimetro(){
        return lado*4;
    }
}
