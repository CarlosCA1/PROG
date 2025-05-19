public abstract class LiñasRegulares extends Navieira implements Facturacion {
     public String categoria;

     public LiñasRegulares (String categoria, String paisOrixe, String nome, int anoBotadura, String matricula, int numeroLicencia, String dataInspeccion, int numeroSalvavidas, double eslora, double volumeAuga, int numeroTripulantes){
          super(paisOrixe, nome, anoBotadura, matricula, numeroLicencia, dataInspeccion, numeroSalvavidas, eslora, volumeAuga, numeroTripulantes);
          this.categoria=categoria;

     }

     public String getCategoria() {
          return categoria;
     }

     public void setCategoria(String categoria) {
          this.categoria = categoria;
     }

     public double calcularFacturacion(double millas){
          double prezoTotal=0;
          if (categoria== "1ª"){
               prezoTotal=7*millas;
          }
          else if (categoria== "turista"){
               prezoTotal = 5*millas;
          }
          return prezoTotal;
     }

     public String aCadea(){
          String aux = "Os pasaxeiros son de categoría" + categoria + " e o barco ten un prezo de " + calcularFacturacion(10) + "euros";
          return super.aCadea()+aux;
     }
}
