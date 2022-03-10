import java.util.ArrayList;

public class Ejercicio01ArrayList {
/*
Ejercicio 1
Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
todo el ArrayList sin usar ningún índice. 
*/
    public static void main(String[] args) {

        // Creación del ArrayList

        ArrayList<String> companeros = new ArrayList<String>();
        companeros.add("Diego Martín");
        companeros.add("Sergio Domínguez");
        companeros.add("Alvaro Linero");
        companeros.add("Alberto Parra");
        companeros.add("Fran Sicilia");
        companeros.add("Ale Cueto");

        for (String companero : companeros) {
            
            System.out.println("Mi compañero es: " + companero + ", ");
        }
    }
}