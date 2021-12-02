/**
 * Como el ejercicio 7 pero que la probabilidad de que salga un 1 sea de 1/2, la probabilidad
 * x sea de 1/3 y la probabilidad 2 sea de 1/6.
 */
public class Ejercicio08Tema06 {

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
      int resultadosQuiniela = (int) (Math.random() * 6 + 1);
      switch (resultadosQuiniela) {
        case 1:
        case 2:
        case 3:
          resultado = "1         ";
          break;
        case 4:
        case 5:
          resultado = "     x    ";
          break;
        case 6:
          resultado = "         2";
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
