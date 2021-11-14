/**
 * Éste programa te va a sumar los 100 siguientes números al que hayas
 * introducido por pantalla.
 * 
 * @author Diego Aguilera Martin
 */
public class Ejercicio17Tema05 {
  public static void main(String[] args) {
    System.out.println();
    System.out.println(
        "Éste programa te va a decir la suma de los 100 números posteriores al que introduzcas por pantalla.\n");

    System.out.println("Por favor, introduce el número que hayas elegido: ");
    long numero = Long.parseLong(System.console().readLine());
    long suma = numero;

    if (numero < 0) {
      System.out.println("Lo siento, te has equivocado introduciendo los datos. No puedes introducir datos negativos.");
    }
    if (numero >= 0) {

      for (long numeroDeIteraciones = 1; numeroDeIteraciones < 101; numeroDeIteraciones++) {
        numero++;
        suma = suma + numero;
      }
      System.out.println("El valor total de sumar los siguientes 100 números es: " + suma);
    }

  }
}
