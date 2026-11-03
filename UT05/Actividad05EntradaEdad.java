import java.util.Scanner;

public class Actividad05EntradaEdad {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");

        int edad = teclado.nextInt();

        if ( edad < 0) {
           System.out.println("No se admiten edades negativas");


        } else if  (edad < 12) {

            System.out.println("La entrada vale 5 euros");



        } else if (edad <= 17) {
            System.out.println("La entrada vale 8 euros");


        } else if ( edad  <= 18 ) {
            System.out.println("La entrada vale 12 euros");
            
        }

        teclado.close();
     }
     
}


