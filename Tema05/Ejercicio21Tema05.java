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
    int sumaNumeros = 0;
    long par = 0;
    long impar = 0;
    long numeroIteracionesImpar = 0;
    do {
      long divisionParOimpar = numero / 2;
      int mediaNumerosImpar = sumaNumeros / numeroIteracionesImpar;
      System.out.println("Por favor, introduzca el número");
      numero = Integer.parseInt(System.console().readLine());
      if (numero >= 0) {
        numeroIteraciones++;
      }
      if (divisionParOimpar == 0) {
        par = numero;
      }
      if(par > par){
      long parMayor = par;
      
      }
      if(divisionParOimpar != 0){
        impar = numero;
        sumaNumeros = impar; 
        numeroIteracionesImpar = impar ++;
      }

    } while (numero >= 0);

    System.out.println();
  }
}