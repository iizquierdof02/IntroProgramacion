package UT05;
import java.util.Scanner;
public class comprobarHorario {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
/*        System.out.println("Introduce la hora (0-23) : ");

        int hora = teclado.nextInt();

        boolean valido = (hora >= 0) && (hora <= 23);
    
        System.out.println("Validez de la hora: " +valido);

        boolean mañana = (hora > 8) && (hora < 13);

        System.out.println("Horario de manaña: " +mañana);
*/

      double horaAleatoria = Math.random();
        System.out.println(horaAleatoria);
        int dado = (int)(Math.random()*6) + 1;

        System.out.println(dado);
        

        teclado.close();

    }
    
}

