 /**
 *Ejercicio 5 Tema Variables.
 *Éste ejercicio nos pide crear un conversor de pesetas a euros. 
 * @author Diego Aguilera Martín
 */
public class Ejercicio05Tema02 {
  public static void main(String[] args) {
    
  double pesetas = 50000d;
  
  double conversion = pesetas / 166.386d;
  
  
  System.out.printf("Tenemos %.2f pesetas \n", pesetas);
  System.out.printf("Que en euros sería %.2f euros \n ", conversion);
  }
}
