package UT05;

import java.util.Scanner;

public class Actividad04Calificacion {
    
    public static void main(String[] args) {
        
       Scanner teclado  =  new Scanner(System.in);

       System.out.println("Introduce un valor: ");

       double nota = teclado.nextDouble();

       if ((nota <= 10)&&((nota >= 0))) {
            if (nota < 5) {
                System.out.println("Insuficiente");

                
            } else {

                if ( nota < 6) {
                    System.out.println("Suficiente");

                } else {

                    if ( nota < 7) {
                        System.out.println("Bien");

                    } else {
                        if (nota < 7) {
                            System.out.println("Notable");

                        } else {
                            if (nota < 9) {
                                System.out.println("Sobresaliente");
                                
                            }
                        }
                    }
                }
            }

       }    else {

        System.out.println("Valor introducido no valido (tiene que estar entre 0 y 10");


       }
    }
}
