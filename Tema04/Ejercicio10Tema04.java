/**
 * Ejercicio 10 Tema 4.
 * Éste ejercicio nos pide crear un programa que nos dice cuál es nuestro horoscopo dependiendo del día y el mes de nacimiento.
 * @author Diego Aguilera Martín
 */
public class Ejercicio10Tema04 {
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduce tu mes de nacimiento del 1 al 12: ");
    int mesNacimiento = Integer.parseInt(System.console().readLine());
    System.out.println("");
    System.out.println("Por favor, introduce tu día de nacimiento en numéros enteros: ");
    int diaNacimiento = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    

    
    switch(mesNacimiento){
      case 1:
        if(diaNacimiento <= 19){
         System.out.println("Eres Capricornio ♑");
      } else{
          System.out.println("Eres Acuario ♒");
         }
        break;
      case 2:
        if(diaNacimiento <= 19){
         System.out.println("Eres Acuario ♒");
       }  else{
           System.out.println("Eres Piscis ♓");
         }
        break;
      case 3:
        if(diaNacimiento <= 20){
         System.out.println("Eres Piscis ♓");
       }  else{
           System.out.println("Eres Aries ♈");
         }
        break;
      case 4:
         if(diaNacimiento <= 20){
         System.out.println("Eres Aries ♈");
       }  else{
           System.out.println("Eres Tauro ♉");
         }
        break;
      case 5:
         if(diaNacimiento <= 21){
         System.out.println("Eres Tauro ♉");
       }  else{
           System.out.println("Eres Géminis ♊");
         }
        break;
      case 6:
         if(diaNacimiento <= 21){
         System.out.println("Eres Géminis ♊");
       }  else{
           System.out.println("Eres Cáncer ♋");
         }
        break;
      case 7:
         if(diaNacimiento <= 23){
         System.out.println("Eres Cáncer ♋");
       }  else{
           System.out.println("Eres Leo ♌");
         }
        break;
      case 8:
         if(diaNacimiento <= 23){
         System.out.println("Eres Leo ♌");
       }  else{
           System.out.println("Eres Virgo ♍");
         }
        break;
      case 9:
         if(diaNacimiento <= 22){
         System.out.println("Eres Virgo ♍");
       }  else{
           System.out.println("Eres Libra ♎");
         }
        break;
      case 10:
         if(diaNacimiento <= 22){
         System.out.println("Eres Libra ♎");
       }  else{
           System.out.println("Eres Escorpio ♏");
         }
        break;
      case 11:
         if(diaNacimiento <= 22){
         System.out.println("Eres Escorpio ♏");
       }  else{
           System.out.println("Eres Sagitario ♐");
         }
        break;
      case 12:
         if(diaNacimiento <= 21){
         System.out.println("Eres Sagitario ♐");
       }  else{
           System.out.println("Eres Capricornio ♑");
         }
        break;
      default:
         System.out.println("Lo siento, el dato introducido es incorrecto. Vuelve a introducir otro dato.");
      }

    
  }
}
