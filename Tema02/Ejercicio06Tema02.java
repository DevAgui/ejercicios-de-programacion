 /**
 *Ejercicio 6 Tema Variables.
 *Éste ejercicio nos pide crear un programa que calcule una factura a partir de la base imponible. 
 * @author Diego Aguilera Martín
 */
public class Ejercicio06Tema02 {
  public static void main(String[] args) {
  
  double baseImp = 6000d;
  
  double calcIva = baseImp * 1.21;
  
  System.out.printf("Tenemos nuestra Base Imponible de %.2f euros. \n", baseImp);
  System.out.printf("Y aquí tenemos la factura con el IVA incluido: %.2f euros. \n", calcIva);
  }
}
