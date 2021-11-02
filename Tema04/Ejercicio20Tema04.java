/**
 * Ejercicio 20 Tema 4.
 * Éste ejercicio nos pide realizar un programa que diga si tu número es capicúa. Se permiten números de hasta 5 cifras. 
 * @author Diego Aguilera Martín
 */
public class Ejercicio20Tema04 {
  public static void main(String[] args) {

    System.out.println("Éste programa te dice si tu número es capicúa o no. Máximo 5 cifras.");
    System.out.println("");
    System.out.println("Por favor, introduzca la cifra que desee mientras sea positiva y entera sin decimales: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    
    int decenaDeMillar = numero / 10000;
    
    int divisionMillar = numero / 1000;
    int millar = divisionMillar % 10;
    
    int divisionCentena = numero / 100;
    int centena = divisionCentena % 10;
    
    int divisionDecena = numero / 10;
    int decena = divisionDecena % 10;
    
    int unidad = numero % 10;

    System.out.println("");
    if((numero <= 9)&&(numero >= 0 )){
      System.out.println("Tu número es capicúo.");
      } else if((numero <= 99) && (numero >= 10) && (divisionDecena == unidad)){
          System.out.println("Tu número es capicúo.");
        } else if((numero <= 999) && (numero >= 100) && (divisionCentena == unidad)){
            System.out.println("Tu número es capicúo.");
          } else if((numero <= 9999) && (numero >= 1000) && (millar == unidad) && (centena == decena)){
              System.out.println("Tu número es capicúo.");
            } else if((numero <= 99999) && (numero >= 10000) && (decenaDeMillar == unidad) && (millar == decena)){
                System.out.println("Tu número es capicúo.");
              } else {
                  System.out.println("Tu número no es capicúo.");
                }
   
  }
}
