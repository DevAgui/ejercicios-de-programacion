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

    // Constructor
    public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    // Seters y Geters

    public String getCodigo(){

        return codigo;

    }

    public void setCodigo(String codigo){
        
        this.codigo = codigo;
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
    
    // Definición del equals con el codigo de la clse Disco (normalmente .equals viene definido por defecto).
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }

    // Viene definido por defecto, así que hay que sobrescribirlo
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Disco other = (Disco) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    // Conversión a String de los métodos Set y Get de la clase Disco
    @Override
    public String toString(){

        String cadena = "\n----------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.titulo;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion;
        cadena += "\n----------------------------------";
        return cadena;

    }

}
