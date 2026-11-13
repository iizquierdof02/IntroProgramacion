package UT05;
import java.util.Scanner;
public class Actividad08ZonaConcierto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la zona del concierto (A, B o C): ");
        String zona = teclado.nextLine().toUpperCase();
        System.out.println("Introduce el número de entradas: ");
        int numEntradas = teclado.nextInt();
        double precioEntrada = 0.0;
        
        switch (zona) {
            case "A":
                precioEntrada = 100.0;
                break;
            case "B":
                precioEntrada = 80.0;
                break;
            case "C":
                precioEntrada = 50.0;
                break;
            default:
                System.out.println("Zona no válida.");
                return;
        }
        
        double total = precioEntrada * numEntradas;
        System.out.println("El precio total es: " + total + " euros.");
    }
teclado.close();
}
 

        
       