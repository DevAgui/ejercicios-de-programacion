/**
 * Ejercicio 9 Tema 5. Éste ejercicio nos pide crear un programa que nos diga
 * cuántos dígitos tiene un número introducido por teclado.
 * 
 * @author Diego Aguilera Martín
 */
public class Ejercicio09Tema05 {
  public static void main(String[] args) {
    System.out.println("Éste programa te va a decir cuántos dígitos tiene tu número.");
    System.out.println("Por favor, introduzca el número");
    long numero = Long.parseLong(System.console().readLine());
    int cifra = 0;

    while (numero >= 1) {
      numero = numero / 10;
      cifra++;
      }
    
    System.out.println();
    System.out.println("Tu número tiene " + cifra + " cifras.");
  }
}
