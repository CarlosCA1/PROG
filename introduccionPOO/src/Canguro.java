public class Canguro extends Mamifero{
    public Canguro (String nome, int idade){
        super(nome,idade);
    }

    @Override
    public void desprazar() {

    }

    public void desplazar(){
        System.out.println(getNome() + " móvese dando chimpos");
    }

    public String parir(){
        return "Bebe";
    }
    public void voz(){
        System.out.println("iiiiii");
    }
}
