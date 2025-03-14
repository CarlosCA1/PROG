public class Circulo extends Centro {
    private double radio;

    public Circulo (double x, double y, double r){
        super (x,y);
        radio=r;
    }
    public Circulo (int x, int y, int r){
        super (x,y);
        radio=r;
    }
    public Circulo (double w, double r){
        super (w,w);
        radio=r;
    }
    public Circulo (int w, int r){
        super (w,w);
        radio=r;
    }
    public Circulo (){
        super ();
        radio=0;
    }
    public double getRadio(){
       return radio;
    }
    public void setRadio(double radio){
        if (radio>0) this.radio=radio;
        else this.radio=0;
    }
    public double obtenerDiametro(){
        return radio*2;
    }
    public double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }
    public double calcularPerimetro(){
        return Math.PI*obtenerDiametro();
    }
    public String toString (){
        return "El centro del círculo es: " + super.toString()+"\nEl radio es: " + getRadio();
    }
}
