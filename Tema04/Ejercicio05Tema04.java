/**
 * Ejercicio 5 Tema 4.
 * Éste ejercicio nos pide crear un programa que resuelva ecuaciones de primer grado del tipo: ax+b=0. . 
 * @author Diego Aguilera Martín
 */
public class Ejercicio05Tema04 {
  public static void main(String[] args) {
    
    System.out.println("Éste programa te resuelve ecuaciones de primer grado del tipo: ax+b=0.");
    System.out.println("");
    System.out.println("Por favor, introduce a: ");
    double a = Double.parseDouble(System.console().readLine()); 
    System.out.println("");
    
    System.out.println("Por favor, introduce b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    if((b == 0) || (a == 0)){
      System.out.println("La ecuación no tiene solución real.");
      System.out.println("");
      } else {
          System.out.println("");
          double resolucionEcuacion = - b / a;
          System.out.printf("x = %.3f", resolucionEcuacion );
        }
    

        }
    
    
  }

