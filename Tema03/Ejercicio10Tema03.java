/**
 * Ejercicio 10 Tema 3.
 * Éste ejercicio nos pide crear un conversor de Mb a Kb. 
 * @author Diego Aguilera Martín
 */
public class Ejercicio10Tema03 {
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduce los Mb que quieras pasar a Kb en números enteros: ");
    int mb = Integer.parseInt(System.console().readLine());  
  
    int pasoKb = mb * 1000;
    System.out.printf("%d MB son %d kB \n", mb, pasoKb);
  }
}
