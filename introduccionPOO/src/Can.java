public class Can extends Mamifero implements Comunicacion{

    public Can (String nome, int idade){
        super(nome, idade);
    }

    public String parir (){
        return "Un canciño";
    }

    public void desprazar (){
        System.out.println("Corre");
    }

    public void ronroneo (){
        System.out.println("rrrrr");
    }

    public void voz (){
        System.out.println("Guau guau");
    }
}
