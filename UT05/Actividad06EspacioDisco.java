package UT05;
import java.util.Scanner;
public class Actividad06EspacioDisco {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Escribe el porcentaje libre del disco: ");

       double porcentaje = teclado.nextDouble();

        if (porcentaje < 0.0 || porcentaje > 100) {
            System.out.println("Valor fuera de rango");
        }
        if (porcentaje < 10.0) {
            System.out.println("Estado: Crítico");

            
        } else if (porcentaje >= 10 && porcentaje <= 25 ) {
            System.out.println("Estado: Bajo");

        }  
        teclado.close();
              
    }
}
