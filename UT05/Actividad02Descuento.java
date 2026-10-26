package UT05;
import java.util.Scanner;

public class Actividad02Descuento {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el importe de la compra: ");

        double importe = teclado.nextDouble();

        if (importe >= 60.0) {

            double importeDescuento = importe - (importe * (10/100));
            importe = importeDescuento;
            

            
        }
        System.out.println("Importe final: " +importe);
        
        teclado.close();
    }    

}
