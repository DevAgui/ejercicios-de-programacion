/**
 * Ejercicio 2 Tema 3.
 *Programa que pide convertir de euros a pesetas a través de datos obtenidos por teclado.
 * @author Diego Aguilera Martín
 */
public class Ejercicio02Tema03 {
  public static void main(String[] args) {
  
  System.out.println("Por favor, introduce la cantidad de euros que quieres convertir a pesetas: ");
  
  double cantidadEuros = Double.parseDouble(System.console().readLine());
  
  double resultadoPesetas = cantidadEuros * 166.38;
  
  System.out.printf("%3.2f euros son %3.2f pesetas. \n", cantidadEuros, resultadoPesetas);
  
  }
}
