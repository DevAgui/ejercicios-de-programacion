/**
 * Éste programa nos va a leer una lista de 10 números, y va a determinar
 * cuántos son positivos y cuántos negativos.
 * 
 * @author Diego Aguilera Martin
 */
public class Ejercicio13Tema05 {
  public static void main(String[] args) {
    System.out.println();
    System.out.println(
        "Éste programa va a decirte cuántos números son positivos y cuántos números negativos de un máximo de 10 números, introducidos por teclado. \n");
    int numeroPositivo = 0;
    int numeroNegativo = 0;
    int contabilizador = 10;
    do {
      System.out.println("Introduce los números que quieras (un máximo de 10): \n");
      long numero = Long.parseLong(System.console().readLine());
      if (numero >= 0) {
        numeroPositivo++;
      } else {
        numeroNegativo++;
      }
      contabilizador--;
    } while (contabilizador > 0);
    System.out.printf("Has introducido un total de %2d números positivo/s. \n", numeroPositivo);
    System.out.printf("Además, has introducido un total de %2d números negativo/s. ", numeroNegativo);

  }
}