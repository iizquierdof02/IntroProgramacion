public class Actividad03EligeTipos {

    public static void main(String[] args) {

        /*
         * UT3 - ACTIVIDADES 3: ELIGE LOS TIPOS
         *
         * Ya no se indica qué tipo debes utilizar.
         * Analiza cada dato antes de crear la variable.
         */

        // ============================================================
        // ACTIVIDAD 1. FESTIVAL DE MÚSICA
        // ============================================================
        // Guarda:
        // - nombre del festival;
        // - número de días;
        // - precio de la entrada;
        // - si incluye zona de acampada;
        // - letra de la zona asignada.
        //
        // Muestra todos los datos por pantalla.
/* 
        String nombreDelfestival = "Madrid salvaje";
        int dias = 3;
        double precioEntrada = 70.35;
        boolean zonaAcampada = true;
        char letraZonaasignada = 'A';

        System.out.println("FESTIVAL DE MÚSICA");
        System.out.println("nombreDelfestival: "+nombreDelfestival);
        System.out.println("dias: "+dias);
        System.out.println("precioEntrada: " +precioEntrada);
        System.out.println("boolean: "+zonaAcampada);
        System.out.println("letraZonasignada: " +letraZonaasignada);
        
*/



        // ============================================================
        // ACTIVIDAD 2. PERFIL DE VIDEOJUEGO
        // ============================================================
        // Guarda:
        // - nombre del jugador;
        // - nivel;
        // - número de partidas;
        // - puntuación media;
        // - si tiene una suscripción activa.
        //
        // Elige tú los tipos y muestra una ficha del jugador.
/*

String nombreJugador = "Mario";
        int nivel = 12;
        int numeroPartidas = 23;
        double puntuaciónMedia = 56.7;
        boolean suscripciónActiva = true;

        System.out.println("PERFIL DE VIDEOJUEGO");
        System.out.println("NombreJugador: "+nombreJugador);
        System.out.println("Nivel: "+nivel);
        System.out.println("PuntuaciónMedia: "+puntuaciónMedia);
        System.out.println("NumeroPartidas: "+numeroPartidas);
        System.out.println("SuscripcionActiva: "+suscripciónActiva);

     */

        // ============================================================
        // ACTIVIDAD 3. CONFIGURACIÓN DE PC
        // ============================================================
        // Guarda información sobre un PC:
        // - nombre del equipo;
        // - cantidad de RAM en GB;
        // - almacenamiento en GB;
        // - precio;
        // - si tiene tarjeta gráfica dedicada.
        //
        // Elige tú los tipos.
        // Después muestra una ficha clara del equipo.

        String nombreEquipo = "Asus Zenbook";
        int cantidadRAM = 16;
        int almacenamiento = 1;
        double precio = 1000;
        boolean graficaDedicada = false;

        System.out.println("CONFIGURACIÓN DEL PC");
        System.out.println("NombreEquipo: "+nombreEquipo);
        System.out.println("CantidadRAM: " +cantidadRAM);
        System.out.println("Almacenamiento: "+almacenamiento);
        System.out.println("Precio: "+precio);
        System.out.println("GraficaDedicada: "+graficaDedicada);


        // ============================================================
        // ACTIVIDAD 4. PIENSA ANTES DE PROGRAMAR
        // ============================================================
        // Un número de teléfono puede estar formado solo por cifras.
        //
        // ¿Lo guardarías necesariamente como un número?
        //
        // Crea una variable para un teléfono ficticio y piensa qué tipo
        // representa mejor el dato si NO vamos a hacer operaciones
        // matemáticas con él.
        //
        // Añade un comentario explicando tu decisión.

        String numeroFicticio = "7349384838"; // Como va a ser un dato que no vamos a hacer con el ningun tipo de operación lo almacenamos como una cadena de caracteres.
        System.out.println("El número ficticio es: "+numeroFicticio);

        
    }
}
