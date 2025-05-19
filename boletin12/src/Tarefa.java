public class Tarefa {
    private String data;
    private String hora;
    private String duracion;
    private String nomeTarea;
    private String descricion;
    private String estado;

    public Tarefa (String data, String hora, String duracion, String nomeTarea, String descricion, String estado){
        this.data=data;
        this.hora=hora;
        this.duracion=duracion;
        this.nomeTarea= nomeTarea;
        this.descricion=descricion;
        this.estado=estado;
    }
}
