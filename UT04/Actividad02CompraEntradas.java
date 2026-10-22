package UT04;
import java.util.Scanner;
public class Actividad02CompraEntradas {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cual es el precio de la entrada?: ");
        double precioEntrada = teclado.nextDouble();

        System.out.println("Introduce el numero de las entradas: ");
        int numEntradas = teclado.nextInt();

        double precioTotal = precioEntrada * numEntradas;

        System.out.println("El importe total de la compra es: " +precioTotal);

        teclado.close();
    }
}
