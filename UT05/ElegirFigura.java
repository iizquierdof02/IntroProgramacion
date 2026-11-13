package UT05;
import java.util.Scanner;

public class ElegirFigura {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una figura entre el 1 y 3");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has elegido un círculo. ");
                break;
            case 2:
                System.out.println("Has elegido un cuadrado.");
                break;
            case 3:
                System.out.println("Has elegido un triangulo");

            default:
                System.out.println("La opción no es válida");
                break;
        }

        teclado.close();
        
    }
}
