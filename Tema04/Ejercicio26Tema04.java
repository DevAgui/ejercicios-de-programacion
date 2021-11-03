/**
 * Ejercicio 26 Tema 4.
 * Éste ejercicio nos pide crear un programa para un cine y dependiendo del día, y si tenemos tarjeta descuento la entrada nos costará distinto.
 */
public class Ejercicio26Tema04 {
  public static void main(String[] args) {
    System.out.println("Bienvenido a la app de venta de entradas de CineCampa.");
    System.out.println("");
    System.out.print("Introduzca el número de entradas en cifras: ");
    int entradas = Integer.parseInt(System.console().readLine());
    System.out.println("");
    System.out.print("Introduzca el día de la semana: ");
    String diaSemana = (System.console().readLine().toLowerCase()); 
    System.out.println("");
    System.out.print("¿Tiene tarjeta CineCampa (s/n): ");
    String tarjetaCineCampa = System.console().readLine().toLowerCase(); 
    
    double precioBase = 8.00;
    double precioBasePareja = 11;
    double precioBaseMiercoles = 5.00;
    double descuento = 0;
    int pareja = entradas % 2;
    int parejaAgrupacion = entradas / 2;
    double precioSolitario = 0;
    double sumaPrecioJueves = 0;
    double precioTotal = 0;
    double precioBasePorEntradas = 0;
    System.out.println("");
    switch(diaSemana){
      case "lunes":
      precioBasePorEntradas = entradas * precioBase;
      if((tarjetaCineCampa == "s") || (tarjetaCineCampa == "si")){
        descuento = precioBasePorEntradas * 0.10;
        }
      precioTotal = precioBase - descuento;
      System.out.println("  Aquí tiene sus entradas. Gracias por su compra.");
      System.out.printf("  Entradas individuales      %4s             \n  ", entradas);
      System.out.printf("Precio por entrada individual     %4.2f€   \n  ", precioBase);
      System.out.printf("Total                             %4.2f€   \n  ", precioBasePorEntradas);
      System.out.printf("Descuento                         %4.2f€   \n  ", descuento);
      System.out.printf("A pagar                           %4.2f€   \n  ", precioTotal);
      break;
      case "martes":
      precioBase = entradas * 8.00;
      break;
      case "miércoles":
      precioBase = entradas * 5.00;
      break;
      case "jueves":
      if(pareja == 0){
        precioBase = parejaAgrupacion * 11; 
        } else if(pareja != 0){
          entradas--;
          precioBase = parejaAgrupacion * 11;;
          entradas++;
          precioSolitario = 8.00;
          sumaPrecioJueves = precioBase + precioSolitario;
          }
      break;
      case "viernes":
      precioBase = entradas * 8.00;
      break;
      case "sábado":
      precioBase = entradas * 8.00;
      break;
      case "domingo":
      precioBase = entradas * 8.00;
      break;
      default:
      System.out.println("Lo siento, has introducido datos erróneos.");
      break;
    } 
      
    
  }
}
