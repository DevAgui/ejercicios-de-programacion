/**
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A
 * (que sería el 1). Para convertir un número en una cadena de caracteres
 * podemos usar String.valueOf(n) .
 */
public class Ejercicio02Tema06 {

    public static void main(String[] args) {

        // Entrada al sistema y definición de variables.
        String nombrePalo = "";
        String nombreCarta = "";
        System.out.println(
                "¡Bienvenido! Espero que te gusten las cartas de la baraja francesa. Haber si tienes suerte y te toca el palo y la carta que querías.");
        int carta = (int) (Math.random() * 13 + 1);
        int palo = (int) (Math.random() * 4 + 1);

        // Formateo del resultado del número aleatorio.
        switch (palo) {
        case 1:
            nombrePalo = "picas";
            break;
        case 2:
            nombrePalo = "corazones";
            break;
        case 3:
            nombrePalo = "diamantes";
            break;
        case 4:
            nombrePalo = "tréboles";
            break;
        default:
        }
        switch (carta) {
        case 1:
            nombreCarta = "A";
            break;
        case 11:
            nombreCarta = "J";
            break;
        case 12:
            nombreCarta = "Q";
            break;
        case 13:
            nombreCarta = "K";
            break;
        default:
            nombreCarta = String.valueOf(carta);
        }

        // Salida por pantalla del resultado.
        System.out.println();
        System.out.println("Tu carta es el " + nombreCarta + " de " + nombrePalo + ".");

    }
}
