/**
 * Éste programa te va a ir pidiendo números hasta que introduzcas un número
 * negativo, y nos diga cuantos números se han introducido, la media de los
 * impares y el mayor de los pares.
 * 
 */
public class Ejercicio21Tema05 {

  public static void main(String[] args) {

    // Bienvenida al programa.
    System.out.println();
    System.out.print(
        "Bienvenido. Éste programa te va a pedir números hasta que introduzcas un número negativo. De ellos, te va a decir cuántos has introducido, te va a realizar la media de los impares y te va a dar el mayor de los pares.");
    System.out.println();

    // Inicialización de variables.
    int numero = 0;
    int numeroIteraciones = 0;
    int par = 0;
    int numeroIteracionesImpar = 0;
    double mediaNumerosImpar = 0;
    int sumaNumeros = 0;
    int impar = 0;
    int parMayor = 0;

    do {

      System.out.println("Por favor, introduzca el número");
      numero = Integer.parseInt(System.console().readLine());
      int divisionParOimpar = numero % 2;
      if ((divisionParOimpar != 0) && (numero >= 0)) {
        numeroIteracionesImpar++;
        impar += numero;
      }
      if (divisionParOimpar == 0) {
        par = numero;
      }
      if (parMayor < par) {
        parMayor = par;

      }
      numeroIteraciones++;
    } while (numero >= 0);
    numeroIteraciones--;

    // Muestra de las operaciones del bucle.
    System.out.println();
    mediaNumerosImpar = (double) impar / numeroIteracionesImpar;
    System.out.println("Has introducido un total de: " + numeroIteraciones + " números.");
    if (impar > 0) {
      System.out.printf("La media de los números impares es de: %2.2f . \n", mediaNumerosImpar);
    } else {
      System.out.println("No has introducido números impares.");
    }
    if (parMayor > 0) {
      System.out.println("El par mayor es: " + parMayor + ".");
    } else {
      System.out.println("No has introducido ningún número par.");
    }
  }
}