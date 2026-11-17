package UT06;
import java.util.Scanner;
public class Act13ValoracionVideojuego {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int valorar;
        do {
            System.out.println("Introduce la valoración: ");
            valorar = teclado.nextInt();

        } while(!(valorar >= 1 && valorar <= 5));
        teclado.close();
   
    }
}
