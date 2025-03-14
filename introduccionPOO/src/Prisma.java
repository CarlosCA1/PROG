public class Prisma extends Cuadrado{
    private double altura;

    public Prisma (double x, double y, double l, double h) {
        super(x,y,l);
        altura=h;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura>0) this.altura = altura;
        else this.altura=0;
    }

    public double calcularVolumen () {
        return super.calcularArea()*altura;
    }
    public double calcularSuperficie () {
        return 2*super.calcularArea()+super.calcularPerimetro()*altura;
    }
}
