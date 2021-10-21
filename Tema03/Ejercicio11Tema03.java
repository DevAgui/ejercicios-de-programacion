/**
 * Ejercicio 11 Tema 3.
 * Éste ejercicio nos pide crear un conversor de Kb a Mb. 
 * @author Diego Aguilera Martín
 */
public class Ejercicio11Tema03 {
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduce los Kb que quieras pasar a Mb en números enteros: ");
    int kb = Integer.parseInt(System.console().readLine());  
  
    int pasoMb = kb / 1000;
    System.out.printf("%d Kb son %d Mb \n", kb, pasoMb);
  }
}
