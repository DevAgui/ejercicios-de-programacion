/**
 * Éste programa nos va a mostrar la cantidad de números de la serie de Fibonacci que se introduzca por teclado.
 * 
 * 
 * @author Diego Aguilera Martin
 */
public class Ejercicio12Tema05 {
  public static void main(String[] args) {
    int primerNumero = 0;
    int segundoNumero = 1;
    int sumatorio = 0;

    System.out.println("Bienvenido, en éste programa te vamos a mostrar la cantidad de números de la serie de Fibonacci que especifiques.");
    System.out.print("Indica en números enteros y positivos cuántos números deseas: ");
    int repeticiones = Integer.parseInt(System.console().readLine());

    for (int contabilizador = 0; contabilizador < repeticiones; contabilizador++) {
      if (contabilizador == 2) {
        System.out.print("1, ");
      }
      System.out.print(sumatorio + ", ");
      sumatorio = primerNumero + segundoNumero;
      primerNumero = segundoNumero;
      segundoNumero = sumatorio;
    }

    System.out.println("\n");

  }
}