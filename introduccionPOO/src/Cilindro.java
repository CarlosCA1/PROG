public class Cilindro extends Circulo {
    private double altura;
    public Cilindro (double x, double y, double radio, double altura){
        super (x,y,radio);
        setAltura(altura);
    }
    public Cilindro (int x, int y, int radio, int altura){
        super (x,y,radio);
        setAltura(altura);
    }
    public Cilindro (double w, double radio, double altura){
        super (w,radio);
        setAltura(altura);
    }
    public Cilindro (int w, int radio, int altura){
        super (w,radio);
        setAltura(altura);
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        if (altura>0) this.altura=altura;
        else this.altura=0;
    }
    public double calcularVolumen () {
        return super.calcularArea() * altura;
    }
    public double calcularSuperficie () {
        return 2*super.calcularArea()+super.calcularPerimetro()*altura;
    }
    public String toString (){
        return "El cilindro tiene: \n" + super.toString()+"\nAltura="+altura;
    }
}
