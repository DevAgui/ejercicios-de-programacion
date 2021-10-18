/**
 * Ejercicio 1 Tema 3.
 *Programa que pide dos números y muestre el resultado de su multiplicación.
 * @author Diego Aguilera Martín
 */
public class Ejercicio01Tema03 {
  public static void main(String[] args) {
  
  System.out.println("Por favor, introduce un número: ");
  
  double primerNumero = Double.parseDouble(System.console().readLine());
  
  System.out.println("Por favor, introduce otro número: ");
  
  double segundoNumero = Double.parseDouble(System.console().readLine());

  double multiplicacion = primerNumero * segundoNumero;
  
  System.out.printf("El resultado de multiplicar %3.2f y %3.2f es = %6.2f \n", primerNumero, segundoNumero, multiplicacion);
  
  }
}
