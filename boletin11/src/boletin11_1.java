class DniNonValidoException2 extends Exception {
    public DniNonValidoException2(String message) {
        super(message);
    }
}

class Persoa2 {
    private String dni;

    public void setDni(String dni) throws DniNonValidoException2 {
        if (!dni.matches("\\d{8}[A-Za-z]")) {
            throw new DniNonValidoException2("DNI non válido: " + dni);
        }
        this.dni = dni;
    }
}

class Deportista2 extends Persoa {
    private String licenza;

    public void setLicenza(String licenza) throws IllegalArgumentException {
        if (!licenza.matches("\\d{4}(fut|bal|ten|nat|atl)\\d{6}")) {
            throw new IllegalArgumentException("Formato de licenza incorrecto: " + licenza);
        }
        this.licenza = licenza;
    }
}

public class boletin11_1 {
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
