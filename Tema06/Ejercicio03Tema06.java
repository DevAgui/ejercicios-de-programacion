/**
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la
 * baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 */
public class Ejercicio03Tema06 {

    public static void main(String[] args) {

        // Entrada al sistema y definición de variables.
        String nombrePalo = "";
        String nombreCarta = "";
        System.out.println(
                "¡Bienvenido! Espero que te gusten las cartas de la baraja española. Haber si tienes suerte y te toca el palo y la carta que querías.");
        int carta = (int) (Math.random() * 10 + 1);
        int palo = (int) (Math.random() * 4 + 1);

        // Formateo del resultado del número aleatorio.
        switch (palo) {
        case 1:
            nombrePalo = "oros";
            break;
        case 2:
            nombrePalo = "copas";
            break;
        case 3:
            nombrePalo = "espadas";
            break;
        case 4:
            nombrePalo = "bastos";
            break;
        default:
        }
        switch (carta) {
        case 1:
            nombreCarta = "as";
            break;
        case 8:
            nombreCarta = "sota";
            break;
        case 9:
            nombreCarta = "caballo";
            break;
        case 10:
            nombreCarta = "rey";
            break;
        default:
            nombreCarta = String.valueOf(carta);
        }

        // Salida por pantalla del resultado.
        System.out.println();
        System.out.println("Tu carta es " + nombreCarta + " de " + nombrePalo + ".");

    }
}
