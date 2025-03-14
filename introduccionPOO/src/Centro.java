public class Centro {
    private double x;
    private double y;

    public Centro(){
        x=0;
        y=0;
    }
    public Centro(double w){
        setX (w);
        setY(w);
    }
    public Centro(int w){
        setX (w);
        setY(w);
    }
    public Centro(double x, double y){
        setX (x);
        setY(y);
    }
    public Centro(int x, int y) {
        setX (x);
        setY(y);
    }
    public double getX(){
        return x;
    }
    public void setX(double x){
        if (x>= 0) this.x=x;
        else this.x=0;
    }
    public void setX(int x){
        if (x>= 0) this.x=x;
        else this.x=0;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        if (y>= 0) this.y=y;
        else this.y=0;
    }
    public void setY(int y){
        if (y>= 0) this.y=y;
        else this.y=0;
    }

    public boolean equals(Centro otroPunto) {
        if ((x == otroPunto.x) && (y==otroPunto.y)) return true;
        else return false;
    }
    public String toString (){
        return "La coordenada x de " +this.getClass()+ " es: " + x + "\nLa coordenada y de "  + this.getClass()+ " es: "+ y;
    }
}