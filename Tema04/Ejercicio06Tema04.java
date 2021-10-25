/**
 * Ejercicio 6 Tema 4.
 * Éste ejercicio nos pide realizar un programa que calcule el tiempo que tardaría en caer un objeto usando la siguiente fórmula: t= raíz cuadrada de 2h / g, siendo  g= 9.81m/s² . 
 * @author Diego Aguilera Martín
 */
public class Ejercicio06Tema04 {
  public static void main(String[] args) {
    
    System.out.println("Éste programa calcula lo que tardaría en caer un objeto x.");
    System.out.println("");
    System.out.println("Por favor, introduce la altura desde la que cae el objeto: ");
    double h = Double.parseDouble(System.console().readLine()); 
    System.out.println("");
    
    if(h <= 0){
      System.out.println("Con estos datos no hay solución.");
      }else{
         double hCuadrado = 2 * h;
         double calculoFormulaCaidaObjeto = hCuadrado / 9.81;
         double raizCuadradaFormula = Math.sqrt(calculoFormulaCaidaObjeto);
         System.out.printf("Tu objeto tardaría en caer %.5f m/s.", raizCuadradaFormula);
    }
    
        }
        
    
    
  }

