/**
 * Realiza un programa que pinte por pantalla diez líneas formadas por
 * caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria entre
 * uno
 * de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
 * aleatoria
 * entre 1 y 40 caracteres.
 */
public class Ejercicio10Tema06 {

  public static void main(String[] args) {

    // Entrada al sistema.
    System.out.println(
        "\n¡Bienvenido! Te voy a llenar la pantalla de caracteres aleatorios comprendiendo los siguientes: *, -, =, ., |, @.");
    System.out.println("¡Espero que te guste!\n");

    // Declaración de variables.
    int caracteres = 0;
    String caracterDibujado = "";
    int repeticiones = 0;
    int finBucle = 0;

    // Buclardo que tendré que ponerle un nombre luego.
    for (int i = 0; i <= 9; i++) {
      caracteres = (int) (Math.random() * 6 + 1);
      switch (caracteres) {
        case 1:
          caracterDibujado = "*";
          break;
        case 2:
          caracterDibujado = "-";
          break;
        case 3:
          caracterDibujado = "=";
          break;
        case 4:
          caracterDibujado = ".";
          break;
        case 5:
          caracterDibujado = "|";
          break;
        case 6:
          caracterDibujado = "@";
          break;
        default:
      }
      repeticiones = (int) (Math.random() * 40 + 1);
      while (finBucle != repeticiones) {
        finBucle++;
        System.out.print(caracterDibujado);
      }
      finBucle = 0;
      System.out.println();
    }
    
  }
}
