/**
 * Ejercicio 6 Tema 3.
 *Programa que nos pide calcular el área de un triángulo.
 * @author Diego Aguilera Martín
 */
public class Ejercicio06Tema03 {
  public static void main(String[] args) {
  
  
  System.out.println("Por favor, introduce la base del triángulo en cm: ");
  
  double base = Double.parseDouble(System.console().readLine());
  
  System.out.println("Por favor, introduce la altura del triángulo en cm: ");
  
  double altura = Double.parseDouble(System.console().readLine());
  
  double bxh = base * altura / 2;
  
  System.out.printf("El área de un triángulo con b=%3.2f cm y h=%3.2f cm es igual a = %3.2f cm²", base, altura, bxh);  
  }
}
