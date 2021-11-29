/**
 * Ejercicio 26
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 * 
 */
public class Ejercicio26Tema05 {

  public static void main(String[] args) {

    // Bienvenida al programa y lectura de teclado.
    System.out.println("\nEste programa te va a pedir un número y un dígito, a continuación ");
    System.out.println("el programa nos debe dar la posición de ése digito en el número introducido.\n");

    System.out.println("Introduce un número entero y positivo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    System.out.println("Ahora introduce un dígito que se encuentre en el número que has introducido: ");
    int digito = Integer.parseInt(System.console().readLine());

    // Declaración de variables.
    int posicion = 0;
    int cuentaDigitos = 0;
    int cifra = numeroIntroducido;
    int division = numeroIntroducido;
    int guardaNumeros = 0;

    // Cuenta cifras y salida por pantalla
    System.out.println("El dígito que has introducido ocupa el/los lugar/es: ");
    if (division >= 10) {
      while (division > 0) {
        cuentaDigitos++;
        cifra = division % 10;
        if (digito == cifra) {
          posicion = cuentaDigitos;
          System.out.printf("%d, ", posicion);
        }
        division = division / 10;
      }
    }
  }
}