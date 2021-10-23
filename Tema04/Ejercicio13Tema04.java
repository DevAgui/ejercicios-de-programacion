/**
 * Ejercicio 13 Tema 4.
 * Éste ejercicio nos pide realizar un programa que ordene los números que se introduzcan por pantalla. 
 * @author Diego Aguilera Martín
 */
public class Ejercicio13Tema04 {
  public static void main(String[] args) {
    
    System.out.println("Éste programa te ordena los números enteros que introduzcas de mayor a menor.");
    System.out.println("");
    System.out.println("Por favor, introduce el primer número entero: ");
    int x = Integer.parseInt(System.console().readLine()); 
    System.out.println("");
    System.out.println("Por favor, introduce el segundo número entero: ");
    int y = Integer.parseInt(System.console().readLine());
     System.out.println("");
    System.out.println("Por favor, introduce el tercer número entero: ");
    int z = Integer.parseInt(System.console().readLine());
    
    if((x > y) && (x > z) && (y > z)){
      System.out.println(x + "," + y + "," + z+ ".");
      } else if((x > y) && (x > z) && (z > y)){
          System.out.println(x + "," + z + "," + y + ".");
        } else if((y > x) && (y > z) && (x > z)){
            System.out.println(y + "," + x + "," + z + ".");
          } else if((y > x) && (y > z) && (z > x)){
              System.out.println(y + "," + z + "," + x + ".");
            } else if((z > x) && (z > y) && (x > y)){
                System.out.println(z + "," + x + "," + y);
              } else if((z > x) && (z > y) && (y > x)){
                  System.out.println(z + "," + y + "," + x);
                }

        }
        
    
    
  }

