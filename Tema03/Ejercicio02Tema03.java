/**
 *Ejercicio 2 Tema 3.
 *Programa que pide convertir de euros a pesetas a través de datos obtenidos por teclado.
 *@author Diego Aguilera Martín
 */
public class Ejercicio02Tema03 {
  public static void main(String[] args) {
  
  System.out.println("Por favor, introduce la cantidad de pesetas que quieres convertir a euros: ");
  
  double cantidadEuros = Double.parseDouble(System.console().readLine());
  
  double resultadoPesetas = cantidadEuros * 166.38;
  
  System.out.printf("%3.2f euros son %d pesetas. \n", cantidadEuros, (int) resultadoPesetas);
  
  }
}
