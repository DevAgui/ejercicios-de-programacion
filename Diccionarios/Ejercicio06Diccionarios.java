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
        HashMap<Integer, String> usuarios = new HashMap<Integer, String>();

        usuarios.put(1234, "Diego");
        usuarios.put(0101, "Alvaro");
        usuarios.put(9999, "Fran");
        usuarios.put(8661, "David");


        // Declaración de variables para el control de acceso
        int oportunidades = 3;
        boolean conexionExitosa = true;


        // Control de acceso
        do{

            System.out.println("\nPor favor, introduzca su nombre completo");
            String nombre = s.nextLine();

            System.out.println("A continuación introduzca su contraseña: ");
            Integer contrasena = Integer.parseInt(s.nextLine());

            if((usuarios.containsKey(contrasena) && usuarios.containsValue(nombre))){

                System.out.println("Ha accedido al área restringida");
                oportunidades = 0;
                

            } else{

            
                oportunidades--;

                System.out.print("\nSe ha equivocado al introducir el usuario ");
                System.out.print("y/o la contraseña. Le quedan " + oportunidades);
                System.out.print(" oportunidades.\n\n");

                conexionExitosa = false;

                if(oportunidades == 0){

                    System.out.println("\nLo siento, no tiene acceso al área restringida");
        
                }
    

            }

            
        }while(oportunidades > 0);

    }
}
