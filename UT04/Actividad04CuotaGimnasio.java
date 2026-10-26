package UT04;

import java.util.Scanner;

public class Actividad04CuotaGimnasio {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la cuota mensual: ");
        double cuotaMensual = teclado.nextDouble();

        System.out.println("Introduce la matricula inicial: ");
        double matricula = teclado.nextDouble();

        System.out.println("Numero de meses: ");
        int meses = teclado.nextInt();

        double pagoTotal = (cuotaMensual*meses)+matricula;

        System.out.println("El pago total es: " +pagoTotal + "Euros");
        
    }
}
