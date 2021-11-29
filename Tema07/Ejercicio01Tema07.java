/**
 * Define un array de 12 números enteros con nombre num y asigna los valores
 * según la tabla que se muestra a continuación. Muestra el contenido de todos
 * los elementos del array. ¿Qué sucede con los valores de los elementos que no
 * han sido inicializados?
 */
public class Ejercicio01Tema07 {

  public static void main(String[] args) {

    // Entrada al sistema.
    System.out.println("Bienvenido. Te voy a mostrar lo que hay dentro de un array: ");

    // Declaración de array.
    int[] num = new int[12];

    // Declaración de valores dentro del array.
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;

    // Muestra de valores del array en un for.
    for(int i = 0; i <= 11; i++){
      System.out.println(num[i]);
    }

    // Lo que nos muestra el ejercicio es que cuando no se declaran valores dentro del array, estos se quedan a 0.

  }
}
