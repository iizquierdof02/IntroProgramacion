package UT04;
import java.util.Scanner;
public class Actividad05ConversionAlmacenamiento {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la capacidad de información:  ");
        
        double gigabytes = teclado.nextDouble();

        System.out.println("Introduce la capacidad en MB: ");
        double megabytes = teclado.nextDouble();

        System.out.println("Introduce la capacidad en KB:  ");
        
        double kilobytes = teclado.nextDouble();

        double total =gigabytes*megabytes*kilobytes;

        System.out.println("La capacidad total es: " +total);
        

    }
}
