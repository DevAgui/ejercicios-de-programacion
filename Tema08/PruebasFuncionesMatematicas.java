import misfunciones.FuncionesMatematicas;

public class PruebasFuncionesMatematicas {

  public static void main(String[] args) {

    System.out.println("Introduce un número.");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    /* Comprobación Capicúa */
    if (FuncionesMatematicas.esCapicua(numeroIntroducido)) {
      System.out.println("Tu número es capicúa");
    } else {
      System.out.println("Tu número no es capicúa");
    }

    /* Comprobación Número Primo */
    if (FuncionesMatematicas.esPrimo(numeroIntroducido)) {
      System.out.println("El " + numeroIntroducido + " es primo");
    } else {
      System.out.println("El " + numeroIntroducido + " no es primo");
      System.out.println("El " + FuncionesMatematicas.siguientePrimo(numeroIntroducido) + " es el siguiente primo");
    }

  }
}
