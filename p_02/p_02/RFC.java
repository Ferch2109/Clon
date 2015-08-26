import java.util.Scanner;
/**
 * Programa para calcular el RFC de una persona.
 * Objetivo Utilizar algunos métodos de la clase String
 * @author  ... 
 * @version ...
 */
public class RFC {
  static public void main(String [] args) {
    String nombre;
    String apellidoMaterno;
    String apellidoPaterno;
    String fechaNac;
    String rfc="";
    Scanner in = new Scanner(System.in);

    // Solicita nombre
    // Solicita el apellido paterno
    // Solicita el apellido materno

    // Extrae las dos letras del apellido paterno y lo agreaga a RFC
    // Extrae la inicial del apellildo materno y lo agrega a RFC
         // Extrae la inicial del nombre y lo agrega a RFC

    // Solicita la fecha de nac.
    // Lee la fecha de nacimiento
    // Extrae la informacion requerida

    System.out.println("El RFC de "+ nombre + "es  " +  rfc ); //Pasar a mayusculas el RFC y mostrarlo
  
  }
}