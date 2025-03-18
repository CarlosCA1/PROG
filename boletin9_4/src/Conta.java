public class Conta {
    private String nomeCliente;
    private String numeroConta;
    private double tipoInterese;
    private double saldo;

    public Conta() {
        this.nomeCliente = "";
        this.numeroConta = "";
        this.tipoInterese = 0.0;
        this.saldo = 0.0;
    }

    public Conta(String nomeCliente, String numeroConta, double tipoInterese, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.tipoInterese = tipoInterese;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getTipoInterese() {
        return tipoInterese;
    }

    public void setTipoInterese(double tipoInterese) {
        this.tipoInterese = tipoInterese;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso(double cantidade) {
        if (cantidade > 0) {
            saldo += cantidade;
            System.out.println("Ingreso de " + cantidade + " realizado correctamente.");
        } else {
            System.out.println("A cantidade do ingreso debe ser positiva.");
        }
    }

    public void reintegro(double cantidade) {
        if (cantidade > 0 && cantidade <= saldo) {
            saldo -= cantidade;
            System.out.println("Reintegro de " + cantidade + " realizado correctamente.");
        } else if (cantidade <= 0) {
            System.out.println("A cantidade do reintegro debe ser positiva.");
        } else {
            System.out.println("Non hai suficiente saldo para realizar o reintegro.");
        }
    }

    public void transferencia(Conta contaDestino, double importe) {
        if (importe > 0 && importe <= saldo) {
            this.reintegro(importe);
            contaDestino.ingreso(importe);
            System.out.println("Transferencia de " + importe + " realizada correctamente.");
        } else if (importe <= 0) {
            System.out.println("A cantidade da transferencia debe ser positiva.");
        } else {
            System.out.println("Non hai suficiente saldo na conta orixe para realizar a transferencia.");
        }
    }
}

