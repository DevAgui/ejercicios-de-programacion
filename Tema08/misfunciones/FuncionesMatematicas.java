package misfunciones;

public class FuncionesMatematicas {
    /*
     * 1. esCapicua: Devuelve verdadero si el número que se pasa como paráme-
     * tro es capicúa y falso en caso contrario.
     */

    public static boolean esCapicua(int numeroIntroducido) {
        int numero = numeroIntroducido;
        int voltear = 0;
        int contador = 0;

        while (numero > 0) {
            voltear = (voltear * 10) + (numero % 10);
            numero /= 10;
            contador++;
        }
        if ((voltear == numeroIntroducido) && (contador > 1)) {
            return true;

        } else {
            return false;
        }
    }

    /**
     * 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
     * es primo y falso en caso contrario.*/

    public static boolean esPrimo(int numeroIntroducido){
        int comprobacionPrimo = 0;
        if ((numeroIntroducido == 1) || (numeroIntroducido == 2)) {
            return true;
        } else {
            for (comprobacionPrimo = 2; ((comprobacionPrimo < numeroIntroducido) && ((numeroIntroducido % comprobacionPrimo) != 0)); comprobacionPrimo++){ }
            
            if (comprobacionPrimo == numeroIntroducido){
                return true;
            } else {
                return false;
            }
        }
    }

    /** 
     * 3. siguientePrimo: Devuelve el menor primo que es mayor al número que
     * se pasa como parámetro.*/

     public static int siguientePrimo(int numeroIntroducido){
        while (!esPrimo(++numeroIntroducido)){};
        return numeroIntroducido;
    }
    
    /**
     * 4. potencia: Dada una base y un exponente devuelve la potencia.
     */
    public static int potencia(int x , int e){
        int exponenciacion = 1;
        for (int reiteracion = 0; reiteracion < e; reiteracion++) {
            exponenciacion = (x * exponenciacion);
        }
        return exponenciacion;
    }

     /**
     * 5. digitos: Cuenta el número de dígitos de un número entero.*/
    public static int digitos(int numeroIntroducido){
        int digito = 0;
        int posicion = 1;
        int division = numeroIntroducido;
        int cifra = numeroIntroducido;
        int cuentaDigitos = 0;

        if (division >= 10) {
            while (division > 0) {
              cuentaDigitos++;
              cifra = division % 10;
              if (digito == cifra) {
                posicion = cuentaDigitos;
              }
              division = division / 10;
            }
        }
        return cuentaDigitos;
    }
    /**
     * 6. voltea: Le da la vuelta a un número.
     * 7. digitoN: Devuelve el dígito que está en la posición n de un número entero.
     * Se empieza contando por el 0 y de izquierda a derecha.
     * 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
     * dentro de un número entero. Si no se encuentra, devuelve -1.
     * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
     * derecha).
     * 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
     * izquierda).
     * 11. pegaPorDetras: Añade un dígito a un número por detrás.
     * 12. pegaPorDelante: Añade un dígito a un número por delante.
     * 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
     * dentro de un número y devuelve el trozo correspondiente.
     **/

}
