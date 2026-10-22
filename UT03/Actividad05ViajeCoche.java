public class Actividad05ViajeCoche {

    public static void main(String[] args) {

        /*
         * UT3 - ACTIVIDAD 5: VIAJE EN COCHE
         *
         * Queremos estimar cuánto cuesta el combustible de un viaje.
         */

        double kilometros = 420.0;
        double consumoCada100Km = 6.5;
        double precioLitro = 1.55;
        int personas = 4;

        // ============================================================
        // PARTE 1. LITROS NECESARIOS
        // ============================================================
        // Un coche consume 6.5 litros cada 100 km.
        //
        // Calcula cuántos litros necesita aproximadamente
        // para recorrer 420 km.
        //
        // Pista:
        // piensa primero cuántos grupos de 100 km hay en el viaje.

        double gruposKM100 = (kilometros/100);
        System.out.println(gruposKM100);
        double consumoTotal = gruposKM100*consumoCada100Km;
        System.out.print(consumoTotal);

        // ============================================================
        // PARTE 2. COSTE DEL COMBUSTIBLE
        // ============================================================
        // Utiliza los litros calculados anteriormente y precioLitro
        // para obtener el coste total del combustible.
        double costeCombustible = consumoTotal * precioLitro;

        System.out.println("El coste del combustible es:"+costeCombustible +  " euros ");

        // ============================================================
        // PARTE 3. REPARTO
        // ============================================================
        // Si viajan 4 personas, calcula cuánto tendría que pagar
        // cada una si reparten el combustible a partes iguales.

        double costePersonas = costeCombustible/personas;
        System.out.println("El coste por personas es " +costePersonas + " euros");


        // ============================================================
        // PARTE 4. RESUMEN
        // ============================================================
        // Muestra un resumen parecido a:
        //
        // VIAJE DE FIN DE SEMANA
        // Distancia: 420.0 km
        // Consumo: 6.5 L/100 km
        // Litros necesarios: ...
        // Coste combustible: ... €
        // Personas: 4
        // Coste por persona: ... €
        //
        // Modifica después kilometros, consumoCada100Km y personas.
        // ¿El programa sigue calculando correctamente?

        System.out.println("VIAJE DE FIN DE SEMANA");
        System.out.println("Distancia: "  +kilometros + "Km");
        System.out.println("Consumo: " +kilometros +  "Km");
        System.out.println("Litros Necesarios: " +costeCombustible + "litros");
        System.out.println("Personas: " +personas);
        System.out.println("Coste por persona "+costePersonas);

    }
}
