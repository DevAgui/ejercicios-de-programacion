/**
 * Ejercicio 8 Tema 4.
 * Éste ejercicio nos pide realizar un programa que calcule la media de tres notas. Además ahora tengo que decir si es suficiente, bien, notable o sobresaliente.
 * @author Diego Aguilera Martín
 */
public class Ejercicio08Tema04 {
  public static void main(String[] args) {
    
    System.out.println("¡Bienvenido al programa!");
    System.out.println("");
    
  
    System.out.println("Introduce la primera nota del 0 al 10: ");
    double primeraNota = Double.parseDouble(System.console().readLine());
    System.out.println("");
    System.out.println("Introduce la segunda nota del 0 al 10: ");
    double segundaNota = Double.parseDouble(System.console().readLine());
    System.out.println("");
    System.out.println("Introduce la tercera nota del 0 al 10: ");
    double terceraNota = Double.parseDouble(System.console().readLine());
      
    double sumaNotas = primeraNota + segundaNota + terceraNota;
    double notaMedia = sumaNotas / 3;
    
    if(notaMedia < 4.99){
      System.out.println("");
      System.out.println("Insuficiente. Nos vemos en Junio.");
    } else if((notaMedia >= 5.00) && (notaMedia <= 5.99)){
        System.out.println("");
        System.out.println("Suficiente. Por los pelos, muchacho.");
      } else if((notaMedia >= 6.00) && (notaMedia <= 6.99)){
          System.out.println("");
          System.out.println("Bien. Bien hecho.");
        } else if ((notaMedia >= 7.00) && (notaMedia <= 8.99)){
            System.out.println("");
            System.out.println("Notable. ¡Enhorabuena!.");
          } else if ((notaMedia >= 9.00) && (notaMedia <= 10.00)){
            System.out.println("");
            System.out.println("¡Sobresaliente!. ¡Te vas de Erasmus a Castellón!.");
          } else{
            
            
   }
    } 
      }
    
      
        
        
    

