/**
 * Ejercicio 12 Tema 4.
 * Éste ejercicio nos pide crear un cuestionario tipo test con 10 preguntas de asignaturas del grado. Cada acierto sumará 1 punto.
 * @author Diego Aguilera Martín
 */
public class Ejercicio12Tema04 {
  public static void main(String[] args) {
    
    int nota = 0; 
    boolean primeraPregunta = true;
    boolean restoPreguntas = true;
    
    System.out.println("Bienvenido al examen con el que solo te vas a jugar ir de Erasmus.");
    System.out.println("");
    System.out.println("--Para responder como verdadero, tendrás que pulsar 1, para responder como falso, tendrás que pulsar 2.--");
    System.out.println("");
    
    System.out.println("Primera pregunta: ");
    System.out.println("");
    System.out.println("¿La PK de una entidad puede ser FK en otra entidad?");
    int respuesta1 = Integer.parseInt(System.console().readLine());
    if((respuesta1 == 1) && (primeraPregunta == true)){
      nota++;
      } else{
          nota--;
        }   
    
    System.out.println("");
    System.out.println("Segunda pregunta: ");
    System.out.println("");
    System.out.println("El lifecycle tipo waterfall es el más utilizado en la actualidad.");
    int respuesta2 = Integer.parseInt(System.console().readLine());
    if((respuesta2 == 2) && (restoPreguntas == true)){
      nota++;
      } else{
          nota--;
        }
    
    System.out.println("");
    System.out.println("Tercera pregunta: ");
    System.out.println("");
    System.out.println("El formato de tamaño BTX es el más extendido comercialmente.");
    int respuesta3 = Integer.parseInt(System.console().readLine());
    if((respuesta3 == 2) && (restoPreguntas == true)){
      nota++;
      } else{
          nota--;
        }
    
    System.out.println("");
    System.out.println("Cuarta pregunta: ");
    System.out.println("");
    System.out.println("El atributo margin-left modifica el espacio interior de una caja.");
    int respuesta4 = Integer.parseInt(System.console().readLine());
    if((respuesta4 == 2) && (restoPreguntas == true)){
      nota++;
      } else{
          nota--;
        }
    
    System.out.println("");
    System.out.println("Quinta pregunta: ");
    System.out.println("");
    System.out.println("La OMS entiende la salud sólo como el bienestar físico.");
    int respuesta5 = Integer.parseInt(System.console().readLine());
    if((respuesta5 == 2) && (restoPreguntas == true)){
      nota++;
      } else{
          nota--;
        }
    
    System.out.println("");
    System.out.println("Sexta pregunta: ");
    System.out.println("");
    System.out.println("Notion es una herramienta de creación de Software.");
    int respuesta6 = Integer.parseInt(System.console().readLine());
    if((respuesta6 == 2) && (restoPreguntas == true)){
      nota++;
      } else{
          nota--;
        }
    
    System.out.println("");
    System.out.println("Séptima pregunta: ");
    System.out.println("");
    System.out.println("El componente más importante de una computadora es la tarjeta gráfica.");
    int respuesta7 = Integer.parseInt(System.console().readLine());
    if((respuesta7 == 2) && (restoPreguntas == true)){
      nota++;
      } else{
          nota--;
        }
    
    System.out.println("");
    System.out.println("Octava pregunta: ");
    System.out.println("");
    System.out.println("Si existe un tipo de relación 1-n, ¿estamos hablando de la cardinalidad mínima?");
    int respuesta8 = Integer.parseInt(System.console().readLine());
    if((respuesta8 == 2) && (restoPreguntas == true)){
      nota++;
      } else{
          nota--;
        }
    
    System.out.println("");
    System.out.println("Novena pregunta: ");
    System.out.println("");
    System.out.println("Normalmente introducimos el CSS en nuestra etiqueta <style>.");
    int respuesta9 = Integer.parseInt(System.console().readLine());
    if((respuesta9 == 2) && (restoPreguntas == true)){
      nota++;
      } else{
          nota--;
        }
    
    System.out.println("");
    System.out.println("Décima pregunta: ");
    System.out.println("");
    System.out.println("LOAD en la máquina de von Neumann era una instrucción en lenguaje JAVA.");
    int respuesta10 = Integer.parseInt(System.console().readLine());
    if((respuesta10 == 2) && (restoPreguntas == true)){
      nota++;
      } else{
          nota--;
        }
    
    if(nota == 5){
      System.out.println("");
      System.out.printf("Tu nota es de: %d, aprobaste por los pelos.", nota);
    } else if (nota >=5){
        System.out.println("");
        System.out.printf("Tu nota es de: %d, enhorabuena!", nota);
      } else{
          System.out.println("");
          System.out.printf("Tu nota es de: %d, suspendiste...", nota);
        }
    
  }
}
