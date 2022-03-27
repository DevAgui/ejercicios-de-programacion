package Ejercicio08Diccionarios;

public class Carta{

    // Atributos de la Clase Carta
    private String numero;
    private String palo;


    // Constructor
    public Carta(String numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }


    // Métodos de la clase constructor
    public void setNumero(String numero){

        this.numero = numero;

    }


    public String getNumero(){

        return numero;

    }

    public void setPalo(String palo){
        
        this.palo = palo;

    }

    public String getPalo(){
        
        return palo;

    }

    // Conversión a cadena de texto
    public String toString(){

        String cadena = "\nNúmero: " + this.numero;
        cadena += "\nPalo: " + this.palo;
        return cadena;
        
    }
}