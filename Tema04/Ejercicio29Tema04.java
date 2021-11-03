/**
 * Ejercicio 29 Tema 4.
 * Éste ejercicio nos pide realizar un programa que te calculará el precio de un desayuno. 
 * @author Diego Aguilera Martín
 */
public class Ejercicio29Tema04 {
  public static void main(String[] args) {

    System.out.println("Bienvenido a la calculadora del desayuno.");
    System.out.println("");
    System.out.println("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
    String comida =(System.console().readLine().toLowerCase()); 
    System.out.println("");
    String tipoPitufo = "";
    if(comida.equals("pitufo")){
      System.out.println("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
      tipoPitufo =(System.console().readLine().toLowerCase());
      }
    System.out.println("¿Qué ha tomado de beber? (zumo o café): ");
    String bebida =(System.console().readLine().toLowerCase());
    System.out.println("");
    
    double palmera = 1.40;
    double donut = 1;
    double pitufoAceite = 1.20;
    double pitufoTortilla = 1.60;
    double zumo = 1.50;
    double cafe = 1.20;
    double totalDesayuno = 0;
    switch(comida){
      case "palmera":
      if(bebida.equals("zumo")){
        totalDesayuno = palmera + zumo;
        System.out.printf("%s                  %2.2f € \n", "Palmera: ", palmera);
        System.out.printf("%s                  %2.2f € \n", "Zumo:    ", zumo);
        System.out.printf("Total desayuno:            %2.2f € \n", totalDesayuno);
        } else if(bebida.equals("café")){
            totalDesayuno = palmera + cafe;
            System.out.printf("%s                  %2.2f € \n", "Palmera: ", palmera);
            System.out.printf("%s                  %2.2f € \n", "Café:    ", cafe);
            System.out.printf("Total desayuno:            %2.2f € \n", totalDesayuno);
          }
      break;
      case "donut":
      if(bebida.equals("zumo")){
        totalDesayuno = donut + zumo;
        System.out.printf("%s                    %2.2f € \n", "Donut: ", donut);
        System.out.printf("%s                  %2.2f € \n", "Zumo:    ", zumo);
        System.out.printf("Total desayuno:            %2.2f € \n", totalDesayuno);
        } else if(bebida.equals("café")){
            totalDesayuno = donut + cafe;
            System.out.printf("%s                    %2.2f € \n", "donut: ", donut);
            System.out.printf("%s                  %2.2f € \n", "Café:    ", cafe);
            System.out.printf("Total desayuno:            %2.2f € \n", totalDesayuno);
          }
      break;
      case "pitufo":
      if((tipoPitufo.equals("aceite"))&&(bebida.equals("zumo"))){
        totalDesayuno = pitufoAceite + zumo;
        System.out.printf("%s                     %2.2f € \n", "Pitufo con aceite:", pitufoAceite);
        System.out.printf("%s                                  %2.2f € \n", "Zumo:", zumo);
        System.out.printf("Total desayuno:                        %2.2f € \n", totalDesayuno);
        } else if((tipoPitufo.equals("aceite"))&&(bebida.equals("café"))){
            totalDesayuno = pitufoAceite + cafe;
            System.out.printf("%s                  %2.2f € \n", "Pitufo con aceite:", pitufoAceite);
            System.out.printf("%s                               %2.2f € \n", "Café:", cafe);
            System.out.printf("Total desayuno:                     %2.2f € \n", totalDesayuno);
          } else if((tipoPitufo.equals("tortilla"))&&(bebida.equals("zumo"))){
              totalDesayuno = pitufoTortilla + zumo;
              System.out.printf("%s                  %2.2f € \n", "Pitufo con tortilla:", pitufoTortilla);
              System.out.printf("%s                                 %2.2f € \n", "Zumo:", zumo);
              System.out.printf("Total desayuno:                       %2.2f € \n", totalDesayuno);
            } else if((tipoPitufo.equals("tortilla"))&&(bebida.equals("café"))){
              totalDesayuno = pitufoTortilla + cafe;
              System.out.printf("%s                  %2.2f € \n", "Pitufo con tortilla:", pitufoTortilla);
              System.out.printf("%s                                 %2.2f € \n", "Café:", cafe);
              System.out.printf("Total desayuno:                       %2.2f € \n", totalDesayuno);
          }
      break;
      }

  }

}
