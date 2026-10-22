package UT04;

import java.util.Scanner;

public class ejemplo02Scanner {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // Entrada por teclado de un num entero

        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();

        // Entrada de num entero
        System.out.println("Introduce el precio: ");

        double precio = teclado.nextDouble();

        // Entrada de string
        System.out.println("Introduce tu usuario: ");
        
    }
}
