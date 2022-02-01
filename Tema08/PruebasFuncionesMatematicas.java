import misfunciones.FuncionesMatematicas;

public class PruebasFuncionesMatematicas {

  public static void main(String[] args) {

    System.out.println("Introduce un número.");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    /* 1- Comprobación Capicúa */
    System.out.println("----------------------------------------------------------");
    if (FuncionesMatematicas.esCapicua(numeroIntroducido)) {
      System.out.println("Tu número es capicúa");
    } else {
      System.out.println("Tu número no es capicúa");
    }

    /* 2 y 3- Comprobación número primo y número primo siguiente */
    System.out.println("----------------------------------------------------------");
    if (FuncionesMatematicas.esPrimo(numeroIntroducido)) {
      System.out.println("El " + numeroIntroducido + " es primo");
    } else {
      System.out.println("El " + numeroIntroducido + " no es primo");
      System.out.println("El " + FuncionesMatematicas.siguientePrimo(numeroIntroducido) + " es el siguiente primo");
    }

    /* 4- Exponenciación de un número introducido por teclado */
    System.out.println("----------------------------------------------------------");
    System.out.println("Introduce el número al que quieras exponer  ");
    int exponente = Integer.parseInt(System.console().readLine());
    System.out.println("El resultado de exponer tu número al exponente es: "
        + FuncionesMatematicas.potencia((int) numeroIntroducido, exponente));

    
    /* 5- Cuenta el número y te devuelve la posición */
    System.out.println("----------------------------------------------------------");
    System.out.println("Introduce el número el cuál quieras saber los dígitos ");
    int digitos = Integer.parseInt(System.console().readLine());
    System.out.println("Hay " + FuncionesMatematicas.digitos(digitos) + " digitos");


    /* 6- Cuenta el número y te devuelve la posición */
    System.out.println("----------------------------------------------------------");
    System.out.println("Introduce el número el y le voy a dar la vuelta");
    int volteo = Integer.parseInt(System.console().readLine());
    if (volteo >= 10){
      System.out.println("El número al reves es " + FuncionesMatematicas.volteo(volteo));
    } else{
      System.out.println("Tu número es: " + volteo);
    }

    System.out.println("----------------------------------------------------------");
    System.out.println("Introduce un número entero positivo");
    int n = Integer.parseInt(System.console().readLine());
    System.out.println("Ahora introduce un dígito que se encuentre en el número que has introducido: ");
    int digito = Integer.parseInt(System.console().readLine());
    System.out.println("Tu número es el " + FuncionesMatematicas.digitoN(digito) + " digitos");


  }
}
