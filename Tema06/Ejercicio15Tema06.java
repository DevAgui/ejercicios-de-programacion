/**
 * Realiza un generador de melodía con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
 * la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual
 * a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente
 * compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
 * con dos barras.
 * d) La última nota de la melodía debe coincidir con la primera.
 * Ejemplo 1:
 * do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
 * Ejemplo 2:
 * la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
 */
public class Ejercicio15Tema06 {

  public static void main(String[] args) {

    // Entrada al sistema.
    System.out.println(
        "\n¡Bienvenido! Te voy a crear una melodía musical que ni la Ópera Magna de Berlín. ¡Espero que te guste!");

    // Declaración de variables.
    int notas = 0;
    String notaEscrita = "";
    int repeticiones = 0;
    String separadorMelodia = "|";

    // Número aleatorio de melodía

    // Buclardo que tendré que ponerle un nombre luego.
    for (int i = 0; i <= 9; i++) {
      notas = (int) (Math.random() * 7 + 1);
      switch (notas) {
        case 1:
          notaEscrita = "do";
          break;
        case 2:
          notaEscrita = "re";
          break;
        case 3:
          notaEscrita = "mi";
          break;
        case 4:
          notaEscrita = "fa";
          break;
        case 5:
          notaEscrita = "sol";
          break;
        case 6:
          notaEscrita = "la";
          break;
        case 7:
          notaEscrita = "si";
          break;
        default:
      }
    }
    
  }
}
