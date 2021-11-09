/**
 * Bucle while que termina cuando se introduce por teclado un
 * número negativo.
 *
 * @author Diego Aguilera Martín
 */
public class CuentaPositivos {
  public static void main(String[] args) {
    System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
    System.out.println("Para terminar, introduzca un número negativo.");
    
    int numeroIntroducido = 0;
    int cuentaNumeros = 0;
    int suma = 0;
        
    do{
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      cuentaNumeros++; // Incrementa en uno la variable
      suma += numeroIntroducido; // Equivale a suma = suma + NumeroIntroducido
    } while(numeroIntroducido >= 0) ;
    
    System.out.println("Has introducido " + (cuentaNumeros - 1) + " números positivos.");
    System.out.println("La suma total de ellos es " + (suma - numeroIntroducido));
  }
}
