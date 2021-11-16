/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 * 
 * 
 */
public class Ejercicio16Tema05 {

  public static void main(String[] args) {

    System.out.print("Introduzca un número entero y le diré si es primo: ");
    int numero= Integer.parseInt(System.console().readLine());

    boolean primo = true;

    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        primo = false;
      }
    }

    if (primo) {
      System.out.println("Tu número es primo.");
    } else {
      System.out.println("Tu número no es primo.");
    }

  }
}
