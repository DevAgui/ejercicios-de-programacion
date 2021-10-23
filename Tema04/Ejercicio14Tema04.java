/**
 * Ejercicio 14 Tema 4.
 * Éste ejercicio nos pide realizar un programa que diga si el número introducido por pantalla es par y/o divisible entre 5. 
 * @author Diego Aguilera Martín
 */
public class Ejercicio14Tema04 {
  public static void main(String[] args) {
    
    
    System.out.println("Éste programa te dice si tu número es par o divisible entre 5.");
    System.out.println("");
    
    System.out.println("Por favor, introduce un número entero: ");
    int x = Integer.parseInt(System.console().readLine()); 
    
    double moduloDos = x % 2;
    double moduloCinco = x % 5;
    if((moduloDos == 0) && (moduloCinco == 0)){
      System.out.println("");
      System.out.println("Tu número es par y divisible entre cinco!");
      } else if(moduloDos == 0){
          System.out.println("");
          System.out.println("Tu número es par.");
        } else if(moduloCinco == 0){
            System.out.println("");
            System.out.println("Tu número es divisible entre cinco.");
          } else{
              System.out.println("");
              System.out.println("Lo siento, tu número no es ni par ni divisible entre 5.");
            
            }
    
    
        }
        
    
    
  }

