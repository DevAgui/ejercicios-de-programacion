/**
 * Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 */
public class Ejercicio09Tema06 {

  public static void main(String[] args) {

    // Entrada al sistema.
    System.out.println("\n¡Bienvenido! Te voy a mostrar números pares hasta que aparezca el 24 y después. ");
    System.out.println(
        "te voy a decir cuantos numeros se han generado. ¿A quién no le va a gustar el 24 con lo redondo que es?\n");

    // Declaración de variables.
    int repeticiones = 0;
    int numero = 0;

    // Repeticiones hasta que saque el número 24.
    do {
      repeticiones++;
      numero = ((int) (Math.random() * 51) * 2);
      System.out.print(numero + ", ");
    } while (numero != 24);

    System.out.printf("\n\nSe han generado un total de %d números", repeticiones);
  }
}
