/**
 * Ejercicio 4 Tema 4.
 * Éste ejercicio nos pide crear un programa que calcule el salario semanal en base a las horas trabajadas. 
 * @author Diego Aguilera Martín
 */
public class Ejercicio04Tema04 {
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduce la cantidad de horas que has trabajado ésta semana: ");
    double totalHoras = Double.parseDouble(System.console().readLine());  
    
    
    if(totalHoras <= 40){
      double calcHoras = totalHoras * 12;
      System.out.printf("Esta semana has trabajado un total de %.1f horas por lo que te corresponde un salario de: \n", totalHoras);
      System.out.println("-----------------------------------------------------------------------------------------");
      System.out.println(calcHoras + " euros.");
      } else {
          double restaHorasExtras = totalHoras - 40;
          double calcHorasExtrasUno = restaHorasExtras * 16;
          double calcHorasExtras = 480.0 + calcHorasExtrasUno;
          System.out.printf("Esta semana has trabajado un total de %.1f horas por lo que te corresponde un salario de: \n", totalHoras);
          System.out.println("-----------------------------------------------------------------------------------------");
          System.out.println(calcHorasExtras + " euros.");
        }
    
    
  }
}
