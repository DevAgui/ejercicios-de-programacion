/**
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. 
 * Carga el array numero con valores aleatorios entre 0 y 100. En el array
 * cuadrado se deben almacenar los cuadrados de los valores que hay en el array
 * numero. En el array cubo se deben almacenar los cubos de los valores que hay en
 * numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres columnas.
 */
public class Ejercicio04Tema07 {

  public static void main(String[] args) {

    // Entrada al sistema.
    System.out.print("\nBienvenido. Te voy a mostrar el contenido de tres arrays dispuestos en tres columnas\n");
    System.out.print("en las que la primera va a ser de números, la segunda del cuadrado de los números y\n");
    System.out.print("la tercera del cubo de los números.\n");

    // Declaración de variables.
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];

    // Pintada de las tres columnas antes, durante y después del for.
    System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    System.out.println("┃NÚMERO  ┃CUADRADO   ┃CUBO         ┃");
    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    // Relleno del primer array.
    for (int i = 0; i < 20; i++) {
      numero[i] = (int) (Math.random() * 101);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = cuadrado[i] * numero[i];

      System.out.printf("┃%3d     ┃%6d     ┃%7d      ┃\n", numero[i], cuadrado[i], cubo[i]);
    }
    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

  }
}
