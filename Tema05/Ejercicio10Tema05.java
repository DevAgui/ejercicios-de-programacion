/**
 * Ejercicio 10 Tema 5. Éste programa nos calcula la media de unos números
 * introducidos por teclado, y en el momento en el que se introduce un número
 * negativo por pantalla el mismo se detiene.
 * 
 * @author Diego Aguilera Martín
 */
public class Ejercicio10Tema05 {
  public static void main(String[] args) {

    System.out.println("Bienvenido al calculador de medias. Por favor, introduzca sólo números enteros. En el momento en el que introduzca un número negativo el programa parará.");
    System.out.println();
    int numeroIteraciones = 0;
    int numero = 0;
    int sumaNumeros = 0;

    do {
      System.out.println("Por favor, introduzca el número");
      numero = Integer.parseInt(System.console().readLine());
      if (numero >= 0) {

        sumaNumeros = numero + sumaNumeros;
        numeroIteraciones++;

      }

    } while (numero >= 0);

    System.out.println();
    int mediaNumeros = sumaNumeros / numeroIteraciones;
    System.out.println("La media de números introducidos es de: " + mediaNumeros);

  }
}
