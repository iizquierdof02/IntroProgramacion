package UT06;
import java.util.Scanner;

public class Act1AvisoEstudio {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int contador = 5;

        while (contador > 0) {
            System.out.println("Haz una pausa y revisa tu postura");
            contador--;
        }
        System.out.println("Recordatorio Completado");
        teclado.close();
    }
    
}

