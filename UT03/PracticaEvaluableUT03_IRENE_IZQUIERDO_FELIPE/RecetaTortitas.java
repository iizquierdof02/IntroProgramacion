public class RecetaTortitas {
  public static void main(String[] args) {
    
    int harina = 200;
    int leche = 300;
    int huevos = 2;

    int personas = 6/2;

    // Hacemos los calculos para 6 personas.

    int cantidadHarina = harina*personas;
    int cantidadLeche = leche*personas;
    int cantidadHuevos = huevos*personas;

    System.out.println("Cantidad original para 2 personas");
    System.out.println("Harina: "  + harina +  "gramos");
    System.out.println("Leche: " + leche +  "militros");
    System.out.println("Huevos: " +huevos);

    System.out.println("Cantidades para 6 personas");
    System.out.println("Harina: " +cantidadHarina + "gramos");
    System.out.println("Leche: "+cantidadLeche +   "militros");
    System.out.println("Huevos: " +cantidadHuevos);

  }  
}
