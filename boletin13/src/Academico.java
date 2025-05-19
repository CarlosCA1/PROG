import java.util.Objects;

public class Academico implements Comparable<Academico> {
    private String nome;
    private int anoIngreso;

    public Academico(String nome, int anoIngreso) {
        this.nome = nome;
        this.anoIngreso = anoIngreso;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoIngreso() {
        return anoIngreso;
    }

    @Override
    public int compareTo(Academico outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {
        return nome + " (" + anoIngreso + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Academico)) return false;
        Academico that = (Academico) o;
        return anoIngreso == that.anoIngreso && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoIngreso);
    }
}
