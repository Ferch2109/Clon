import java.util.Random;
public class GeneraArbol{

  public static void main( String args[] ) {
    Arbol arbol = new Arbol();
    int valor;
    Random numeroAleatorio = new Random();
    System.out.println( "Datos para que grafiques un arbol: " );
    // inserta 10 enteros aleatorios de 0 a 99 en arbol
    for ( int i = 1; i <= 15; i++ ) {
      valor = numeroAleatorio.nextInt( 100 );
      System.out.print( valor + " " );
    }
    System.out.println();
  }

}
