/**
 * Ejercicio 18 Tema 4.
 * Éste ejercicio nos pide realizar un programa que diga cuál es la primera cifra de un número entero introducido por teclado. Se permiten números de hasta 5 cifras. 
 * @author Diego Aguilera Martín1
 */
public class Ejercicio18Tema04 {
  public static void main(String[] args) {

    System.out.println("Éste programa te dice cuál es la primera cifra de un número entero.");
    System.out.println("");
    System.out.println("Por favor, introduzca la cifra: ");
    int numero = Integer.parseInt(System.console().readLine());

    int divisor10 = numero / 10;
    int divisor100 = numero / 100;
    int divisor1000 = numero / 1000;
    int divisor10000 = numero / 10000;
    
    if((numero >= 0) && (numero <= 9)){
    System.out.println("Tu primer dígito es " + numero);
    } else if ((numero >= 10) && (numero <= 99)){
        System.out.println("Tu primer dígito es " + divisor10);
      } else if ((numero >= 100) && (numero <= 999)){
          System.out.println("Tu primer dígito es " + divisor100);
        } else if ((numero >= 1000) && (numero <= 9999)){
            System.out.println("Tu primer dígito es " + divisor1000);
          } else if ((numero >= 10000) && (numero <= 99999)){
              System.out.println("Tu primer dígito es " + divisor10000);
            } else{
                System.out.println("Lo siento, el dato introducido no es correcto.");
              }
            }
}
