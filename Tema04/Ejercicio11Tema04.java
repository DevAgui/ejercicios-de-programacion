/**
 * Ejercicio 11 Tema 4.
 * Éste ejercicio nos pide realizar un programa que te diga en segundos lo que queda para la medianoche . 
 * @author Diego Aguilera Martín
 */
public class Ejercicio11Tema04 {
  public static void main(String[] args) {
    
    System.out.println("¿Quieres saber lo que queda para medianoche?");
    System.out.println("");
    System.out.println("Por favor, dime la hora que es en dígitos: ");
    int hora = Integer.parseInt(System.console().readLine()); 
    System.out.println("");
    System.out.println("Por favor, dime los minutos que son en dos dígitos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    
    int mediaNoche = 86400;
    int pasoHorasAsegundos = hora * 3600;
    int pasoMinutosAsegundos = minutos * 60;
    int sumaEnSegundos = pasoHorasAsegundos + pasoMinutosAsegundos;
    int quedaHastaMediaNoche = mediaNoche - sumaEnSegundos;
    
    System.out.println("");
    System.out.printf("Para medianoche todavía quedan %d segundos.", quedaHastaMediaNoche);
        }
        
    
    
  }

