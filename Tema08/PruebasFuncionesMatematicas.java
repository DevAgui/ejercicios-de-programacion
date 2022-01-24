import misfunciones.FuncionesMatematicas;

public class PruebasFuncionesMatematicas {

  public static void main(String[] args) {

    System.out.println("Introduce tu número para saber si es capicúa o no: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    if (FuncionesMatematicas.esCapicua(numeroIntroducido)) {
      System.out.println("Tu número es capicúa");
    } else {
      System.out.println("Tu número no es capicúa");
    }

  }
}
