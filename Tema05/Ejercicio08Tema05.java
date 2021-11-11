/**
 * Ejercicio 8 Tema 5.
 * Éste ejercicio nos pide crear un programa que haga un bucle que muestre la tabla de multiplicar de un número introducido por teclado usando un for.
 * @author Diego Aguilera Martín
 */
public class Ejercicio08Tema05 {
  public static void main(String[] args) {
    
    System.out.println("Programa que te hace la tabla de multiplicar de un número introducido por teclado");
    int x = Integer.parseInt(System.console().readLine());
    System.out.print("");
    int z = x * 10;
    for (int y = x; y <= z; y += x){
    System.out.println(y);
    System.out.println("");
  }
}
}
