/**
 * Muestra 20 números aleatorios entre 0 y 10 (ambos incluídos) separados por
 * espacios
 */
public class Ejercicio04Tema06 {

    public static void main(String[] args) {

        // Entrada al sistema.
        System.out
                .println("¡Bienvenido! Te voy a mostrar 20 números aleatorios entre el 0 y el 10 (ambos incluidos): ");

        // Formateo de la variable en un bucle y salida por pantalla.
        for (int i = 1; i < 21; i++) {
            System.out.print((int) (Math.random() * 11) + ", ");
        }

    }
}
