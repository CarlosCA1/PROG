public class Main {
    public static void main(String[] args) {
        Libro quijote = new Libro("Quijote", "Cervantes", 555, 40, 1);
        quijote.setTitulo ("Sesudo estudio sobre el simpático libro del Quijote");
        quijote.setAutor ("Juanjo Millas");

        System.out.println(quijote.getAutor() + " " + quijote.getTitulo());
        if (quijote.venderLibro(5)) System.out.println("Venta realizada");
        else System.out.println("Error en la venta. ¿Hay stock?");
        quijote.registrarEntradaLibro(10);
        if (quijote.venderLibro(5)) System.out.println("Venta realizada");
        else System.out.println("Error en la venta. ¿Hay stock?");
        quijote.setPrecio(-15.0);
        System.out.println("El precio del libro es: " + quijote.getPrecio());

        String [] habMario = {"Cavar", "Salto olímpico", "Voar"};
        String [] equiMario = {"Escudo", "Lanza", "Mangueira", "Pedra", "Pau", "Serra", "Metralleta"};
        Personaxe mario = new Personaxe("Mario Bros", 2,4,-15,50,21,"soldado", habMario, equiMario);
        System.out.println("A velocidade de Mario é " + mario.getVelocidade());

        Centro p1 = new Centro(0,0);
        Centro p2= new Centro(-15);

        p1.setX(-10);

        System.out.println("Coordenada x de p1: " + p1.getX());
        System.out.println("Coordenada y de p1: " + p1.getY());
        System.out.println("Coordenada x de p2: " + p2.getX());
        System.out.println("Coordenada y de p2: " + p2.getY());
        System.out.println(p1.equals(p2));
        System.out.println(p1);


        Fecha fecha = new Fecha(11,2,2025);
        fecha.mostrarFecha();
        Fecha otroDia = new Fecha(10,2,2025);
        otroDia.incrementarDia();
        otroDia.mostrarFecha();
        System.out.println(otroDia);
        System.out.println(fecha.fechaIgual(otroDia));


        Circulo c1 = new Circulo(3,5,4);
        System.out.println(c1.toString());
        System.out.println("Coordenada x de c1: " + c1.getX());
        System.out.println("Área de c1: " + c1.calcularArea());
        System.out.println("Perímetro de c1: " + c1.calcularPerimetro());
        Cilindro c2 = new Cilindro (3,5,5,10);
        System.out.println("Volumen del cilindro: " + c2.calcularVolumen());
        System.out.println("Superficie del cilindro: " + c2.calcularSuperficie());
        System.out.println(c2.toString());
        Prisma pr1 = new Prisma (3,4,6,10);
        System.out.println("Volumen del prisma: " + pr1.calcularVolumen());
        System.out.println("Superficie del prisma: " + pr1.calcularSuperficie());


        System.out.println(CuentaCorriente.getContadorCuentas());
        CuentaCorriente cuenta1 = new CuentaCorriente(1032,"Carlos","0111","35610495D");

        System.out.println(CuentaCorriente.getContadorCuentas());
        CuentaCorriente cuenta2 = new CuentaCorriente(1032,"Pedro","0112","00000026A");
        System.out.println(CuentaCorriente.getContadorCuentas());

        System.out.println("Saldo antes de ingresar dinero: " + cuenta1.getSaldo());
        cuenta1.ingresarDinero(200);
        System.out.println("Saldo después de ingresar dinero: " + cuenta1.getSaldo());

        System.out.println("Saldo antes de retirar dinero: " + cuenta1.getSaldo());
        cuenta1.sacarDinero(200);
        System.out.println("Saldo después de retirar dinero: " + cuenta1.getSaldo());



        Hora hora1 = new Hora (12,33,59,"VEINTICUATRO");
        System.out.println(hora1.toString());


        Lista2 lista = new Lista2();
        lista.añadirUltimo(5);
        lista.añadirUltimo(7);


        CuadradoBis cua1 = new CuadradoBis(2,1,5);
        System.out.println("Superficie cuadrada: "+ cua1.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cua1.calcularPerimetro());

        Cubo cubo = new Cubo (5,3,2);
        System.out.println("Superficie cubo: " + cubo.calcularArea());
        System.out.println("Volumen cubo: " + cubo.calcularVolumen());
        System.out.println("Perímetro cubo: " + cubo.calcularPerimetro());

        Canguro mai = new Canguro("Mai", 14);
        mai.desplazar();
        mai.voz();

        Lista2 l = new Lista2 (new Nodo (1, null));
        l.añadirPrimero(3);
        l.añadirUltimo(15);
        l.mostrarValoresLista();
        l.eliminarPrimero();
        l.eliminarUltimo();
        l.mostrarValoresLista();
    }
    //a
}