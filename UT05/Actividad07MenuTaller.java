package UT05;
import java.util.Scanner;
public class Actividad07MenuTaller {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una opcion: ");
        int opcion = teclado.nextInt();
  
        int limpieza = 20;
        int instalacion = 45;
        int sustitución = 30;

        switch (opcion) {
            case 1:
                System.out.println("Limpieza:" +limpieza);

                
                break;
        case 2:
            System.out.println("Instalacion sistema operativo:" +instalacion);
            break;

        case 3:
            System.out.println("Sustitución de RAM:" +sustitución);
             break;
                  
            default:
                System.out.println("Ese servicio no existe");
                break;

        }
        teclado.close();

        
    }
}
