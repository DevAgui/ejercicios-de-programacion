/**
 * Ejercicio 19 Tema 4.
 * Éste ejercicio nos pide realizar un programa que diga cuál es la primera cifra de un número entero introducido por teclado. Se permiten números de hasta 5 cifras. 
 * @author Diego Aguilera Martín1
 */
public class Ejercicio19Tema04 {
  public static void main(String[] args) {

    System.out.println("Éste programa te dice cuál es la primera cifra de un número entero.");
    System.out.println("");
    System.out.println("Por favor, introduzca la cifra: ");
    int numero = Integer.parseInt(System.console().readLine());

    if((numero <= 99999) && (numero >= 10000)){
      System.out.println("Tu número tiene 5 cifras.");
      } else if((numero <= 9999) && (numero >= 1000)){
          System.out.println("Tu número tiene 4 cifras.");
        } else if((numero <= 999) && (numero >= 100)){
            System.out.println("Tu número tiene 3 cifras.");
          } else if((numero <= 99) && (numero >= 10)){
              System.out.println("Tu número tiene 2 cifras.");
            } else if((numero <= 9) && (numero >= 0)){
                System.out.println("Tu número tiene 1 cifra.");
              } else if((numero >= -9) && (numero <= -1)){
                  System.out.println("Tu número tiene 1 cifra");
                } else if((numero >= -99)&&(numero <= -10)){
                    System.out.println("Tu número tiene 2 cifras");
                  } else if((numero >= -999)&&(numero <= -100)){
                      System.out.println("Tu número tiene 5 cifras");
                    } else if((numero >= -9999)&&(numero <= -1000)){
                        System.out.println("Tu número tiene 5 cifras");
                      } else if((numero >= -99999)&&(numero <= -10000)){
                          System.out.println("Tu número tiene 5 cifras");
                        }

    
  }
}
