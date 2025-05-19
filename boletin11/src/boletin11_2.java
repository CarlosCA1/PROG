class DniNonValidoException extends Exception {
    public DniNonValidoException(String message) {
        super(message);
    }
}

class Persoa {
    private String nome;
    private String direccion;
    private String dni;

    public void setDni(String dni) throws DniNonValidoException {
        if (!dni.matches("\\d{8}[A-Za-z]")) {
            throw new DniNonValidoException("DNI non válido: " + dni);
        }
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }
}

class Deportista extends Persoa {
    private String deporte;
    private String clube;
    private String licenza;

    public void setLicenza(String licenza) throws IllegalArgumentException {
        if (!licenza.matches("\\d{4}(fut|bal|ten|nat|atl)\\d{6}")) {
            throw new IllegalArgumentException("Formato de licenza incorrecto: " + licenza);
        }
        this.licenza = licenza;
    }

    public String getLicenza() {
        return licenza;
    }
}

public class boletin11_2 {
    public static void main(String[] args) {
        try {
            Persoa p = new Persoa();
            p.setDni("12345678Z");  // DNI válido

            Deportista d = new Deportista();
            d.setLicenza("2025fut123456");  // Licenza válida

            System.out.println("DNI e licenza establecidos correctamente.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
