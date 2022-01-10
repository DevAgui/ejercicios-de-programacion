/**
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 */
public class Ejercicio01Tema08 {

  public static void main(String[] args) {

    // Declaración de variables para la tabla.
    int fila;
    int columna;

    // Declaración de array bi-dimensional.
    int[][] num = new int[3][6];

    // Introducción de valores al array bi-dimensional.
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;

    // Salida por pantalla en formato tabla del array.
    System.out.println("\n ────────────────────────────────────────────────────────────────────────");
    for (fila = 0; fila < 3; fila++) {
      System.out.printf("│Fila %1d", fila);
      for (columna = 0; columna < 6; columna++) {
        System.out.printf("│%10d", num[fila][columna]);
      }
      System.out.println("│");
      System.out.println(" ────────────────────────────────────────────────────────────────────────");
    }

  }
}
