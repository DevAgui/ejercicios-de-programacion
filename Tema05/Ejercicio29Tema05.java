/**
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 */
public class Ejercicio29Tema05 {

  public static void main(String[] args) {

    // Bienvenida al programa.
    System.out.println("\nEste programa te va a mostrar los números menores a uno que introduzcas por teclado, ");
    System.out.println("que no sean divisibles entre otro que introduzcas.");

    // Lectura de teclado.
    System.out.println("\nIntroduce por teclado un número entero, positivo y que no sea 0: ");
    int numero = Integer.parseInt(System.console().readLine());

    System.out.println("\nA continuación, introduce el divisor positivo y que no sea 0: ");
    int divisor = Integer.parseInt(System.console().readLine());

    // Declaración de variables.
    int resta = numero;
    int division = 0;

    System.out.println("\nLos números no divisibles entre el primer número y el segundo son: ");

    // División y comprobación si divisible o no.
    while (resta >= 1) {
      division = resta % divisor;

      if (division != 0) {
        System.out.print(resta + ", ");
      }
      resta--;
    }

  }
}