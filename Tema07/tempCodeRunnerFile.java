/**
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición
 * 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se
 * encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el
 * contenido
 * del array.
 */
public class Ejercicio06Tema07 {

  public static void main(String[] args) {

    // Entrada al sistema.
    System.out.println("Bienvenido. Te voy a pedir 15 números por teclado y los voy a mostrar uno más adelante ");
    System.out.println("de como lo has introducido.");

    // Declaración de array y variables.
    int[] numero = new int[15];

    // Relleno de valores del array con lectura de teclado.
    System.out.println("Por favor, introduce 15 números: ");
    for (int i = 0; i <= 14; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }

    // Adelantamiento en 1 de los valores del array.
    for (int j = 0; j <= 14; j++) {
      int aux = numero[j + 1];
      numero[j + 1] = numero[0];
      numero[0] = aux;
    }

    System.out.println();
    for (int x = 0; x <= 14; x++) {
      System.out.println(numero[x]);
    }

  }
}