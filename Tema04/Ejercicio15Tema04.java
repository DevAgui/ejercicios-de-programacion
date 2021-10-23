/**
 * Ejercicio 15 Tema 4.
 * Éste ejercicio nos pide realizar un programa cree pirámides según caracteres especiales introducidos por el usuario. 
 * @author Diego Aguilera Martín
 */
public class Ejercicio15Tema04 {
  public static void main(String[] args) {
    
    
    System.out.println("Bienvenido al pyramid-maker, introduce el caracter o número que quieres que se vea:");
    System.out.println("");
    char caracter = (System.console().readLine()).charAt(0); 
    System.out.println("");
    System.out.println("Ahora indica en qué posición quieres que salga, siendo 1 hacia arriba, 2 hacia la derecha, 3 hacia abajo y 4 hacia la izquierda:");
    System.out.println("");
    int posicion = Integer.parseInt(System.console().readLine());  
    System.out.println("");
    System.out.println("");
    
    switch(posicion){
      case 1:
        System.out.println(" " + " " + " " + " " + caracter + caracter + " " + " " + " " + "" );
        System.out.println(" " + " " + " " + caracter + " " + " " + caracter + " " + " " + "" );
        System.out.println(" " + " " + caracter + " " + " " + " " + " " + caracter + " " + "" );
        System.out.println(" " + caracter + " " + " " + " " + " " + " " + " " + caracter + "" );
        System.out.println(caracter + " " + " " + " " + " " + " " + " " + " " + " " + "" + caracter);
        System.out.println(caracter + "" + caracter + "" + caracter + "" + caracter + "" + caracter + "" + caracter + "" + caracter + "" + caracter + "" + caracter + "" + caracter);
      break;
      case 2:
        System.out.println(caracter + "   " + caracter + "" + "" + ""  + "");
        System.out.println(caracter + "   " + "   " + caracter + "" + "");
        System.out.println(caracter + "   " + "   " + "   " + caracter + "");
        System.out.println(caracter + "   " + "   " + "   " + "   " + caracter + "");
        System.out.println(caracter + "   " + "   " + "   " + "   " + "   " + caracter);
        System.out.println(caracter + "   " + "   " + "   " + "   " + "   " + caracter);
        System.out.println(caracter + "   " + "   " + "   " + "   " + caracter + "");
        System.out.println(caracter + "   " + "   " + "   " + caracter + "");
        System.out.println(caracter + "   " + "   " + caracter + "" + "");
        System.out.println(caracter + "   " +caracter + "" + "" + "" + "");
      break;
      case 3:
        System.out.println(caracter + "" + caracter + "" + caracter + "" + caracter + "" + caracter + "" + caracter + "" + caracter + "" + caracter + "" + caracter + "" + caracter);
        System.out.println(caracter + " " + " " + " " + " " + " " + " " + " " + " " + "" + caracter);
        System.out.println(" " + caracter + " " + " " + " " + " " + " " + " " + caracter + "" );
        System.out.println(" " + " " + caracter + " " + " " + " " + " " + caracter + " " + "" );
        System.out.println(" " + " " + " " + caracter + " " + " " + caracter + " " + " " + "" );
        System.out.println(" " + " " + " " + " " + caracter + caracter + " " + " " + " " + "" );
      break;
      case 4:
        System.out.println("" + "   " + "   " + "    " + caracter + "  " + caracter);
        System.out.println("" + "   " + "    " + caracter+ "   " + "  " + caracter);
        System.out.println("" + "    " + caracter + "  " + "   " + "   " + caracter);
        System.out.println("  "+ caracter + "   " + "   " + "   " + " " + caracter);
        System.out.println(caracter + "  " + "   " + "   " + "    " + "" + caracter);
        System.out.println(caracter + "  " + "   " + "   " + "    " + "" + caracter);
        System.out.println("  " + caracter + "   " + "   " + "   " + " " + caracter);
        System.out.println("" + "    " + caracter + "   " + "   " + "  " + caracter);
        System.out.println("" + "   " + "    " + caracter + "   " + "  " + caracter);
        System.out.println("" + "   " + "   " + "    " + caracter + "  " + caracter);
      break;
      default:
      }
    
    
        }
        
    
    
  }

