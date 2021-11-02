/**
 * Ejercicio 22 Tema 4.
 * Éste ejercicio nos pide realizar un programa que te diga cuántos minutos quedan para el fin de semana entendiendo que empieza el viernes a las 15:00. Para ello el usuario ah de introducir el día de la semana (de lunes a viernes), y una hora y unos minutos.
 * @author Diego Aguilera Martín
 */
public class Ejercicio22Tema04 {
  public static void main(String[] args) {

    System.out.println("¿Quieres saber cuánto queda para el finde (viernes a las 15:00)?");
    System.out.println("");
    System.out.println("Por favor, dime el día de la semana que es (lunes, martes, miércoles, jueves o viernes): ");
    String dia =(System.console().readLine().toLowerCase()); 
    System.out.println("");
    System.out.println("Por favor, dime la hora que es con dos cifras: ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.println("");
    System.out.println("Por favor, dime los minutos que son: ");
    int minutos = Integer.parseInt(System.console().readLine());
    System.out.println("");

    int finde = 6660;
    int valorDiaSemana = 0;
    switch(dia){
      case "lunes":
      valorDiaSemana = 1440;
      break;
      case "martes":
      valorDiaSemana = 2880;
      break;
      case "miércoles":
      valorDiaSemana = 4320;
      break;
      case "jueves":
      valorDiaSemana = 5760;
      break;
      case "viernes":
      valorDiaSemana = 7200;
      break;
      }
   
    int horaEnMinutos = 0;   
    switch(hora){
      case 23:
      horaEnMinutos = 60;
      break;
      case 22:
      horaEnMinutos = 120;
      break;
      case 21:
      horaEnMinutos = 180;
      break;
      case 20:
      horaEnMinutos = 240;
      break;
      case 19:
      horaEnMinutos = 300;
      break;
      case 18:
      horaEnMinutos = 360;
      break;
      case 17:
      horaEnMinutos = 420;
      break;
      case 16:
      horaEnMinutos = 480;
      break;
      case 15:
      horaEnMinutos = 540;
      break;
      case 14:
      horaEnMinutos = 600;
      break;
      case 13:
      horaEnMinutos = 660;
      break;
      case 12:
      horaEnMinutos = 720;
      break;
      case 11:
      horaEnMinutos = 780;
      break;
      case 10:
      horaEnMinutos = 840;
      break;
      case 9:
      horaEnMinutos = 900;
      break;
      case 8:
      horaEnMinutos = 960;
      break;
      case 7:
      horaEnMinutos = 1020;
      break;
      case 6:
      horaEnMinutos = 1080;
      break;
      case 5:
      horaEnMinutos = 1140;
      break;
      case 4:
      horaEnMinutos = 1200;
      break;
      case 3:
      horaEnMinutos= 1260;
      break;
      case 2:
      horaEnMinutos = 1320;
      break;
      case 1:
      horaEnMinutos = 1380;
      break;
      case 0:
      horaEnMinutos= 1440;
      break;
      default:
      }
    int resta1 = horaEnMinutos - minutos;
    int resta2 = valorDiaSemana - resta1;
    int quedaFinde = finde - resta2;
    

    System.out.printf("Queda para el fin de semana %d minutos.", quedaFinde);
  }

}
