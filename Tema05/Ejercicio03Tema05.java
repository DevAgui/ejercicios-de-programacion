/**
 * Ejercicio 3 Tema 5.
 * Éste ejercicio nos pide crear un programa que haga un bucle que muestre múltiplos de 5, de 0 a 100 usando do-while.
 * @author Diego Aguilera Martín
 */
public class Ejercicio03Tema05 {
  public static void main(String[] args) {
    
    System.out.println("Bucle que muestre múltiplos de 5, de 0 a 100 usando do-while");
    System.out.println("");
    
    int x = 0;
    do{
      System.out.println(x);
      x += 5;
      System.out.println("");
      }while(x <= 100);
    
}
}
