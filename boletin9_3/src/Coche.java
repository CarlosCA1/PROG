public class Coche {
    private int velocidade;

    public Coche() {
        this.velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar(int valor) {
        if (valor > 0) {
            velocidade += valor;
        }
    }

    public void frenar(int menos) {
        if (menos > 0 && velocidade - menos >= 0) {
            velocidade -= menos;
        } else if (menos > 0) {
            velocidade = 0;
        }
    }
}

