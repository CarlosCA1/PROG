public abstract class MembroAsociacion{
    private String DNI;
    private String nome;

    public MembroAsociacion(String DNI, String nome){
        this.DNI=DNI;
        this.nome=nome;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
