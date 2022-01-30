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

    /* Comprobación número primo y número primo siguiente */
    if (FuncionesMatematicas.esPrimo(numeroIntroducido)) {
      System.out.println("El " + numeroIntroducido + " es primo");
    } else {
      System.out.println("El " + numeroIntroducido + " no es primo");
      System.out.println("El " + FuncionesMatematicas.siguientePrimo(numeroIntroducido) + " es el siguiente primo");
    }

  /*Exponenciación de un número introducido por teclado*/
    System.out.println("Introduce el número al que quieras exponer  ");
        int exponente = Integer.parseInt(System.console().readLine()) ;
        System.out.println("El resultado de exponer tu número al exponente es: "+ FuncionesMatematicas.potencia((int) numeroIntroducido, exponente));
  
  /*Cuenta el número y te devuelve la posición*/
  System.out.println("Hay " + FuncionesMatematicas.digitos(numeroIntroducido) + " digitos");
  
  }
}
