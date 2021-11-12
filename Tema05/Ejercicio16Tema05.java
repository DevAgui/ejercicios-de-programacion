/**
 * Éste programa te va a decir si el número introducido por pantalla es primo o
 * no.
 * 
 * @author Diego Aguilera Martin
 */
public class Ejercicio16Tema05 {
  public static void main(String[] args) {
    System.out.println();
    System.out.println(
        "Éste programa te va a decir si tú numero es primo o no. Para ello introduce sólo números enteros y positivos.\n");

    System.out.println("Por favor, introduce el número que quieras saber si es primo o no (se da por hecho que el 0 y el 1 no son primos): ");
    long numero = Long.parseLong(System.console().readLine());

    int contador = 0;
    do {
      contador++;
      long moduloDivisionPrimo = numero % numero;
      long moduloDivisionUno = numero % 1;
      long pruebaPrimoOno = numero % 4;
      if ((moduloDivisionPrimo == 0) && (moduloDivisionUno == 0) && (pruebaPrimoOno != 0)) {
        System.out.println("Tu número es primo");
      } else{
        System.out.println("Tu número no es primo");
      }
    } while (contador == 0);
  }
}
