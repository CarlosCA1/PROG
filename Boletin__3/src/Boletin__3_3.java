package org.example;
import java.util.Scanner;
public class Boletin__3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double num1 = scanner.nextDouble();
        if (num1>0) {
            System.out.println("+");
        }

        if (num1==0) {
            System.out.println("0");
        }

        if (num1<0) {
            System.out.println("-");
        }

        scanner.close();
    }
}