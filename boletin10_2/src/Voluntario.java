import java.util.Date;
public class Voluntario extends Traballador {
    private int idade;
    private String profesión;
    private int horasAdicadas;

    public Voluntario(String dni, String nome, Date dataAlta, int idade, String profesión, int horasAdicadas) {
        super(dni, nome, dataAlta);
        this.idade = idade;
        this.profesión = profesión;
        this.horasAdicadas = horasAdicadas;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfesión() {
        return profesión;
    }

    public void setProfesión(String profesión) {
        this.profesión = profesión;
    }

    public int getHorasAdicadas() {
        return horasAdicadas;
    }

    public void setHorasAdicadas(int horasAdicadas) {
        this.horasAdicadas = horasAdicadas;
    }

    @Override
    public String aCadea() {
        return "Voluntario: " + nome + ", DNI: " + dni + ", Data Alta: " + dataAlta + ", Idade: " + idade +
                ", Profesión: " + profesión + ", Horas Adicadas: " + horasAdicadas;
    }

    @Override
    public double gastosIngresos() {
        return -3; // Gasto de 3 € por mes en seguro
    }
}

