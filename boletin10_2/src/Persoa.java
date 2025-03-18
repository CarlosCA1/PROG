import java.util.Date;

public abstract class Persoa {
    protected String dni;
    protected String nome;
    protected Date dataAlta;

    public Persoa(String dni, String nome, Date dataAlta) {
        this.dni = dni;
        this.nome = nome;
        this.dataAlta = dataAlta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public abstract String aCadea();

    public abstract double gastosIngresos();
}
