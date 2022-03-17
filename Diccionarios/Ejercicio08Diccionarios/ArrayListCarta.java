package Ejercicio08Diccionarios;
import java.util.ArrayList;

/* Ejercicio 8
Realiza un programa que escoja al azar 10 cartas de la baraja española
(10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
almacenarlas y asegúrate de que no se repite ninguna. */

public class ArrayListCarta{
    public static void main(String[] args) {
    
        // Declaración de ArrayList
        ArrayList<Carta> barajaEspanola = new ArrayList<Carta>();


        // Creación las cartas de la baraja española

        //Bastos
        barajaEspanola.add(new Carta("AS", "Bastos"));
        barajaEspanola.add(new Carta("2", "Bastos"));
        barajaEspanola.add(new Carta("3", "Bastos"));
        barajaEspanola.add(new Carta("4", "Bastos"));
        barajaEspanola.add(new Carta("5", "Bastos"));
        barajaEspanola.add(new Carta("6", "Bastos"));
        barajaEspanola.add(new Carta("7", "Bastos"));
        barajaEspanola.add(new Carta("Sota", "Bastos"));
        barajaEspanola.add(new Carta("Caballo", "Bastos"));
        barajaEspanola.add(new Carta("Rey", "Bastos"));

        // Copas
        barajaEspanola.add(new Carta("AS", "Copas"));
        barajaEspanola.add(new Carta("2", "Copas"));
        barajaEspanola.add(new Carta("3", "Copas"));
        barajaEspanola.add(new Carta("4", "Copas"));
        barajaEspanola.add(new Carta("5", "Copas"));
        barajaEspanola.add(new Carta("6", "Copas"));
        barajaEspanola.add(new Carta("7", "Copas"));
        barajaEspanola.add(new Carta("Sota", "Copas"));
        barajaEspanola.add(new Carta("Caballo", "Copas"));
        barajaEspanola.add(new Carta("Rey", "Copas"));

        // Espadas
        barajaEspanola.add(new Carta("AS", "Espadas"));
        barajaEspanola.add(new Carta("2", "Espadas"));
        barajaEspanola.add(new Carta("3", "Espadas"));
        barajaEspanola.add(new Carta("4", "Espadas"));
        barajaEspanola.add(new Carta("5", "Espadas"));
        barajaEspanola.add(new Carta("6", "Espadas"));
        barajaEspanola.add(new Carta("7", "Espadas"));
        barajaEspanola.add(new Carta("Sota", "Espadas"));
        barajaEspanola.add(new Carta("Caballo", "Espadas"));
        barajaEspanola.add(new Carta("Rey", "Espadas"));

        // Oros
        barajaEspanola.add(new Carta("AS", "Oros"));
        barajaEspanola.add(new Carta("2", "Oros"));
        barajaEspanola.add(new Carta("3", "Oros"));
        barajaEspanola.add(new Carta("4", "Oros"));
        barajaEspanola.add(new Carta("5", "Oros"));
        barajaEspanola.add(new Carta("6", "Oros"));
        barajaEspanola.add(new Carta("7", "Oros"));
        barajaEspanola.add(new Carta("Sota", "Oros"));
        barajaEspanola.add(new Carta("Caballo", "Oros"));
        barajaEspanola.add(new Carta("Rey", "Oros"));


        // Selección aleatoria de 10 cartas de la baraja

        int seleccionAleatoria = (int)(Math.random() * 10);

        
        for(int i = 0; i < 9; i++){

            System.out.println(barajaEspanola);
        }



    }
}