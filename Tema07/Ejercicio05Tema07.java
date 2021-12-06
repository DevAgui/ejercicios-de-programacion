/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 */
public class Ejercicio05Tema07 {

  public static void main(String[] args) {

    // Entrada al sistema.
    System.out.println("Bienvenido. Te voy a pedir 10 números por teclado y los voy a mostrar junto a las palabras ");
    System.out.println("máximo y  míninimo con su respectivo número.");

    // Declaración de array y variables.
    int[] numero = new int[10];
    int numeroMayor = 0;
    int numeroMenor = 1000000;
    int cuenta = 1;
    System.out.println("Introduce 10 números: ");

    // Almacenamiento de valores del array en un for.
    do {

      for (int i = 9; i >= 0; i--) {
        numero[i] = Integer.parseInt(System.console().readLine());
        if (numero[i] > numeroMayor) {
          numeroMayor = numero[i];
        }
        if (numero[i] < numeroMenor) {
          numeroMenor = numero[i];
        }
      }
      System.out.println("\nTus números han sido: \n");
      for (int j = 9; j >= 0; j--) {
        if (numero[j] == numeroMayor) {
          System.out.print("Máximo " + numero[j] + ", ");
        } else if (numero[j] == numeroMenor) {
          System.out.print("Mínimo " + numero[j] + ", ");
        } else {
          System.out.print(numero[j] + ", ");
        }
      }
      cuenta--;
    } while (cuenta > 0);
  }
}
