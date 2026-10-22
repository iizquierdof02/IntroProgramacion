
/*
 public class MarcadorAveriado {
 
public static void main(String[] args) {
String jugador = "Alex";
int puntosIniciales = 500           // Le falta el ; del final 
int enemigosDerrotados = 4;
int puntosPorEnemigo = 75;
double bonus = "50";                // Hay que quitar las "" porque el programa lo trata como tipo texto.
int puntosGanados = enemigosDerrotados + puntosPorEnemigo;
int puntuacionFinal = puntosIniciales + puntosGanados + bonus;
System.out.println("Jugador: " + Jugador);
System.out.println("Puntuación final: " + puntuacionFinal);
}
}
*/
public  class MarcadorAveriado {

    public static void main(String[] args) {
        
        String jugador = "Alex";
        int puntosIniciales = 500;   
        int enemigosDerrotados = 4;
        int puntosPorEnemigo = 75;

        double bonus = 50;
        int puntosGanados = enemigosDerrotados*puntosPorEnemigo;
        int puntuacionFinal = puntosIniciales+puntosGanados+(int)bonus;  // Cambiamos la variable bonus a entero para que el programa pueda operar correctamente
        System.out.println("Jugador: " +jugador);
        System.out.println("Puntación final: " +puntuacionFinal);


    }
}