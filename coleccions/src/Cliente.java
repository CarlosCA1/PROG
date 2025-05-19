import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Cliente implements Comparable<Cliente>{
    String dni;
    String nome;
    LocalDate dataNacemento;

    public Cliente (String dni, String nome, String dataNacemento) {
       this.dni=dni;
       this.nome=nome;
       DateTimeFormatter formatoDatas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       this.dataNacemento = LocalDate.parse(dataNacemento, formatoDatas);
    }

    int idade(){
        return (int) dataNacemento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(Cliente outro) {
        /*
        int res = 0;
        if (this.idade()>outro.idade()) res=1;
        if (this.idade()< outro.idade()) res=-1;
        */
        return this.idade()- outro.idade();
    }

    @Override
    public String toString() {
        return "DNI: "+ dni + " Nome: " + nome + " Data de nacemento: " + dataNacemento.toString();
    }

    public boolean equals (Object outro){
        Cliente cliente2= (Cliente)outro;
        return this.dni.equals((cliente2.dni));
    }
}
