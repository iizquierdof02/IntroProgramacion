package UT05;
import java.util.Scanner;

public class Actividad09PlanEntrenamiento {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un objetivo de entrenamiento: ");
        int objetivo = teclado.nextInt();

        switch (objetivo) {
            case 1:

                System.out.println("Fuerza");

                
                break;
        case 2:
            System.out.println("Resistencia");
            break;
            case 3:

                System.out.println("Movilidad");

            default:
            System.out.println("Objetivo introducido no válido");

            break;

        }
        teclado.close();
    }

}
