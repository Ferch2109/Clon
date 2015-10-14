import java.util.Random;
public class PruebaArbol {

  /*
  *Probaré su implementación desde este método main generando 10 números
  *aleatorios, insertando y después generar los recorridos.
  *En los métodos recorridoInorden, recorridoPreorden y recorridoPostorden
  *se debe imprimir el recorrido.
  */
  public static void main( String args[] ) {
    Arbol arbol = new Arbol();
    int valor;
    Random numeroAleatorio = new Random();
    System.out.println( "Insertando los siguientes valores: " );
    // inserta 10 enteros aleatorios de 0 a 99 en arbol
    for ( int i = 1; i <= 10; i++ ) {
      valor = numeroAleatorio.nextInt( 100 );
      System.out.print( valor + " " );
      arbol.insertarNodo( valor );
    }

    System.out.println ( "\n\nRecorrido preorden" );
    arbol.recorridoPreorden();
    System.out.println ( "\n\nRecorrido inorden" );
    arbol.recorridoInorden();
    System.out.println ( "\n\nRecorrido postorden" );
    arbol.recorridoPostorden();
    System.out.println();
  }
}
