import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio19Diccionarios {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Diccionario Español-Inglés de sinónimos.
        HashMap<String, String> sinonimos = new HashMap<String, String>();

        sinonimos.put("caliente", "hot");
        sinonimos.put("rojo", "red");
        sinonimos.put("ardiente", "hot");
        sinonimos.put("verde", "green");
        sinonimos.put("agujetas", "stiff");
        sinonimos.put("abrasador", "hot");
        sinonimos.put("hierro", "iron");
        sinonimos.put("grande", "big");

        String palabraIntroducida = "";

        do {

            System.out.println("Introduzca una palabra y le daré los sinónimos:");
            palabraIntroducida = s.next().toLowerCase();

            if (sinonimos.containsKey(palabraIntroducida)) {

                if(sinonimos.containsValue(sinonimos.get(palabraIntroducida))){

                }

            }

        } while (!palabraIntroducida.equals("salir"));

    }
}
