/**
 * Ejercicio 7 Tema 4.
 * Éste ejercicio nos pide realizar un programa que calcule la media de tres notas. 
 * @author Diego Aguilera Martín
 */
public class Ejercicio07Tema04 {
  public static void main(String[] args) {
    
    System.out.println("¡Bienvenido al programa!");
    System.out.println("");
    System.out.println("Introduce 1 si quieres entrar a la calculadora de medias, si quieres un mensaje motivacional pulsa 2:");
    double uno = Double.parseDouble(System.console().readLine());
    System.out.println("");
    
    if(uno == 1){
      System.out.println("Introduce la primera nota del 0 al 10: ");
      double primeraNota = Double.parseDouble(System.console().readLine());
      System.out.println("");
      System.out.println("Introduce la segunda nota del 0 al 10: ");
      double segundaNota = Double.parseDouble(System.console().readLine());
      System.out.println("");
      System.out.println("Introduce la tercera nota del 0 al 10: ");
      double terceraNota = Double.parseDouble(System.console().readLine());
      
      double sumaNotas = primeraNota + segundaNota + terceraNota;
      double notaMedia = sumaNotas / 3;
      System.out.println("");
      System.out.printf("Tu nota media es de %.2f.", notaMedia);
      } else{
        System.out.println("¡Haber estudiao!");
        }
        }
        
    
    
  }

