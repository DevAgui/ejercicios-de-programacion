/**
 * Ejercicio 3 Tema 4.
 * Éste ejercicio nos pide crear un programa que dado un número del 1 al 7 escriba el correspondiente día de la semana.
 * @author Diego Aguilera Martín
 */
public class Ejercicio03Tema04 {
  public static void main(String[] args) {
    
    System.out.println("Éste programa te dará el día de la semana si introduces por teclado el número.");
    System.out.println("");
    System.out.println("Introduce el día en un número entero: ");
    
    
    int diaSemana = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    switch(diaSemana){
      case 1:
         System.out.println("Hoy es Lunes.");
         break;
      case 2:
         System.out.println("Hoy es Martes.");
         break;
      case 3:
         System.out.println("Hoy es Mieŕcoles.");
         break;
      case 4:
         System.out.println("Hoy es Jueves.");
         break;
      case 5:
         System.out.println("Hoy es Viernes");
         break;
      case 6:
         System.out.println("Hoy es Sábado.");
         break;
      case 7:
         System.out.println("Hoy es Domingo.");
         break;
      default:
         System.out.println("Lo siento, el dato introducido es incorrecto. Vuelve a introducir otro dato.");
      }

    
  }
}
