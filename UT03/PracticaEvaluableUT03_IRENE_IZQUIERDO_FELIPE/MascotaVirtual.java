public class MascotaVirtual {

    public static void main(String[] args) {
     
        String mascota = "Nieve";
        int nivel = 20;
        int energia = 100;
        int experiencia = 55;

     // Durante la partida
     
     energia -= 20;
     experiencia += 150;

     System.out.println("Datos iniciales de la partida");
     System.out.println("Nombre: "+mascota);
     System.out.println("Nivel: " +nivel);
     System.out.println("Energia: " +energia);
     System.out.println("Experiencia: " +experiencia);

     // Despues de la partida

     System.out.println("Despues de la partida");
     System.out.println("Nombre: " +mascota);
     System.out.println("Nivel: " +nivel);
     System.out.println("Energia: " +energia);
     System.out.println("Experiencia: "+experiencia);

    

    }
}
