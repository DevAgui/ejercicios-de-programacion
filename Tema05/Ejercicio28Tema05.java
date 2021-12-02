/**
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 */
public class Ejercicio28Tema05 {

  public static void main(String[] args) {

    // Bienvenida al programa.
    System.out.println("\nEste programa te va a calcular el factorial de un número entero leído por teclado ");

    // Lectura de teclado.
    System.out.println("Introduce por teclado un número entero, positivo y que no sea 0: ");
    int numero = Integer.parseInt(System.console().readLine());

    // Declaración de variables.
    int factorizacion = 1;
    int repeticion = 1;

    // Factorización.
    for (int i = 1; i < numero; i++) {
      repeticion++;
      factorizacion = factorizacion * repeticion;
    }

    // Salida por pantalla.
    System.out.printf("La factorización de %d es = %d.", numero, factorizacion);
  }
}