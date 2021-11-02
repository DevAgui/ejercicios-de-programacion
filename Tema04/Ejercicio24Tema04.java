/**
 * Ejercicio 24 Tema 4.
 * Éste ejercicio nos pide crear un programa que genere la nómina de un empleado bien desglosada según las condiciones expuestas en el programa.
 */
public class Ejercicio24Tema04 {
  public static void main(String[] args) {
    System.out.println("Éste programa te desglosa la nómina. Para ello contesta con lo que se te pide por pantalla y lee con atención los requerimientos.");
    System.out.println("");
    System.out.println("1 - Programador Junior.");
    System.out.println("2 - Programador Senior.");
    System.out.println("3 - Jefe de Proyecto.");
    System.out.print("Introduce tu cargo (1 - 3): ");
    int cargo = Integer.parseInt(System.console().readLine());
    System.out.println("");
    System.out.print("¿Cuántos días has estado de viaje visitando clientes? :");
    int dias = Integer.parseInt(System.console().readLine());
    System.out.println("");
    System.out.print("Introduzca su estado civil (1 - soltero, 2 - casado.): ");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    
    double sueldoBase = 0;
    switch(cargo){
      case 1:
      sueldoBase = 950;
      break;
      case 2:
      sueldoBase = 1200;
      break;
      case 3:
      sueldoBase = 1600;
      break;
      default:
      }
      
    double dieta = 0;
    if((dias <= 31) && (dias >= 1)){
      dieta = dias * 30;
      }
    
    double sueldoBruto = sueldoBase + dieta; 
    double sueldoNeto = 0;
    double irpf = 0;
    if(estadoCivil == 1){
      irpf = sueldoBruto * 0.25;
      sueldoNeto = sueldoBruto - irpf;
      } else if (estadoCivil == 2){
          irpf = sueldoBruto * 0.20;
          sueldoNeto = sueldoBruto - irpf;
        }


    System.out.println("");
    System.out.println("   -----------------------------------------------");
    System.out.printf("   | Sueldo base                %4.2f          \n  ", sueldoBase);
    System.out.printf(" | Dietas          (%s viaje/s) %4.2f         \n ", dias, dieta);
    System.out.println("  |----------------------------------------------");
    System.out.printf("   | Sueldo bruto               %4.2f          \n ", sueldoBruto);
    System.out.printf("  | Retención IRPF   %d  \n", estadoCivil);
    System.out.println("   |----------------------------------------------");
    System.out.printf("   | Sueldo Neto                %4.2f          \n  ", sueldoNeto);
    System.out.println(" -----------------------------------------------");
  }
}
