/**
 * Éste programa te va a pedir dos números cualesquieras y te va a decir de 7 en
 * 7 cuáles de ellos están entre tus números hasta que no pueda seguir
 * haciéndolo.
 * 
 * @author Diego Aguilera Martin
 */
public class Ejercicio18Tema05 {
  public static void main(String[] args) {
    System.out.println();
    System.out.println(
        "Éste programa te va a decir cuántos números hay recorriéndolos de 7 en 7 entre el número menor que introduzcas y el mayor. HAN DE SER DISTINTOS.\n");

    System.out.println("Por favor, introduce el primer número que hayas elegido: ");
    long numeroUno = Long.parseLong(System.console().readLine());

    System.out.println("Por favor, introduce el segundo número que hayas elegido: ");
    long numeroDos = Long.parseLong(System.console().readLine());

    long numeroMenor = 0;
    long numeroMayor = 0;

    if (numeroUno == numeroDos) {
      System.out.println("Te has equivocado introduciendo datos.");
    }
    if (numeroUno > numeroDos) {
      numeroMayor = numeroUno;
      numeroMenor = numeroDos;
    } else if (numeroDos > numeroUno) {
      numeroMayor = numeroDos;
      numeroMenor = numeroUno;
    }
    do {
      numeroMenor = numeroMenor + 7;
      if (numeroMayor >= numeroMenor) {
        System.out.print(numeroMenor + ", ");
      } else if (numeroMayor < numeroMenor) {
        numeroMenor--;
      }
    } while (numeroMayor > numeroMenor);

  }
}
