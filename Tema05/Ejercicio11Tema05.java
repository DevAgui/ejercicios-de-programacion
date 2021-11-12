/**
 * Ejercicio 11 Tema 5. Éste programa nos hace el cuadrado y el cubo de los
 * siguientes 5 números al introducido por teclado.
 * 
 * @author Diego Aguilera Martín
 */
public class Ejercicio11Tema05 {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("Bienvenido al programa que le va a calcular el cuadrado y el cubo de los siguientes 5 números a que haya introducido por pantalla.");
    System.out.println();

    System.out.println("Por favor, introduzca un número entero positivo.");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println();
    int sumaNumero = numero;
    int cuadrado = 0;
    int cubo = 0;
    int tope = numero + 5;

    while (sumaNumero != tope) {
      sumaNumero++;
      cuadrado = sumaNumero * sumaNumero;
      cubo = sumaNumero * sumaNumero * sumaNumero;
      System.out.println("------------------------------------------------");
      System.out.printf("│  Número: %4d │ Cuadrado: %4d │ Cubo: %4d  │\n", sumaNumero, cuadrado, cubo);
      System.out.println("------------------------------------------------");
    }

  }
}
