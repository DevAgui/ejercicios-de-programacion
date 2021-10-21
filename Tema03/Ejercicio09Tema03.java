/**
 * Ejercicio 9 Tema 3.
 * Éste ejercicio nos pide crear un programa que calcule el volumen de un cono según la fórmula V=1/3*pi*r²*h. 
 * @author Diego Aguilera Martín
 */
public class Ejercicio09Tema03 {
  public static void main(String[] args) {
  
    System.out.println("Por favor, introduce el radio del cono en cm: ");
    double radioCono = Double.parseDouble(System.console().readLine());
  
    System.out.println("Por favor, introduce el alto del cono en cm: "); 
    double altoCono = Double.parseDouble(System.console().readLine());
  
    double unTercio = 1.0/3.0 ;
    double pi = 3.14;
    double radioConoElevadoDos = radioCono * 2;
  
    double formulaVolumenCono = unTercio * pi * radioConoElevadoDos * altoCono;
  
    System.out.println("La fórmula para calcular el volumen de un cono es V = 1/3 * r² * h, por lo tanto: ");
    System.out.printf("El volumen de tu cono es %.5f cm³.", formulaVolumenCono );
  }
}
