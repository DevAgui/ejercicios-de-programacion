import java.util.HashMap;
import java.util.Scanner;

/*Ejercicio 6
Implementa el control de acceso al área restringida de un programa. Se debe
pedir un nombre de usuario y una contraseña. Si el usuario introduce los
datos correctamente, el programa dirá “Ha accedido al área restringida”. El
usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
de usuario con sus correspondientes contraseñas deben estar almacenados en
una estructura de la clase HashMap. */

public class Ejercicio06Diccionarios {
    
    public static void main(String[] args) {
        

        // Declaración de Scanner
        Scanner s = new Scanner(System.in);

        // Introducción de datos en el HashMap 'usuarios'
        HashMap<String, Integer> usuarios = new HashMap<String, Integer>();

        usuarios.put("Diego Aguilera Martin",1234);
        usuarios.put("Alvaro Lineros Fernandez",0101);
        usuarios.put("Fran Sicilia Perez",9999);
        usuarios.put("David Antunez",8661);


        // Declaración de variables para el control de acceso
        int oportunidades = 0;

        do{
            System.out.println("Por favor, introduzca su nombre completo");
            String nombre = s.nextLine();

            System.out.println("A continuación introduzca su contraseña: ");
            Integer contrasena = Integer.parseInt(s.nextLine());

            /*if(usuarios.containsKey()){

            }*/
            oportunidades--;
        }while(oportunidades < 3);
    }
}
