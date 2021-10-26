/**
 * Ejercicio 1 Tema 4.
 * Éste ejercicio nos pide crear un programa que pida por teclado un día de la semana y diga qué asignatura toca a primera hora.
 * @author Diego Aguilera Martín
 */
public class Ejercicio01Tema04 {
  public static void main(String[] args) {
    
    System.out.println("Éste programa te permite saber qué asignatura tienes el día que introduzcas por teclado.");
    System.out.println("");
    
    System.out.println("Por favor, introduce un día de la semana, de lunes a viernes en minúsculas para saber qué asignatura tienes a primera hora: ");
    String diaSemana = (System.console().readLine().toLowerCase());
    System.out.println("");
    
    if(diaSemana.equals("lunes")){
      System.out.println("A primera hora tienes Programación.");
    } else if (diaSemana.equals("martes")){
      System.out.println("A primera hora tienes Programación.");
      } else if (diaSemana.equals("miércoles" )){
        System.out.println("A primera hora tienes Sistemas Informáticos.");
        } else if(diaSemana.equals("jueves")){
          System.out.println("A primera hora tienes Programación.");
          } else if(diaSemana.equals("viernes")){
            System.out.println("A primera hora tienes Sistemas Informáticos.");
            } else{
              System.out.println("¡Enhorabuena!¡No tienes clase :D! O peor aún, te has equivocado metiendo los datos...");
              }
  }
}
