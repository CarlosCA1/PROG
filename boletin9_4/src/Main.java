public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Juan Pérez", "ES1234567890123456789012", 1.5, 1000);
        Conta conta2 = new Conta("Ana Gómez", "ES9876543210987654321098", 1.2, 500);

        System.out.println("Saldo inicial conta1: " + conta1.getSaldo());
        System.out.println("Saldo inicial conta2: " + conta2.getSaldo());

        conta1.ingreso(200);
        System.out.println("Novo saldo conta1: " + conta1.getSaldo());

        conta2.reintegro(100);
        System.out.println("Novo saldo conta2: " + conta2.getSaldo());

        conta1.transferencia(conta2, 150);
        System.out.println("Novo saldo conta1 despois da transferencia: " + conta1.getSaldo());
        System.out.println("Novo saldo conta2 despois da transferencia: " + conta2.getSaldo());
        
        conta1.transferencia(conta2, 2000);
    }
}
