import java.util.Scanner;
/**
 * Programa para calcular el RFC de una persona.
 * Objetivo Utilizar algunos métodos de la clase String
 *
 * @author  Angel Gladin 
 * @version 1.0
 *
 * ICC
 */

public class RFC {

  static public void main(String [] args) {

    String nombre;
    String apellidoMaterno;
    String apellidoPaterno;
    String fechaNac;
    String rfc;

    Scanner in = new Scanner(System.in);

    System.out.println("Ingresa tu nombre");
    nombre = in.nextLine();
    
    System.out.println("Ingresa tu apellido paterno");
    apellidoPaterno = in.nextLine().toLowerCase();

    System.out.println("Ingresa tu apellido materno");
    apellidoMaterno = in.nextLine();
    
    System.out.println("Ingresa tu fecha de nacimiento en el formato dd-mm-aaaa (sin guiones)");
    fechaNac = in.nextLine();

    rfc = obtenerRFC(nombre, apellidoPaterno, apellidoMaterno, fechaNac).toUpperCase();
    System.out.println("El RFC de "+ nombre + " es " +  rfc ); //Pasar a mayusculas el RFC y mostrarlo
  
  }

    public static String obtenerRFC(String nom, String apePa, String apeMa, String date){
        StringBuilder rfc = new StringBuilder();

        // Extrae las dos letras del apellido paterno
        // La primera es la primera letra del apellido paterno
        rfc.append(apePa.charAt(0));
        // La segunda trae la primera vocal del apellido paterno
        
        for(char i : apePa.toCharArray()){
            if(i == 'a' || i == 'e' || i == 'i' || i == 'o' ||i == 'u'){
                rfc.append(i);
                break;
            }
        }
        
        // Extrae la inicial del apellildo materno y lo agrega a RFC
        rfc.append(apeMa.charAt(0));
        // Extrae la inicial del nombre y lo agrega a RFC
        rfc.append(nom.charAt(0));
        // Extrae la fecha y la agrga al RFC
        // dd-mm-aaaa
        rfc.append(date.substring(6,8)
            + date.substring(2,4)
            + date.substring(0,2));
        
        return rfc.toString();
    } 

}