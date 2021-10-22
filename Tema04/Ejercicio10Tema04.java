/**
 * Ejercicio 10 Tema 4.
 * Éste ejercicio nos pide crear un programa que nos dice cuál es nuestro horoscopo dependiendo del día y el mes de nacimiento.
 * @author Diego Aguilera Martín
 */
public class Ejercicio10Tema04 {
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduce tu día de nacimiento en numéros enteros: ");
    int diaNacimiento = Integer.parseInt(System.console().readLine());
    System.out.println("");
    System.out.println("Por favor, introduce tu mes de nacimiento en min: ");
    int mesNacimiento = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    

    
    switch((mesNacimiento ==)){
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
