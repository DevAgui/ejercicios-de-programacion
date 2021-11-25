/**
 * Éste programa pinta un árbol de Navidad.
 * 
 */
public class ArbolDeNavidadTema05 {

  public static void main(String[] args) {

    // Entrada al sistema y lectura por teclado de variables.
    System.out.print("¡Bienvenido, éste programa pinta un árbol de Navidad!\n");
    System.out.print("Por favor, introduzca la altura: ");
    int altura = Integer.parseInt(System.console().readLine());
    int base = 2;
    int tronco = altura - base;
    int espacio = altura - 1;

    // Árbol navideño
    for (int i = 1; i <= altura; i++) {
      if (i == 1) {
        for (int repeticionEspaciosEstrella = 1; repeticionEspaciosEstrella <= espacio; repeticionEspaciosEstrella++) {
          System.out.print(" ");
        }
        System.out.println("🌟");
      } else if ((i > 1) && (i <= tronco)) {
        for (int repeticionEspaciosTronco = 1; repeticionEspaciosTronco <= espacio; repeticionEspaciosTronco++) {
          System.out.print(" ");
        }
        if (i <= tronco) {
          System.out.println("/");
        } else {
          System.out.println("");
        }
      } else {
        for (int repeticionEspaciosBase = 1; repeticionEspaciosBase <= espacio; repeticionEspaciosBase++) {
          espacio = altura;
          System.out.print(" ");
        }
        System.out.println("#");
      }
      espacio--;
    }
  }

}