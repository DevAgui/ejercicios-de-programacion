/**
 * Ejercicio 5 Tema 5.
 * Éste ejercicio nos pide crear un programa que haga un bucle que muestre los números del 320 al 160, contando de 20 en 20 usando un while.
 * @author Diego Aguilera Martín
 */
public class Ejercicio05Tema05 {
  public static void main(String[] args) {
    
    System.out.println("Bucle que muestre los números del 320 al 160, contando de 20 en 20 usando while.");
    System.out.println("");

    int x = 320;
    while( x >= 160){
    System.out.println(x);
    System.out.println("");
    x -= 20;
    }
  
}
}