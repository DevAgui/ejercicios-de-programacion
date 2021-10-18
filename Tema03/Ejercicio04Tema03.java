/**
 * Ejercicio 4 Tema 3.
 *Programa que nos pide que dos números introducidos por teclado, los divida, los multiplique, los reste y los sume.
 * @author Diego Aguilera Martín
 */
public class Ejercicio04Tema03 {
  public static void main(String[] args) {
  
  
  System.out.println("Por favor, introduce el primer número que quieras sumar, restar, dividir y multiplicar: ");
  
  double primerNumero = Double.parseDouble(System.console().readLine());
  
  System.out.println("Por favor, introduce el segundo número que quieras sumar, restar, dividir y multiplicar: ");
  
  double segundoNumero = Double.parseDouble(System.console().readLine());
  
  double suma = primerNumero + segundoNumero;
  
  double resta = primerNumero - segundoNumero;
  
  double division = primerNumero / segundoNumero;
  
  double multiplicacion = primerNumero * segundoNumero;
  
  System.out.printf("El resultado de la suma entre %3.2f y %3.2f es = %4.2f \n", primerNumero, segundoNumero, suma);
  
  System.out.printf("El resultado de la resta entre %3.2f y %3.2f es = %4.2f \n", primerNumero, segundoNumero, resta);
  
  System.out.printf("El resultado de la división entre %3.2f y %3.2f es = %4.2f \n", primerNumero, segundoNumero, division);
  
  System.out.printf("El resultado de la multiplicación entre %3.2f y %3.2f es = %4.2f \n", primerNumero, segundoNumero, multiplicacion);
  
  
  }
}
