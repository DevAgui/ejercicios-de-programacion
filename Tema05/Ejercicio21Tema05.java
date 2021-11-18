/**
 * Éste programa te va a ir pidiendo números hasta que introduzcas un número
 * negativo, y nos diga cuantos números se han introducido, la media de los
 * impares y el mayor de los pares.
 * 
 */
public class Ejercicio21Tema05 {

  public static void main(String[] args) {
    System.out.println();
    long numero = 0;
    System.out.print(
        "Bienvenido. Éste programa te va a pedir números hasta que introduzcas un número negativo. De ellos, te va a decir cuántos has introducido, te va a realizar la media de los impares y te va a dar el mayor de los pares.");
    System.out.println();
    System.out.println();
    int numeroIteraciones = 0;
    long par = 0;
    long numeroIteracionesImpar = 0;
    long mediaNumerosImpar = 0;
    long sumaNumeros = 0;
    long impar = 0;
    long parMayor = 0;

    do {
      impar = impar;
      long divisionParOimpar = numero / 2;
      mediaNumerosImpar = mediaNumerosImpar;
      System.out.println("Por favor, introduzca el número");
      numero = Integer.parseInt(System.console().readLine());

      numeroIteraciones++;

      if (divisionParOimpar == 0) {
        par = numero;
      }
      if (par < numero) {
        parMayor = par;

      }s
      if ((divisionParOimpar != 0) && (numero >= 0)) {
        numeroIteracionesImpar++;
        impar = numero;
      }
    } while (numero >= 0);
    numeroIteraciones--;
    mediaNumerosImpar = mediaNumerosImpar / numeroIteracionesImpar;
    System.out.println("Has introducido un total de: " + numeroIteraciones + " números.");
    System.out.println("La media de los números impares es de: " + mediaNumerosImpar + ".");
    //System.out.println("El par mayor es: " + parMayor + ".");
  }
}