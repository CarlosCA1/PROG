public class Deportista{
    public String deporte;
    public String clube;
    public int licenza;

    public Deportista (String deporte, String clube, int licenza){
        this.deporte = deporte;
        this.clube = clube;
        this.licenza=licenza;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public int getLicenza() {
        return licenza;
    }

    public void setLicenza(int licenza) {
        this.licenza = licenza;
    }
}
