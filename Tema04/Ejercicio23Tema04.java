/**
 * Ejercicio 23 Tema 4.
 * Éste ejercicio nos pide crear un programa que calcule una factura a partir de la base imponible y dependiendo de si hay que aplicar qué tipo de iva o qué tipo de descuento.
 * @author Diego Aguilera Martín
 */
public class Ejercicio23Tema04 {
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduzca la base imponible: ");
    double baseImp = Double.parseDouble(System.console().readLine());  
    
    System.out.println("Por favor, introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIva = (System.console().readLine().toLowerCase());
    
    System.out.println("Por favor, introduzca el código promocional (nopro, mitad, meno5, 5porc): ");
    String tipoDescuento = (System.console().readLine().toLowerCase());  
    
    double calcIva = 0;
    double calcDescCincoporc = 0;
    switch(tipoIva){
      case "general":
      calcIva = baseImp * 1.21;
      break;
      case "reducido":
      calcIva = baseImp * 1.10;
      break;
      case "superreducido":
      calcIva = baseImp * 1.04;
      
      default:
      }
      
    double total = 0;
    switch(tipoDescuento){
      case "nopro":
      total = calcIva;
      break;
      case "mitad":
      total = calcIva / 2;
      break;
      case "meno5":
      total = calcIva - 5;
      break;
      case "5porc":
      calcDescCincoporc = calcIva * 0.05;
      total = calcIva - calcDescCincoporc;
      break;
      default:
      }
    

    System.out.println("");
    System.out.printf("Factura:              \n");
    System.out.printf("Base Imponible:  %4.2f \n", baseImp);
    System.out.printf("IVA             (%s)           \n", tipoIva);
    System.out.printf("Precio con IVA   %4.2f  \n", calcIva);
    System.out.printf("Cod promocional (%s)        \n", tipoDescuento);
    System.out.println("----------------------------------------");
    System.out.printf("TOTAL:           %4.2f          \n", total);
  }
}
