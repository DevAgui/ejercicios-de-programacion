/*Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez
una lista para almacenar la información sobre los discos en lugar de un array
convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
programa hecho con una lista?*/

package Ejercicio05ArrayList;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;


public class ColeccionDiscos {
    
    public static void main(String[] args){


        // Declaración de variables
        int opcionListado = 0;
        int opcion;
        int i;

        // Variables de lectura por teclado
        String autorIntroducido;
        String tituloIntroducido;
        String generoIntroducido;
        int duracionIntroducida;
        String codigoIntroducido;

        Scanner s = new Scanner(System.in);

        // Tamaño del ArrayList
        int N = 100;

        // ArrayList de discos
        ArrayList<Disco> album = new ArrayList<Disco>();

        // Creación de Discos para tener alguno en Listado
        album.add(new Disco("1", "Jethro Tull", "Aqualung", "Folk-rock", 63));
        album.add(new Disco("2", "Mago de Oz", "Finisterra", "Folk-rock", 110));
        album.add(new Disco("3", "Pink Floyd", "Animals", "Rock", 47));
        album.add(new Disco("4", "Nirvana", "Nevermind", "Rock", 50));




        // Menu del CRUD de Discos
        do{
            System.out.println("Bienvenido a tu colección de discos");
            System.out.println("-----------------------------------");
            System.out.println("1. LISTADO");
            System.out.println("2. NUEVO DISCO");
            System.out.println("3. MODIFICAR");
            System.out.println("4. BORRAR");
            System.out.println("5. SALIR");
            System.out.println("Seleccione la opción deseada: ");

            // El usuario introduce la opción deseada:
            opcion = Integer.parseInt(System.console().readLine());


            switch(opcion){

                // Aquí se muestra el listado

                case 1:
                do{
                    System.out.println("LISTADO DE DISCOS");
                    System.out.println("-----------------------------------");
                    System.out.println("1. COMPLETO");
                    System.out.println("2. POR AUTOR");
                    System.out.println("3. POR GÉNERO");
                    System.out.println("4. POR TÍTULO");
                    System.out.println("5. VOLVER AL MENÚ   ");
                    System.out.println("Seleccione la opción deseada: ");

                    // El usuario introduce la opción deseada:
                    opcionListado = Integer.parseInt(System.console().readLine());

                    // Selecciona y muestra por pantalla el listado deseado
                    switch(opcionListado){

                        // Listado completo
                        case 1:
                        
                            for(Disco a : album){

                                System.out.println(a.toString());

                            }

                        break;

                        // Listado por autor
                        case 2:

                            System.out.println("Introduzca el autor que desea buscar: ");
                            autorIntroducido = s.nextLine();

                            for(Disco a : album){

                                if(a.getAutor().equals(autorIntroducido)){ // Compara entre los datos que se tiene con lo que se ha introducido por teclado, sacando solo eso por pantalla.

                                    System.out.println(a);

                                }
                            
                            }

                        break;

                        // Listado por género
                        case 3:

                            System.out.println("Introduzca el género por el que desea buscar: ");
                            generoIntroducido = s.nextLine();

                            for(Disco a : album){

                                if(a.getGenero().equals(generoIntroducido)){

                                    System.out.println(a);
                                }
                            }

                        break;

                        //Listado por título
                        case 4:

                            System.out.println("Introduzca el título que desea buscar: ");
                            tituloIntroducido = s.nextLine();

                            for(Disco a : album){

                                if(a.getTitulo().equals(tituloIntroducido)){
                                    
                                    System.out.println(a);
                                }
                            }

                        break;
                        default:
                    }
                }while(opcionListado != 5);

                // Añadir disco
                case 2:

                System.out.println("----NUEVO DISCO----");
                System.out.println("Por favor, introduce el código del disco para ver si ya existe: ");

                codigoIntroducido = s.nextLine();

                while(album.contains( new Disco(codigoIntroducido, "", "", "", 0))){// Comprueba que no haya un Disco que ya exista con el código introducido

                    System.out.println("Ese Disco ya existe.");

                    System.out.println("Introduce otro código: ");

                    codigoIntroducido = s.nextLine();

                }

                System.out.println("Introduce el autor: ");
                autorIntroducido = s.nextLine();

                System.out.println("Introduce el título: ");
                tituloIntroducido = s.nextLine();

                System.out.println("Introduce el género: ");
                generoIntroducido = s.nextLine();

                System.out.println("Introduce la duración: ");
                duracionIntroducida = Integer.parseInt(s.nextLine());

                // Recoge todos los datos previamente introducidos y los mete en el ArrayList de Discos

                album.add(new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida));

                break;
            }
        }while(opcion != 5);
    }
}
