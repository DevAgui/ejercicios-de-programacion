
/*
 * ENUNCIADO:
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 * 
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        
        int[][] n = new int[4][5];
            
        Integer sumatorioTotal = 0;
        Integer sumatorioFila = 0;
        Integer sumatorioColumna = 0;
        Integer volcadoFila = 0;
        Integer volcadoColumna = 0;
        Integer fila = 0;
        Integer columna = 0;

        for(fila = 0; fila <= 3; fila++){

            for(columna = 0; columna <= 4; columna++){

                n[fila][columna] = Integer.parseInt(System.console().readLine());
                sumatorioTotal += n[fila][columna];

            }
        }

        System.out.print("\nArray num  Columna 0  Columna 1  Columna 2  Columna 3  Columna 4  SumaFila");
        for(fila = 0; fila <= 3; fila++){
            sumatorioFila = 0;
            System.out.println();
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("|Fila " + fila + "   |");

            for(columna = 0; columna <= 4; columna++){
                
                
                
                System.out.printf("%7d   |",n[fila][columna]);

                sumatorioFila += n[fila][columna];
                volcadoFila = sumatorioFila;
                

            }

            
            System.out.printf("%6d   |",volcadoFila);

        }
        System.out.println("\n----------------------------------------------------------------------------");
        System.out.print("|SumaCol  |");
        for(columna = 0; columna <= 4; columna++){
            sumatorioColumna = 0;

            for(fila = 0; fila <= 3; fila++){

                sumatorioColumna += n[fila][columna];
                volcadoColumna = sumatorioColumna;

            }

            
            System.out.printf("%7d   |", volcadoColumna);

        }

        System.out.printf("SumTot %1d|", sumatorioTotal);
        System.out.println("\n----------------------------------------------------------------------------");
        
    }

}