/**
 * Ejercicio 2 Tema 4.
 * Éste ejercicio nos pide crear un programa que de los buenos días, las buenas tardes o las buenas noches según el tramo horario pedido.
 * @author Diego Aguilera Martín
 */
public class Ejercicio02Tema04 {
  public static void main(String[] args) {
    
    System.out.println("¡Bienvenido! Éste programa es tan cordial que te va a saludar según la hora que sea en tu país.");
    System.out.println("");
    System.out.println("Introduce SÓLO la hora: ");
    System.out.println("");
    
    int hora = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    if((hora >= 6) && (hora <= 12)){
      System.out.println("¡Buenos días!");
      } else if ((hora >= 13) && (hora <= 20)){
          System.out.println("¡Buenos tardes!");
        } else if((hora >= 21) && (hora <= 24)){
            System.out.println("¡Buenos noches!");
          } else if((hora >= 1) && (hora <= 5)){
            System.out.println("¡Buenos noches!");
            } else{
              
              }
    
  }
}
