public class Hora {
    enum FormatoHora {DOCE, VEINTICUATRO}
    private FormatoHora formato;
    private int horas;
    private int minutos;
    private int segundos;

    public Hora (int horas, int minutos, int segundos,String formato){
        setFormato(formato);
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas>=0 && horas<=24) this.horas = horas;
        else this.horas=0;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos>=0 && minutos<60) this.minutos = minutos;
        else this.minutos=0;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos>=0 && segundos<60) this.segundos = segundos;
        else this.segundos=0;
    }

    public FormatoHora getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        if (formato.toUpperCase().equals("DOCE") || formato.toUpperCase().equals("VEINTICUATRO")){
            this.formato = FormatoHora.valueOf(formato);
        }
        else {
            if (formato.equals("12")){
                this.formato=FormatoHora.DOCE;
            }
            else{
                    this.formato=FormatoHora.VEINTICUATRO;
            }
        }
    }

    public String toString() {
        String cadenaHora;
        if (formato==FormatoHora.DOCE){
            cadenaHora = "La hora es: "+horas+":"+minutos+":"+segundos;
        }
        else{
            if(horas>11) cadenaHora = "La hora es: "+(horas-12)+":"+minutos+":"+segundos+" PM";
            else cadenaHora = "La hora es: "+horas+":"+minutos+":"+segundos;
        }
        return cadenaHora;
    }
}
