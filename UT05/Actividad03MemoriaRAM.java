package UT05;
import java.util.Scanner;
public class Actividad03MemoriaRAM {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la memoria RAM de un equipo: ");

        int memoria = teclado.nextInt();

        if (memoria > 0) {

            if(memoria >= 16) {
                System.out.println("Requimiento de memoria válido ");

            }
          if (memoria <16) {

        System.out.println("La memoria introducida no valida "); 
            
          }
    

        }
        
        if (memoria <=0) {
            System.out.println("Valor introducido de memoria no válido");

        }
        teclado.close();        
     
    }
    
}
