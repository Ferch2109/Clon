import java.util.Scanner;
/**
 * Programa para tener sesiones con un psicologo
 * @author Angel Gladin
 * @version 1.0
 * 
 * ICC
 */

public class Psicologo {
    public static void main(String [] pps) {

    //Dar bienvenida al paciente y solicitar su nombre
    //Decir buenas tardes y preguntar por el problema
    //Decir ¿Por qué crees que tu problema sea:  problema?
    //Leer respuesta y decir Interesante...	

        System.out.println("Bienvenido, ¿Cual es tu nombre?");
        Scanner in = new Scanner(System.in);
        String nom = in.nextLine();

        System.out.println("Buenas tardes "+ nom +
            " ¿Cual es tu problema?");
        String prob = in.nextLine();

        System.out.println("¿Por que crees que tu problema sea : "
            + prob + "?");
        String desc = in.nextLine();
        
        System.out.println("Interesante, hablaremos de ello la siguiente sesion");
    }
}