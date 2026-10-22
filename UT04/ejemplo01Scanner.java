package UT04;

import java.util.Scanner;

public class ejemplo01Scanner {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre =  teclado.nextLine();
        System.out.println("Nombre: "+nombre);
        
        teclado.close();
    }
    
}
