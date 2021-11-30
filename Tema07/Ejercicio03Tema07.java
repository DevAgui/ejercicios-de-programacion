/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * y viceversa.
 */
public class Ejercicio03Tema07 {

  public static void main(String[] args) {

    // Entrada al sistema.
    System.out.println("Bienvenido. Te voy a pedir un número por teclado y te lo voy a mostrar en orden inverso.");

    // Declaración de array.
    int[] numero = new int[10];

    System.out.println("Introduce 10 números: ");
    
    // Almacenamiento de valores del array en un for.
    for(int i = 9; i >= 0; i--){
      numero[i] = Integer.parseInt(System.console().readLine());
    }

    // Muestra de los valores al orden inverso al introducido.
    System.out.println("\nLos números introducidos en orden inverso son:");
    for(int j = 0; j < 10; j++){
      System.out.printf("%d, ", numero[j]);
    }
    System.out.println();

  }
}
