//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/**
 * Imprime un número del 0 al 99 por letra.
 * @version 1.0
 * @author Carlos Costas
 */
                int numero = 20;
                int decenas, unidades;
                String decCadena = "", uniCadena = "";
                decenas = numero / 10;
                unidades = numero % 10;
                switch (decenas) {
                    case 0: decCadena = ""; break;
                    case 1: decCadena = "diez"; break;
                    case 2: decCadena = "veinte"; break;
                    case 3: decCadena = "treinta"; break;
                    case 4: decCadena = "cuarenta"; break;
                    case 5: decCadena = "cincuenta"; break;
                    case 6: decCadena = "sesenta"; break;
                    case 7: decCadena = "setenta"; break;
                    case 8: decCadena = "ochenta"; break;
                    case 9: decCadena = "noventa"; break;
                }

                switch (unidades) {
                    case 0: uniCadena = ""; break;
                    case 1: uniCadena = "uno"; break;
                    case 2: uniCadena = "dos"; break;
                    case 3: uniCadena = "tres"; break;
                    case 4: uniCadena = "cuatro"; break;
                    case 5: uniCadena = "cinco"; break;
                    case 6: uniCadena = "seis"; break;
                    case 7: uniCadena = "siete"; break;
                    case 8: uniCadena = "ocho"; break;
                    case 9: uniCadena = "nueve"; break;
                }

                if (decenas==1) {
                    if (unidades==1)
                        System.out.println("El número es once");
                }
        if (decenas==1) {
            if (unidades==2)
                System.out.println("El número es doce");
        }
        if (decenas==1) {
            if (unidades==3)
                System.out.println("El número es trece");
        }
        if (decenas==1) {
            if (unidades==4)
                System.out.println("El número es catorce");
        }
        if (decenas==1) {
            if (unidades==5)
                System.out.println("El número es quince");
        }
        if (decenas==1) {
            if (unidades==6)
                System.out.println("El número es dieciséis");
        }
        if (decenas==1) {
            if (unidades==7)
                System.out.println("El número es diecisiete");
        }
        if (decenas==1) {
            if (unidades==8)
                System.out.println("El número es dieciocho");
        }
        if (decenas==1) {
            if (unidades==9)
                System.out.println("El número es diecinueve");
        }
        if (decenas==2) {
            if (unidades==1)
                System.out.println("El número es veintiuno");
        }
        if (decenas==2) {
            if (unidades==2)
                System.out.println("El número es veintidós");
        }
        if (decenas==2) {
            if (unidades==3)
                System.out.println("El número es veintitrés");
        }
        if (decenas==2) {
            if (unidades==4)
                System.out.println("El número es veinticuatro");
        }
        if (decenas==2) {
            if (unidades==5)
                System.out.println("El número es veinticinco");
        }
        if (decenas==2) {
            if (unidades==6)
                System.out.println("El número es veintiséis");
        }
        if (decenas==2) {
            if (unidades==7)
                System.out.println("El número es veintisiete");
        }
        if (decenas==2) {
            if (unidades==8)
                System.out.println("El número es veintiocho");
        }
        if (decenas==2) {
            if (unidades==9)
                System.out.println("El número es veintinueve");
        }


        System.out.println("El número es " + decCadena + " y " + uniCadena);
            }
        }