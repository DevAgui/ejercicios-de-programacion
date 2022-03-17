import java.util.HashMap;
import java.util.Scanner;

public class EjemplosDiccionario{

    public static void main(String[] args) {
        
        HashMap<String, String> asignaturas = new HashMap<String, String>();

        asignaturas.put("PRO", "Programación");
        asignaturas.put("LLMM", "Lenguajes de marcas");
        asignaturas.put("BBDD", "Bases de datos");
        asignaturas.put("EED", "Entornos de Desarrollo");
        asignaturas.put("FOL", "Formación y Orientación Laboral");

        Scanner s = new Scanner(System.in);

        boolean vacio = true;
        


        
        do{

            System.out.println("Introduzca el código de la asignatura: ");
            String codigoIntroducido = s.nextLine().toUpperCase();
            
            if((!asignaturas.containsKey(codigoIntroducido))){

                System.out.println("Esta asignatura no existe, ¿desea introducirla?");
                String respuesta = s.nextLine().toLowerCase();

                if(respuesta.equals("si")){

                    System.out.println("Introduce el nombre de la asignatura: ");
                    String nombre = s.nextLine();

                    asignaturas.put(codigoIntroducido, nombre);

                    
                    vacio = false;

                }

            } else{
                System.out.println("El código de la nueva asignatura es: " + asignaturas.get(codigoIntroducido));
            }
            
        }while(vacio);

    
    }
}