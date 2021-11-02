/**
 * Ejercicio 21 Tema 4.
 * Éste ejercicio nos pide realizar un programa que calcule la nota media de un trimrestre de la asginatura de Programación. Se pedirá la nota de los dos primeros controles. Si la media es igual o superior a 5, el alumno está aprobado y se mostrará la nota media. Si es inferior, el alumno habrá tenido que hacer la recuperación, la cuál se califica como apto o no apto. Se ha de preguntar al usuario si ha sido apto o no apto. Si el resultado de la recuperación es apto, la nota será de un 5, en caso contrario se mantiene la nota anterior.
 * @author Diego Aguilera Martín1
 */
public class Ejercicio21Tema04 {
  public static void main(String[] args) {
    
    System.out.println("Éste programa te dice cuál es tu nota media en base a los dos controles realizados en Programación. En caso de nota inferior a 5 de media, se le preguntará si ha recuperado apto/no apto.");
    System.out.println("");
    
    
    System.out.println("Por favor, introduzca la nota del primer control: ");
    double primerControl = Double.parseDouble(System.console().readLine());
    System.out.println("Por favor, introduzca la nota del segundo control: ");
    double segundoControl = Double.parseDouble(System.console().readLine());
    double sumaNotas = primerControl + segundoControl;
    double notaMedia = sumaNotas / 2;
    String recuperacion = "";
    
    
    if((notaMedia >= 5) && (notaMedia <= 10)){
      System.out.printf("Tu nota media éste trimestre es de %3.2f. Enhorabuena por aprobar.", notaMedia);
      }
    if((notaMedia <= 4.99) && (notaMedia >= 0)){
      System.out.println("¿Cuál ha sido el resultado de la recuperación (apto/no apto) ?");
      recuperacion = (System.console().readLine().toLowerCase());
      }
    switch(recuperacion){
      case "apto":
        System.out.println("Tu nota de programación es un 5.");
        break;
       
      case "no apto":
        System.out.printf("Lo siento, tu nota media éste trimestre es de %3.2f.", notaMedia);
        break;
        default:
            
              }
        }
    
    

    }
    

