public class Voluntarios extends Traballadores implements CalculoGastosIngresos {
    private int idade;
    private String profesion;
    private double horas;

    public Voluntarios(String dni, String nome, Data dataIngreso, int edade, String profesion, double horas){
        super(dni, nome, dataIngreso);
        setIdade(idade);
        setProfesion(profesion);
        setHoras(horas);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = Math.abs(idade);
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = Math.abs(horas);
    }
    public String aCadea(){
        String aux=", con idade de "+idade+", con  profesion"+profesion+", traballa "+horas+" horas";
        return super.aCadea()+aux;
    }

    public double gastosIngresos() {
        return 0;
    }
}