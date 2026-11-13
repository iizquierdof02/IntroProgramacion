package UT05;
import java.util.Scanner;
public class PruebaRandom {
    public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);
        int tiradaRandom = (int)(Math.random()*6)+1;
        System.out.println("Introduce un número ( del 1 al 6) ");
        int numUsuario = teclado.nextInt();

        if (tiradaRandom == numUsuario) {
            
            System.out.println("Tirada: " +tiradaRandom);
            System.out.println("Tirada Usuario: " +numUsuario);
            System.out.println("!Enhorabuena has acertado!");


        } else {
            System.out.println("!Has fallado la tirada:" +tiradaRandom);
            System.out.println("Tirada Usuario: " +numUsuario);
            System.out.println("!Vaya has fallado oooooooh!");

        }
        teclado.close();
    }
}
