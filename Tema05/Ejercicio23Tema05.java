/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada de
 * números mientras su suma no supere el valor 10000. Cuando esto último ocurra,
 * se debe mostrar el total acumulado, el contador de los números introducidos y
 * la media.
 * 
 * 
 */
public class Ejercicio23Tema05 {

  public static void main(String[] args) {

    // Bienvenida al programa.
    System.out.println("\n¡Bienvenido! Éste programa le va a permitir introducir una serie indeterminada de números");
    System.out.print(" hasta que supere los 10.000. Cuando esto ocurra se le mostrará el total acumulado,\n");
    System.out.print(" el contador de los números y la media. \n");

    // Declaración de variables.
    int totalAcumulado = 0;
    int contadorNumeros = 0;
    int sumaNumeros = 0;

    // Introducción por teclado y bucle.
    System.out.println("A continuación, introduce los números que quieras: ");
    do {
      int numero = Integer.parseInt(System.console().readLine());
      totalAcumulado = totalAcumulado + numero;
      contadorNumeros++;
      sumaNumeros = sumaNumeros + numero;
    } while (totalAcumulado <= 10000);

    double mediaNumeros = (double) sumaNumeros / contadorNumeros;

    // Salida por pantalla de los resultados.
    System.out.printf(
        "El total acumulado es de: %d\nY has introducido un total de: %d número/s.\nLa media es de: %5.2f",
        totalAcumulado, contadorNumeros, mediaNumeros);

  }
}
