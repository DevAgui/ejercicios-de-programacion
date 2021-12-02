/**
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 */
public class Ejercicio07Tema06 {

  public static void main(String[] args) {

    // Entrada al sistema.
    System.out.println("\n¡Bienvenido! Vamos a jugar a la quiniela. Te voy a mostrar los resultados de la quiniela");
    System.out.println(" con todos los partidos. Espero que hayas tenido suerte.");

    // Declaración de variables.
    int numero = 0;
    String resultado = "";
    String local = "Local";
    String visitante = "Visitante";
    // Quiniela.
    System.out.print("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    System.out.println("\n┃          PARTIDOS                ┃ORDEN    ┃RESULTADOS┃");
    System.out.print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
    for (int i = 1; i <= 14; i++) {
      int resultadosQuiniela = (int) (Math.random() * 3 + 1);
      switch (resultadosQuiniela) {
        case 1:
          resultado = "1         ";
          break;
        case 2:
          resultado = "         2";
          break;
        case 3:
          resultado = "     x    ";
          break;
        default:
      }
      numero++;

      System.out.printf("┃Equipo 1 - Equipo 2.............. ┃   %2d    ┃%1s┃\n", numero, resultado);

    }
    System.out.print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
    System.out.print("    PLENO AL 15: ");
    for(int j = 1; j < 3; j++){
      int plenoAlQuince = (int) (Math.random() * 5);
      local = resultado;
      switch (plenoAlQuince) {
        case 1:
          resultado = "0";
          break;
        case 2:
          resultado = "1";
          break;
        case 3:
          resultado = "2";
          break;
        case 4:
          resultado = "M";
        default:
      }
      visitante = resultado;
    }
    System.out.printf("Local....%s   Visitante....%s", local, visitante);
  }
}
