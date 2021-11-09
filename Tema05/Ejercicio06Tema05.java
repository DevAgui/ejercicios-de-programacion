/**
 * Ejercicio 6 Tema 5.
 * Éste ejercicio nos pide crear un programa que haga un bucle que muestre los números del 320 al 160, contando de 20 en 20 usando un do-while.
 * @author Diego Aguilera Martín
 */
public class Ejercicio06Tema05 {
  public static void main(String[] args) {
    
    System.out.println("Bucle que muestre los números del 320 al 160, contando de 20 en 20 usando do-while.");
    System.out.println("");
    
    int x = 320;
    do{
    System.out.println(x);
    System.out.println("");
    x -= 20;
  }while( x >= 160);
}
}
