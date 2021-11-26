/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * de- be adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número
 * introducido es menor o mayor que el número secreto.
 */
public class Ejercicio06Tema06 {

  public static void main(String[] args) {

    // Entrada al sistema.
    System.out.println("\n¡Bienvenido! Vamos a jugar a un juego. Tienes que adivinar en qué numero estoy pensando (entre el 0 y el 100)");
    System.out.println(" y para ello dispones de 5 oportunidades. Cada ves que falles te diré si tu número era mayor");
    System.out.println(" o menor que el número que he pensado. ¡Suerte!");

    // Declaración de variables.
    int numeroPensado = (int) (Math.random() * 101);
    int oportunidades = 5;
    int numeroIntroducido = 0;

    // Juego.
    do {
      oportunidades--;
      System.out.println("\nPrueba un número: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      if ((numeroIntroducido != numeroPensado) && (numeroPensado > numeroIntroducido)) {
        System.out.printf(
            "\nEl número que has introducido es más pequeño que el número que he pensado.\nTe quedan %d oportunidad/es.\n",
            oportunidades);
      } else if ((numeroIntroducido != numeroPensado) && (numeroPensado < numeroIntroducido)) {
        System.out.printf(
            "\nEl número que has introducido es más grande que el número que he pensado.\nTe quedan %d oportunidad/es.\n",
            oportunidades);
      }
    } while ((oportunidades > 0) && (numeroIntroducido != numeroPensado));

    // Salida por pantalla 
    if (oportunidades == 0) {
      System.out.print("\n¡Lo siento, no has conseguido averiguarlo! La máquina vuelve a ganar a el humano.");
    } else if ((numeroIntroducido == numeroPensado) && (oportunidades > 0)) {
      System.out.print("\n¡LO HAS AVERIGUADO!");
    }

  }
}
