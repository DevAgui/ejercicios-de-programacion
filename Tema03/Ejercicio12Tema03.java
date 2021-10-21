/**
 * Ejercicio 12 Tema 3.
 * Éste ejercicio nos pide crear un programa capaz de calcular la nota que tienes que sacar en el segundo examen si quieres sacar x nota al final del trimestre. La primera nota vale el 40% del total, la segunda el 60%. 
 * @author Diego Aguilera Martín
 */
public class Ejercicio12Tema03 {
  public static void main(String[] args) {
    System.out.println("Éste programa calcula la nota que te hará falta para sacar la nota deseada en el trimestre!");
    System.out.println("");
    System.out.println("");
    System.out.println("Introduce la nota del primer examen entre 0 y 10: ");
    double primeraNota = Double.parseDouble(System.console().readLine());
    System.out.println("");
    System.out.println("¿Qué nota deseas sacar en el trimestre? entre 0 y 10: ");
    double notaDeseada = Double.parseDouble(System.console().readLine());
  
    System.out.println("");
    double ponderacionPrimeraNota = primeraNota * 0.4;
    double calculoValorNota = notaDeseada - ponderacionPrimeraNota;
    double notaNecesaria = calculoValorNota / 0.6;
    System.out.printf("Para sacar el %.2f que deseas deberás sacar %.2f", notaDeseada, notaNecesaria);
  }
}
