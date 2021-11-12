/**
 * Éste programa nos va a pedir una base y un exponente, y a partir de ellos va
 * a mostrar la base con todos los exponentes desde el exponente 1 hasta el
 * introducido por teclado.
 * 
 * @author Diego Aguilera Martin
 */
public class Ejercicio15Tema05 {
  public static void main(String[] args) {
    System.out.println();
    System.out.println(
        "Éste programa nos va a pedir una base y un exponente, y va a mostrar 2 todos los exponentes desde el introducido por teclado hasta el 1. Sólo números enteros y positivos. \n");

    System.out.println("Por favor, introduce una base: \n");
    long base = Long.parseLong(System.console().readLine());

    System.out.println("Por favor, introduce un exponente: \n");
    long exponente = Long.parseLong(System.console().readLine());
    System.out.println();

    for (int exponenteDesdeUno = 1; exponenteDesdeUno < exponente; exponenteDesdeUno++) {
      System.out.print(base + "^" + exponenteDesdeUno + ", ");
    }
    System.out.print(base + "^" + exponente + ".");
  }
}