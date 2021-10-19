 /**
 *Ejercicio 8 Tema 3.
 *Éste ejercicio nos pide crear un programa que calcule el salario semanal en base a las horas trabajadas. 
 *@author Diego Aguilera Martín
 */
public class Ejercicio08Tema03 {
  public static void main(String[] args) {
    
  System.out.println("Por favor, introduce la cantidad de horas que has trabajado ésta semana: ");
  double totalHoras = Double.parseDouble(System.console().readLine());  
  
  double calcSalario = totalHoras * 12;
  System.out.printf("Esta semana has trabajado un total de %.1f horas por lo que te corresponde un salario de: \n", totalHoras);
  System.out.println("----------------------------------------------------------------------------------------");
  System.out.println(calcSalario + " euros.");
  }
}
