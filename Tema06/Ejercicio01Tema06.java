/**
 * Escribe un programa que muestre la tirada de tres dados. 
 * Se debe mostrar también la suma total (los puntos que suman entre los 3 dados.)
 * 
 * 
 */
public class Ejercicio01Tema06 {

    public static void main(String[] args) {

        // Entrada al sistema y definición de variables.
        System.out.println("¡Bienvenido! Espero que te gusten los dados. ");
        int dado = (int) (Math.random() * 6 + 1);
        int suma = 0;

        // Tirada de dados.
        for (int i = 1; i <= 3; i++) {
            suma += dado;
        }
        System.out.println();
        System.out.println("La suma total de la tirada de los tres dados es de " + suma + ". ¡Buena tirada!");
    }
}
