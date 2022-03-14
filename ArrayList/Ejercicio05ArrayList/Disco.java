/*Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez
una lista para almacenar la información sobre los discos en lugar de un array
convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
programa hecho con una lista?*/

package Ejercicio05ArrayList;

public class Disco {
    
    // Atributos de la clase Disco

    private String codigo = "Libre";

    private String autor;

    private String titulo;

    private String genero;

    private int duracion;



    public String getCodigo(){

        return codigo;

    }

    public String getAutor(){

        return autor;

    }

    public void setAutor(String autor){
        
        this.autor = autor;

    }

    public String getTitulo(){

        return titulo;

    }

    public void setTitulo(String titulo){
        
        this.titulo = titulo;

    }

    public String getGenero(){

        return genero;

    }

    public void setGenero(String genero){

        this.genero = genero;

    }

    public int getDuracion(){

        return duracion;

    }

    public void setDuracion(int duracion ){
        
        this.duracion = duracion;

    }

    public String toString(){

        String cadena = "\n----------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.titulo;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion;
        cadena = "\n----------------------------------";
        return cadena;
    }
}
