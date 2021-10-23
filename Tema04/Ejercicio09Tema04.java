/**
 * Ejercicio 9 Tema 4.
 * Éste ejercicio nos pide crear un programa que resuelva ecuaciones de segundo grado del tipo: ax²+bx+c=0. . 
 * @author Diego Aguilera Martín
 */
public class Ejercicio09Tema04 {
  public static void main(String[] args) {
    
    System.out.println("Éste programa te resuelve ecuaciones de segundo grado del tipo: ax²+bx+c=0");
    System.out.println("");
    
    System.out.println("Por favor, introduce a: ");
    double a = Double.parseDouble(System.console().readLine()); 
    System.out.println("");
    System.out.println("Por favor, introduce b: ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.println("");
    System.out.println("Por favor, introduce c: ");
    double c = Double.parseDouble(System.console().readLine());
    System.out.println("");
    
    double bPorB = b * b;
    double aPorC = a * c;
    double cuatroPorAporC = 4 * aPorC;
    double bPorBmenosElResto = bPorB - cuatroPorAporC;
    double raizCuadrada = Math.sqrt(bPorBmenosElResto);
    double menosBsumando = -b + raizCuadrada;
    double menosBrestando = -b - raizCuadrada;
    double dosPorA = 2 * a;
    double resolucionEcuacionPositiva = menosBsumando / dosPorA;
    double resolucionEcuacionNegativa = menosBrestando / dosPorA;
          
    if((b == 0) && (a == 0) && (c == 0)){
      System.out.println("La ecuación no tiene solución real. Introduce otros valores.");
      System.out.println("");
      } else if(bPorBmenosElResto < 0){
          System.out.println("La ecuación no tiene solución real. Introduce otros valores.");
          System.out.println("");
         }else {
            System.out.println("");
            System.out.printf("x = %.6f y %.6f", resolucionEcuacionPositiva, resolucionEcuacionNegativa);
        }
    

        }
    
    
  }

