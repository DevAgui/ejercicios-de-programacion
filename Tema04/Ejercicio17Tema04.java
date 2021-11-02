/**
 * Ejercicio 17 Tema 4.
 * Éste ejercicio nos pide realizar un programa que diga cuál es la última cifra de un número entero introducido por teclado. 
 * @author Diego Aguilera Martín1
 */
public class Ejercicio17Tema04 {
  public static void main(String[] args) {

    System.out.println("Éste programa te dice cuál es la última cifra de un número entero.");
    System.out.println("");
    System.out.println("Por favor, introduzca la cifra: ");
    int numero = Integer.parseInt(System.console().readLine());

    int divisor10 = numero % 10;
    System.out.println("Tu número es " + divisor10);
    }
}
