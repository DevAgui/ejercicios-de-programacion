/**
 * Escribe un programa que muestre por pantalla los números primos comprendidos
 * entre el 2 y el 100, ambos incluidos. Un número primo es aquel que sólo es
 * divisible entre él mismo y la unidad.
 * 
 * 
 */
public class Ejercicio22Tema05 {

  public static void main(String[] args) {

    // Bienvenida al programa.
    System.out.print("Bienvenido. Te voy a mostrar todos los números primos entre el 2 y el 100.");
    System.out.println();

    // Declaración de variables.
    int numero = 3;
    boolean primo = true;

    // Bucle que comprueba los números, y muestra los primos por pantalla.
    System.out.print("2, ");
    do {
      primo = true;
      for (int i = 2; i < numero; i++) {
        if ((numero % i) == 0) {
          primo = false;
        }
      }
      if (primo) {
        System.out.print(numero + ", ");
      }
      numero++;
    } while (numero < 101);

  }
}
