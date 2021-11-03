/**
 * Ejercicio 28 Tema 4.
 * Éste ejercicio nos pide realizar un programa que implemente el juego de piedra, papel o tijera. Si algún usuario introduce otra cosa, se lanzará un mensaje de error.
 * @author Diego Aguilera Martín1
 */
public class Ejercicio28Tema04 {
  public static void main(String[] args) {
    
    System.out.println("Vamos a jugar a piedra, papel o tijera.");
    System.out.println("");
    
    
    System.out.println("Turno del jugador 1 (piedra, papel o tijera):");
    String jugadorUno = System.console().readLine().toLowerCase();
    System.out.println("");
    System.out.println("Turno del jugador 2 (piedra, papel o tijera):");
    String jugadorDos = System.console().readLine().toLowerCase();
    System.out.println("");
    
    if((jugadorUno.equals("piedra")) && (jugadorDos.equals("piedra"))){
      System.out.println("Empate.");
      } else if((jugadorUno.equals("piedra")) && (jugadorDos.equals("papel"))){
          System.out.println("El jugador 2 gana.");
        } else if((jugadorUno.equals("piedra")) && (jugadorDos.equals("tijera"))){
            System.out.println("El jugador 1 gana.");
          } else if((jugadorUno.equals("papel")) && (jugadorDos.equals("piedra"))){
              System.out.println("El jugador 1 gana.");
            } else if((jugadorUno.equals("papel")) && (jugadorDos.equals("papel"))){
                System.out.println("Empate");
              } else if((jugadorUno.equals("papel")) && (jugadorDos.equals("tijera"))){
                  System.out.println("El jugador 2 gana.");
                } else if((jugadorUno.equals("tijera")) && (jugadorDos.equals("piedra"))){
                    System.out.println("El jugador 2 gana.");
                  } else if((jugadorUno.equals("tijera")) && (jugadorDos.equals("papel"))){
                      System.out.println("El jugador 1 gana.");
                    } else if((jugadorUno.equals("tijera")) && (jugadorDos.equals("tijera"))){
                        System.out.println("Empate.");
                      } else{
                          System.out.println("Te has equivocado metiendo datos.");
                        }
    
    
}
    }
    

