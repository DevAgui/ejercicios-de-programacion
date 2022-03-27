package Ejercicio08Diccionarios;
import java.util.ArrayList;

/* Ejercicio 8
Realiza un programa que escoja al azar 10 cartas de la baraja española
(10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
almacenarlas y asegúrate de que no se repite ninguna. */

public class ArrayListCarta{
    public static void main(String[] args) {
    
        // Declaración de ArrayList barajaEspanola
        ArrayList<Carta> barajaEspanola = new ArrayList<Carta>();

        // Selección aleatoria de 10 cartas de la baraja

        String [] figuras = {"AS","2","3","4","5","6","7","Sota","Caballo","Rey"};
        
        String [] palos = {"Bastos","Copas","Espadas","Oros"};

        int r = (int)(Math.random() * 10);

        // Doble foreach para recorrer los dos valores del array, rellenándose entero

            for (String figura : figuras) {

                for(String palo : palos){

                barajaEspanola.add(new Carta(figura,palo));
                System.out.println(barajaEspanola);

                }
            } 
        }
        

}