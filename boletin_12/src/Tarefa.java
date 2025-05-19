import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class Tarefa implements Serializable {
    private LocalDate data;
    private LocalTime hora;
    private int duracion; // en minutos
    private String nome;
    private String descripcion;
    private boolean feita;

    public Tarefa(LocalDate data, LocalTime hora, int duracion, String nome, String descripcion, boolean feita) {
        this.data = data;
        this.hora = hora;
        this.duracion = duracion;
        this.nome = nome;
        this.descripcion = descripcion;
        this.feita = feita;
    }

    public LocalDate getData() { return data; }
    public LocalTime getHora() { return hora; }
    public int getDuracion() { return duracion; }
    public String getNome() { return nome; }
    public String getDescripcion() { return descripcion; }
    public boolean isFeita() { return feita; }

    public void setData(LocalDate data) { this.data = data; }
    public void setHora(LocalTime hora) { this.hora = hora; }
    public void setDuracion(int duracion) { this.duracion = duracion; }
    public void setNome(String nome) { this.nome = nome; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setFeita(boolean feita) { this.feita = feita; }

    @Override
    public String toString() {
        return "Tarefa: " + nome + "\nData: " + data + " " + hora + "\nDuración: " + duracion + " min\nDescrición: "
                + descripcion + "\nEstado: " + (feita ? "Feita" : "Non feita") + "\n";
    }
}
