/**
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 * 
 */
public class Ejercicio27Tema05 {

  public static void main(String[] args) {

    // Bienvenida al programa.
    System.out.println("\nEste programa te va a mostrar, contar y sumar los múltipos de 3 que haya entre ");
    System.out.println(" 1 y un número introducido por teclado.\n");

    // Lectura de teclado.
    System.out.print("Introduce por teclado un número entero y positivo:\n ");
    int numero = Integer.parseInt(System.console().readLine());

    // Declaración de variables.
    int multiploDeTres = 0;
    int totalMultiplos = 0;
    int sumaMultiplos = 0;

    // Múltiplos de 3 entre 1 y el número y salida a pantalla.
    System.out.println("\nLos múltiplos de 3 que hay entre 1 y tu número son:");

    do {
      totalMultiplos++;
      multiploDeTres = 3 * totalMultiplos;
      if (multiploDeTres <= numero) {
        sumaMultiplos += multiploDeTres;
        System.out.printf("%d, ", multiploDeTres);
      } else {
        totalMultiplos--;
      }
    } while (multiploDeTres < numero);

    System.out.println();
    System.out.printf("\nAdemás son un total de %d múltiplos\n\nY la suma de ellos es de: %d.", totalMultiplos,
        sumaMultiplos);
  }
}