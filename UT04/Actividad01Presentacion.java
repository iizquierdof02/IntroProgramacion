package UT04;

import java.util.Scanner;

public class Actividad01Presentacion {

    public static void main(String[] args) {
       
    Scanner teclado = new Scanner(System.in);

    System.out.println("¿Cuál es tu nombre?: ");
    String nombre = teclado.nextLine();

    System.out.println("¿Cuál es tu ciudad?: ");
    String ciudad = teclado.nextLine();

    System.out.println("¿Cual es tu edad?: ");

    int edad = teclado.nextInt();

System.out.println("Mi nombre es: " +nombre);
System.out.println("Mi ciudad es: " +ciudad);
System.out.println("Mi edad es: " +edad);

teclado.close();
    }

}
