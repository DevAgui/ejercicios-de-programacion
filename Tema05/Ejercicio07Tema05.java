/**
 * Ejercicio 7 Tema 5. Éste ejercicio nos pide crear un programa que realice el
 * control de acceso a una caja fuerte. La combinación será de un número de 4
 * cifras. Saldrán mensajes en caso de no acertar la combinación, y en caso de
 * acertarla aparecerá un mensaje. Tendremos cuatro oportunidades para abrir la
 * caja.
 * 
 * @author Diego Aguilera Martín
 */
public class Ejercicio07Tema05 {
  public static void main(String[] args) {
    int oportunidades = 4;
    int codigo = 4572;
    int numero = 0;
    System.out.println("Control de acceso a la caja fuerte. Recuerde que solo tiene 4 intentos y que el código es de 4 cifras.");
    
    while ((numero != codigo) && (oportunidades > 0)) {
      System.out.println("Introduzca el código: ");
      numero = Integer.parseInt(System.console().readLine());
      System.out.println();
      if ((oportunidades > 0) && (numero != codigo)) {
        System.out.println("Lo siento, esa no es la combinación para abrirla.");
        oportunidades --;
      }
        if(oportunidades == 0){
          System.out.println();
          System.out.println("Se han acabado los intentos. La caja se ha bloqueado.");
          System.out.println("Póngase en contacto con la empresa de seguridad.");
        }else{
        System.out.println("Te quedan " + oportunidades + " intentos");
        System.out.println();
      } if ((oportunidades == 0) && (numero != codigo)) {
        System.out.println();
        System.out.println("Lo siento, has agotado las oportunidades. La caja fuerte se ha cerrado.");
      } else if (numero == codigo) {
        System.out.println();
        System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
      }
    }

  }
}