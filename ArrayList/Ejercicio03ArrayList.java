import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio03ArrayList {
/*
Ejercicio 3
Escribe un programa que ordene 10 números enteros introducidos por teclado
y almacenados en un objeto de la clase ArrayList.
*/
    public static void main(String[] args) {

        // Declaramos el ArrayList
        ArrayList<Integer> a = new ArrayList<Integer>();

        // Obtenemos los valores del array por teclado, pidiendo al usuario que los introduzca.
        System.out.println("Por favor, introduzca 10 números enteros: ");

        // Rellenamos el Array con 10 valores.
        for(int i = 0; i < 10; i++){

            a.add(Integer.parseInt(System.console().readLine()));

        }

        // Ordenamos el ArrayList y lo lanzamos por pantalla:
        Collections.sort(a); // Por defecto el Collections.sort() ordena de menor a mayor.

        System.out.println("Los valores del ArrayList son: " + a);

    }
}
