/**
 * Ejercicio 5 Tema 3.
 *Programa que nos pide calcular el área de un rectángulo.
 * @author Diego Aguilera Martín
 */
public class Ejercicio05Tema03 {
  public static void main(String[] args) {
  
  
  System.out.println("Por favor, introduce la base del rectángulo en cm: ");
  double base = Double.parseDouble(System.console().readLine());
  
  System.out.println("Por favor, introduce la altura del rectángulo en cm: ");
  double altura = Double.parseDouble(System.console().readLine());
  
  double bxh = base * altura;
  System.out.printf("El área de un rectángulo con b=%3.2f cm y h=%3.2f cm es igual a = %3.2f cm²", base, altura, bxh);  
  }
}
