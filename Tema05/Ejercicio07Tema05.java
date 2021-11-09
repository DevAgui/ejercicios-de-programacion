/**
 * Ejercicio 7 Tema 5.
 * Éste ejercicio nos pide crear un programa que realice el control de acceso a una caja fuerte. 
 * La combinación será de un número de 4 cifras. Saldrán mensajes en caso de no acertar la combinación, 
 * y en caso de acertarla aparecerá un mensaje. Tendremos cuatro oportunidades para abrir la caja.
 * @author Diego Aguilera Martín
 */
public class Ejercicio07Tema05 {
  public static void main(String[] args) {
    
    System.out.println("Control de acceso a la caja fuerte. Por favor, introduzca el número de 4 cifras para abrirla.");
    System.out.println("");
    
    int x = 320;
    do{
    System.out.println(x);
    System.out.println("");
    x -= 20;
    } while( x >= 160);
}
}
