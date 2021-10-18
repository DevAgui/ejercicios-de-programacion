/**
 * Ejercicio 3 Tema 3.
 *Programa que pide convertir de pesetas a euros a través de datos obtenidos por teclado.
 * @author Diego Aguilera Martín
 */
public class Ejercicio03Tema03 {
  public static void main(String[] args) {
  
  System.out.println("Por favor, introduce la cantidad de pesetas que quieres convertir a euros: ");
  
  double cantidadPesetas = Double.parseDouble(System.console().readLine());
  
  double resultadoEuros = cantidadPesetas / 166.38;
  
  System.out.printf("%3.2f pesetas son %3.2f euros. \n", cantidadPesetas, resultadoEuros);
  
  }
}
