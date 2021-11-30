/**
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los elementos
 * que no han sido inicializados?
 */
public class Ejercicio02Tema07 {

  public static void main(String[] args) {

    // Entrada al sistema.
    System.out.println("Bienvenido. Te voy a mostrar lo que hay dentro de un array que alberga caracteres: ");

    // Declaración de array.
    char[] simbolo = new char[12];

    // Declaración de valores dentro del array.
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';

    // Muestra de valores del array en un for.
    for(int i = 0; i < 9; i++){
      System.out.println(simbolo[i]);
    }

    // Lo que nos muestra el ejercicio es que cuando no se declaran valores como caracteres dentro del array, estos se guardan como espacios vacíos.

  }
}
