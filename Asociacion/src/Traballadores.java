public class Traballadores {
    private Data dataIngreso;

    public Traballador(String dni, String nome, Data dataIngreso){
        super(dni,nome);
        this.dataIngreso=dataIngreso;

    }

    public Data getDataIngreso() {
        return dataIngreso;
    }

    public void setDataIngreso(Data dataIngreso) {
        this.dataIngreso = dataIngreso;
    }

    public String aCadea(){
        return super.aCadea()+", con data de ingreso: "+dataIngreso.toString();
    }
}
