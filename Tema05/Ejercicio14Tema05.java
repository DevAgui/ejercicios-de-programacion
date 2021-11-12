/**
 * Éste programa nos va a pedir una base y un exponente, y va a calcular la
 * potencia.
 * 
 * @author Diego Aguilera Martin
 */
public class Ejercicio14Tema05 {
  public static void main(String[] args) {
    System.out.println();
    System.out.println(
        "Éste programa nos va a pedir una base y un exponente, y va a calcularlo. Sólo números enteros y positivos. \n");

    
    
    System.out.println("Por favor, introduce una base: \n");
    long base = Long.parseLong(System.console().readLine());
    
    System.out.println("Por favor, introduce un exponente: \n");
    long exponente = Long.parseLong(System.console().readLine());
    long exponenciacion = base;
    for(long reiteracion = 1; reiteracion < exponente; reiteracion++){
      exponenciacion = exponenciacion * base;
    }

    System.out.printf("El resultado de %2d  ^  %2d es: %6d. ", base, exponente,exponenciacion);


  }
}