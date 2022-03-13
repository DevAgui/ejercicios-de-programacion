import java.util.ArrayList;

public class Ejercicio02ArrayList {
/*
Ejercicio 2
Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
y 20 elementos ambos inclusive.
*/
    public static void main(String[] args) {


        // Declaración de variables para establecer máximo, mínimo, suma total y media.
        int suma = 0;
        int minimo = 100;
        int maximo= 0;
        int tamanoArrayList = (int)(Math.random() * 11 + 10);



        // Creación del ArrayList con valores comprendidos entre 0 y 100.
        ArrayList<Integer> arrayListAleatorio = new ArrayList<Integer>();

        
        for(int i = 0; i < tamanoArrayList; i++ ){

            arrayListAleatorio.add((int)(Math.random()*101));
        }

        // Vamos a comprobar que la lista se ha generado con los requisitos deseados:
        System.out.println("\nLa lista generada ha sido: " + arrayListAleatorio);
        System.out.println("\n---------------------------------------------------------------------------------------------\n");

        // Vamos a usar un foreach con el arraylist para poder establecer el mínimo, el máximo y la suma total.
        for(int n:arrayListAleatorio){

            suma += n;

            if(n < minimo){

                minimo = n;

            }

            if(n > maximo){

                maximo = n;

            }
        }

        // Por último vamos a mostrar por consola los resultados finales.

        System.out.println("La suma de todos los valores del ArrayList es: " + suma);
        System.out.println("La media de los valores es de: " + suma / tamanoArrayList);
        System.out.println("El mínimo es de: " + minimo);
        System.out.println("Y el máximo es de: " + maximo);
    }
}
