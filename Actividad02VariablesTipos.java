public class Actividad02VariablesTipos {

    public static void main(String[] args) {

        /*
         * UT3 - ACTIVIDADES 2: VARIABLES Y PRIMEROS TIPOS
         *
         * En las primeras actividades tendrás pistas sobre el tipo.
         * Después tendrás que empezar a decidir tú.
         */

        // ============================================================
        // ACTIVIDAD 1. MI PERFIL
        // ============================================================
        // Crea estas variables:
        //
        // nombre       -> String
        // edad         -> int
        // altura       -> double
        // tieneCarnet  -> boolean
        //
        // Puedes utilizar datos inventados.
        //
        // Después muestra una ficha parecida a:
        //
        // MI PERFIL
        // Nombre: Alex
        // Edad: 18 años
        // Altura: 1.78 m
        // Tiene carnet: false

        String nombre = "Irene";
        int edad = 18;
        double altura = 1.60;
        boolean tieneCarnet = false;
        
        System.out.println("MI PERFIL ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Altura: "+altura);
        System.out.println("tieneCarnet: "+tieneCarnet);

        // ============================================================
        // ACTIVIDAD 2. MI COCHE IDEAL
        // ============================================================
        // Crea variables para guardar:
        //
        // marca        -> String
        // modelo       -> String
        // potencia     -> int
        // precio       -> double
        // electrico    -> boolean
        //
        // Muestra después toda la información.
        
        String marca = "Mercedes Benz";
        String modelo = "AMG Clase C";
        int potencia = 300;
        double precio = 300.000;
        boolean electrico = true;

        System.out.println("MI COCHE IDEAL ");
        System.out.println("Marca "+marca);
        System.out.println("Modelo "+modelo);
        System.out.println("Potencia "+potencia);
        System.out.println("Precio "+precio);
        System.out.println("Electrico "+electrico);


        // ============================================================
        // ACTIVIDAD 3. SESIÓN DE GIMNASIO
        // ============================================================
        // Ahora tienes menos pistas.
        //
        // Guarda en variables:
        // - nombre del ejercicio; ---- String
        // - número de series;          ---- int
        // - número de repeticiones;        --- int
        // - peso utilizado;        --- double
        // - si has completado la sesión. --- boolean
        //
        // Decide qué tipo utilizar para cada dato.
        //
        // Muestra después un resumen de la sesión.

        String nombreDelejercicio = "Burpee";
        int series = 10;
        int repeticiones = 20;
        double pesoUtilizado = 60;
        boolean hasCompleadolaSesion = false;

        System.out.println("SESIÓN DE GIMNASIO");
        System.out.println("NombreDelejercicio: "+nombreDelejercicio);
        System.out.println("Series: "+series);
        System.out.println("Repeticiones: "+repeticiones);
        System.out.println("pesoUtilizado: "+pesoUtilizado);
        System.out.println("HasCompletadolaSesion: "+hasCompleadolaSesion);
        

        // ============================================================
        // ACTIVIDAD 4. CAMBIO DE VALORES
        // ============================================================
        // Un gimnasio comienza el día con 35 taquillas libres.
        //
        // 1. Crea una variable para almacenarlo.
        // 2. Muestra su valor.
        // 3. Cambia su valor a 28.
        // 4. Vuelve a mostrarlo con el mensaje:
        //
        // Taquillas libres: 28

        int taquillasLibres = 35;
        System.out.println("Las taquillas libres del gimnasio son: "+taquillasLibres);
        taquillasLibres = 28;
        System.out.println("TaquillasLibres "+taquillasLibres);

    }
}
