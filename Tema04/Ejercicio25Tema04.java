/**
 * Ejercicio 25 Tema 4.
 * Éste ejercicio nos pide crear un programa para una tienda web que vende banderas personalizadas que nos ha pedido realizar una calculadora de precios siendo un centimo de euro el centimetro cuadrado. Si la queremos con un escudo bordado el precio se incrementa 2.50 independientemente del tamaño. Los gastos de envío son 3.25 euros. El IVA está incluido en todos los precios.
 */
public class Ejercicio25Tema04 {
  public static void main(String[] args) {
    System.out.println("Bienvenido a BanderaDeEspaña.es. Cada centrímetro cuadradado de la banderá le costará un céntimo de euro.");
    System.out.println("");
    System.out.print("Introduzca la altura de la bandera en cm: ");
    double altoBandera = Double.parseDouble(System.console().readLine());
    System.out.println("");
    System.out.print("A continuación introduzca el ancho de la bandera en cm: ");
    double anchoBandera = Double.parseDouble(System.console().readLine());
    System.out.println("");
    System.out.print("¿Desea escudo bordado? (s/n): ");
    String escudoBordado = System.console().readLine().toLowerCase(); 
    
    double centimetrosCuadrados = altoBandera * anchoBandera;
    double precioBandera = centimetrosCuadrados / 100;
    double precioFinal = 0;
    
    System.out.println("");
    switch(escudoBordado){
      case "s":
      precioFinal = precioBandera + 2.50 + 3.25;
      System.out.println("  Gracias. Aquí tiene el desglose de su compra.");
      System.out.printf("  Bandera de:      %4.0f cm²         %4.2f€   \n  ", centimetrosCuadrados, precioBandera);
      System.out.printf("Con escudo:                       %4s€   \n  ", "2,50");
      System.out.printf("Gastos de envío:                  %4s€   \n  ", "3,25");
      System.out.printf("Total:                            %4.2f€   \n  ", precioFinal);
      break;
      case "si":
      precioFinal = precioBandera + 2.50 + 3.25;
      System.out.println("  Gracias. Aquí tiene el desglose de su compra.");
      System.out.printf("  Bandera de:      %4.0f cm²         %4.2f€   \n  ", centimetrosCuadrados, precioBandera);
      System.out.printf("Con escudo:                       %4s€   \n  ", "2,50");
      System.out.printf("Gastos de envío:                  %4s€   \n  ", "3,25");
      System.out.printf("Total:                            %4.2f€   \n  ", precioFinal);
      break;
      case "n":
      precioFinal = precioBandera + 3.25;
      System.out.println("  Gracias. Aquí tiene el desglose de su compra.");
      System.out.printf("  Bandera de:      %4.0f cm²         %4.2f€   \n  ", centimetrosCuadrados, precioBandera);
      System.out.printf("Sin escudo:                       %4s€   \n  ", "0,00");
      System.out.printf("Gastos de envío:                  %4s€   \n  ", "3,25");
      System.out.printf("Total:                            %4.2f€   \n  ", precioFinal);
      break;
      case "no":
      precioFinal = precioBandera + 3.25;
      System.out.println("  Gracias. Aquí tiene el desglose de su compra.");
      System.out.printf("  Bandera de:      %4.0f cm²         %4.2f€   \n  ", centimetrosCuadrados, precioBandera);
      System.out.printf("Sin escudo:                       %4s€   \n  ", "0,00");
      System.out.printf("Gastos de envío:                  %4s€   \n  ", "3,25");
      System.out.printf("Total:                            %4.2f€   \n  ", precioFinal);
      break;
      default:
      System.out.println("Lo siento, has introducido datos erróneos.");
      break;
    } 

         
      
    
  }
}
