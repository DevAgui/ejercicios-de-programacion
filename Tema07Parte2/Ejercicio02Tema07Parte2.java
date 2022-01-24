/**
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 */
public class Ejercicio02Tema07Parte2 {

  public static void main(String[] args) {

    // Declaración de variables para la tabla.
    int fila;
    int columna;
    int sumaColumna;
    int rellenoArray;
    int sumaFila = 0;
    int sumaTotal = 0;

    // Declaración de array bi-dimensional.
    int[][] num = new int[4][5];

    for (fila = 0; fila <= 3; fila++) {

      for (columna = 0; columna <= 4; columna++) {
        num[fila][columna] = Integer.parseInt(System.console().readLine());
        sumaTotal += num[fila][columna];
        
      }

    }

    // Salida por pantalla en formato tabla del array.
    System.out.println("\n ─────────────────────────────────────────────────────────────────────────");
    System.out.println("       │ Columna 0 │ Columna 1 │ Columna 2 │ Columna 3 │ Columna 4 │");
    System.out.println("\n ─────────────────────────────────────────────────────────────────────────");


    for (fila = 0; fila <= 3; fila++) {
      System.out.printf("│Fila %1d", fila);
      sumaFila = 0;
      for (columna = 0; columna <= 4; columna++) {
        sumaFila += num[fila][columna];
        System.out.printf("│%10d ", num[fila][columna]);
      }
      System.out.printf("│ %10d │\n", sumaFila);
      System.out.println(" ─────────────────────────────────────────────────────────────────────────");
    }
    System.out.print("       ");
    for (columna = 0; columna <= 4; columna++) {
      sumaColumna = 0;
      for (fila = 0; fila <= 3; fila++) {
        sumaColumna += num[fila][columna];
      }
      System.out.printf("│%10d ", sumaColumna);
    }
    System.out.printf("%10d\n", sumaTotal);
  }
}
