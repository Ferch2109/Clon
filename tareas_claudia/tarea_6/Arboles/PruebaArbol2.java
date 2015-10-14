import java.util.Random;
import java.util.Scanner;
public class PruebaArbol2 {

  /*
  *IMPLEMENTAR
  *Genera una prueba del programa dentro del método main en la cuál el usuario
  *ingrese el número de nodos y el valor de cada nodo. Tiene que ser robusto,
  * es decir, a prueba de cualquier caracter que no sea un número entero.
  *Con los datos dado por el usuario genera un nuevo árbol y muestra
  *sus tres recorridos(inorden, postorden, preorden).
  */

  public static void main( String args[] ) {
    Scanner in = new Scanner(System.in);
    Arbol arbol = new Arbol();
    
    System.out.println("Inserta numero de nodos");
    int noNodos= in.nextInt();

    for (int i = 0; i<noNodos; i++) {
      System.out.print("Inserta valor " + (i+1) + " ");
      arbol.insertarNodo(in.nextInt());
    }

    System.out.println("Recorrido Preorden");
    arbol.recorridoPreorden();
    System.out.println("\nRecorrido Inorden");
    arbol.recorridoInorden();
    System.out.println("\nRecorrido Postorden");
    arbol.recorridoPostorden();
  }
}
