import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersion Java");
        //System.out.println("Pelicula Matrix");
        // Declaracion de variables

      int fechaDeLanzamiento = 1999;
      double evaluacion = 4.5;
      boolean IncluidoEnElPlanBasico = true;
      String nombre = "Matrix";
      String sinopsis = """
              La Mejor pelicula del fin del milenio
              """;
       double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula:" + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(IncluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media Evaluacion de matrix:" + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula Popular del momento");
        } else {
            System.out.println("Peicula Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula" + " Matrix calculada por el usuario es: " + mediaEvaluacionUsuario/3);

    }
}