/**
 * <p>Tarea 12: Herencia, polimorfimo, asbtraccion y modelacion de objetos</p>
 *
 * Clase que muestra ejemplos de Polimorfismo y donde seran probadas las clases.
 *
 * @author Angel Ivan Gladin G
 * @version 1.0
 * @date 23-nov-15.
 */
public class Prueba {

    public static void main(String args[]){
        SeleccionDeFutbol futbolista = new Futbolista(101, 20, "Chicharito", "Hernandez", 666, 1);
        SeleccionDeFutbol entrenador = new Entrenador(67, 60, "Entrenador", "Buenazo", "1234567891111");
        SeleccionDeFutbol masajista = new Masajista(800, 23, "Masajista", "El buenazo", 10, 789789);

        System.out.println(futbolista);
        System.out.println(entrenador);
        System.out.println(masajista);
    }

}
