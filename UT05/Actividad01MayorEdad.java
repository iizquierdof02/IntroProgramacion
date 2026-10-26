package UT05;
import java.util.Scanner;
public class Actividad01MayorEdad {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();

        boolean mayorEdad = (edad >= 18);
        System.out.println("Mayor de edad: " +mayorEdad);

        teclado.close();

    }

}


