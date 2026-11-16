package UT06;
import java.util.Scanner;
public class CuentaAtras {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número para la cuenta atrás: ");
        int numInicial = teclado.nextInt();
        if (numInicial <= 0) {
            System.out.println("Valor no válido, debe ser positivo");
        } else {
            while (numInicial >=0) {
                System.out.println("Cuenta: " +numInicial);
                numInicial--;
            }
        }

        teclado.close();    
        }
    }

