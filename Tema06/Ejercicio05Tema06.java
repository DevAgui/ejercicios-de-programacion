/**
 * Muestra 50 números aleatorios entre 100 y 199 (ambos incluídos) separados por
 * espacios. Muestra también el máximo, el mínimo y la media de esos números.
 */
public class Ejercicio05Tema06 {

    public static void main(String[] args) {

        // Entrada al sistema.
        System.out
                .println("\n¡Bienvenido! Te voy a mostrar 50 números aleatorios entre el 100 y el 199 (ambos incluidos)");
        System.out.println(" separados por espacios y mostrando el máximo, el mínimo y la media de los números: ");

        // Declaración de variables.
        int numero = 0;
        int sumaNumeros = 0;
        double media = 0;
        int repeticion = 0;
        int mayorQue = 0;
        int menorQue = 200;
        System.out.println();
        // Números aleatorios entre 100 y 199.
        for (int i = 1; i <= 49; i++) {
            repeticion++;
            numero = (int) (Math.random() * 100 + 100);
            sumaNumeros = sumaNumeros + numero;
            System.out.print(numero + ", ");
            if (mayorQue < numero) {
                mayorQue = numero;
            }
            if (menorQue > numero) {
                menorQue = numero;
            }
        }
        // Salidas por pantalla.
        System.out.println("\n");
        System.out.println("El número mayor es el: " + mayorQue);
        System.out.println("El número menor es el: " + menorQue);

        media = (double) sumaNumeros / repeticion;
        System.out.printf("La media de los números es de: %3.2f", media);

    }
}
