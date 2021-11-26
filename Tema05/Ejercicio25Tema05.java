/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 * 
 */
public class Ejercicio25Tema05 {

  public static void main(String[] args) {

    // Bienvenida al programa y lectura de teclado.
    System.out.println("\nEste programa te va a pedir un número y te lo va a mostrar al revés");
    System.out.print("Introduce por teclado un número entero de más de una cifra y positivo: ");
    int numero = Integer.parseInt(System.console().readLine());

    // Declaración de variables.
    int cifra = 0;
    int repeticion = 0;
    int division = numero;
    String numeroInverso = "";
    int ultimaCifra = 0;
    int guardaUltimaCifra = 0;

    // División y vuelta al número al completo más salida por pantalla de
    // resultados.
    if (numero >= 10) {
      System.out.println("Tu número al revés es: ");
      while (division >= 1) {
        cifra = division % 10;
        System.out.print("" + cifra);
        division = division / 10;
      }
    } else {
      System.out.println("Lo siento, has introducido solo una cifra.");
    }

  }
}