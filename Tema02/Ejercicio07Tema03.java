 /**
 *Ejercicio 7 Tema 3.
 *Éste ejercicio nos pide crear un programa que calcule una factura a partir de la base imponible a través de los datos obtenidos por pantalla. 
 *@author Diego Aguilera Martín
 */
public class Ejercicio07Tema03 {
  public static void main(String[] args) {
    
  System.out.println("Por favor, introduce la base imponible a aplicar el 21% de IVA: ");
  double baseImp = Double.parseDouble(System.console().readLine());  

  
  double calcIva = baseImp * 1.21;
  System.out.printf("Factura: \n");
  System.out.printf("Base Imponible: %.2f IVA: 21 por cien \n", baseImp);
  System.out.println("----------------------------------------");
  System.out.printf("Precio con IVA: %.2f", calcIva);
  }
}
