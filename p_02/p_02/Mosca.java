/**
 * Programa para trabajar con metodos de la clase String
 * @author  ...
 * @version ...
 */

public class Mosca {
  public static void main (String [] pps) {
    String frase = new String ("Una mosca parada en la pared, en la pared      ");
    String frase1, frase2, frase3, frase4, frase5;
  
    System.out.println("Cadena original: \"" + frase + "\"");
    //Imprimir la longitud de la cadena
    System.out.println("Longitud de la cadena: ");  

    frase1 = "";  // Eliminar los blancos al final de la frase
    System.out.println("Longitud de la cadena sin espacios:  ");

    frase2 = ""; //Poner la frase1 en mayúsculas
    frase3 = "";  // Agregar la frase1 PINTADA DE ROJO
    

    // Imprimir cada "mutación" de la cacddena
    System.out.println("Frase #1: " + frase1);
    System.out.println("Frase #2: " + frase2);
    System.out.println("Frase #3: " + frase3);
  }
}