public class RetoPasos {
    public static void main(String[] args) {
        
        // Almacenamos en cada variable los pasos de cada dia
        int pasosLunes = 1000;
        int pasosMartes = 2000;
        int pasosMiercoles = 1500;
        int pasosJueves = 7000;
        int pasosViernes = 10000;
        int pasosSabado = 3000;
        int pasosDomingo = 3500;

      int totalPasos = pasosLunes+pasosMartes+pasosMiercoles+pasosJueves+pasosViernes+pasosSabado+pasosDomingo;
      
      double mediaDiaria = totalPasos/5.0;
     
      int objetivoSemanal = 5000;
      int pasosFaltantes = objetivoSemanal - totalPasos;

      System.out.println("Informe semanal de los pasos");
      System.out.println("Pasos Lunes: " +pasosLunes);
      System.out.println("Pasos Martes: " +pasosMartes);
      System.out.println("Pasos Miercoles: " +pasosMiercoles);
      System.out.println("Pasos Jueves: " +pasosJueves);
      System.out.println("Pasos Viernes: " +pasosViernes);
      System.out.println("Pasos Sabado: " +pasosSabado);
      System.out.println("Pasos Domingo: " +pasosDomingo);

      System.out.println("Pasos Total Semana: " +totalPasos);
      System.out.println("Media diaria Pasos: " +mediaDiaria);
      System.out.println("Objetivo Semanal: " +objetivoSemanal);
      System.out.println("Pasos Faltantes para el objetivo: " +pasosFaltantes);
      
    }
}
