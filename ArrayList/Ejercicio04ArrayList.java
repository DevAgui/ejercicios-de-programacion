import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio04ArrayList {
/*
Ejercicio 4
Realiza un programa equivalente al anterior pero en esta ocasión, el programa
debe ordenar palabras en lugar de números.
*/
    public static void main(String[] args) {

        // Declaramos el ArrayList
        ArrayList<String> a = new ArrayList<String>();

        // Obtenemos los valores del array por teclado, pidiendo al usuario que los introduzca.
        System.out.println("Por favor, introduzca 10 palabras: ");

        // Rellenamos el Array con 10 valores.
        for(int i = 0; i < 10; i++){

            a.add((System.console().readLine()));

        }

        // Ordenamos el ArrayList y lo lanzamos por pantalla:
        Collections.sort(a); // Por defecto el Collections.sort() ordena de menor a mayor.

        System.out.println("Los palabras del ArrayList son: " + a);

    }
}
