/**
 * Éste programa te va a pedir que introduzcas una altura en números enteros y
 * un caracter (el que tu quieras) y te va a dibujar una pirámide.
 * 
 */

public class Ejercicio19Tema05 {

  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());

    System.out.print("Por favor, introduzca el carácter de relleno: ");
    String caracter = System.console().readLine();

    int base = 1;
    int longitudDeLinea = 1;
    int espacios = altura - 1;

    while (base <= altura) {

      for (int repeticion = 1; repeticion <= espacios; repeticion++) {
        System.out.print(" ");
      }

      for (int i = 1; i <= longitudDeLinea; i++) {
        System.out.print(caracter);
      }

      System.out.println();

      base++;
      espacios--;
      longitudDeLinea += 2;
    }
  }
}