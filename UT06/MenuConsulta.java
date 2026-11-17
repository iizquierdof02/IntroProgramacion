package UT06;
import java.util.Scanner;

// Clase de ejemplo de bucle do-while

public class MenuConsulta {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("1.Consulta horario del taller");
            System.out.println("2. Consultar puestos disponibles");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                System.out.println("Horario Simulado: de 9 a 14");
                    
                    break;
                case 2:
                    System.out.println("Hay 4 puestos disponibles"); 
                    break;
                

            
                default:
                    System.out.println(opcion);

                    break;
            }

        } while (opcion!=0); 
        teclado.close();        
        }
  
    
    };

