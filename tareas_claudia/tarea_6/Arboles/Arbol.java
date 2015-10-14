public class Arbol {
  private NodoArbol raiz;

  /*
  *Constructor que genera un arbol vacío.
  */
  public Arbol()
  {
    raiz = null;
  }

  /*
  *Insertar un nodo en el árbol.
  */
  public void insertarNodo( int valorInsertar ) {
    if ( raiz == null )
      raiz = new NodoArbol( valorInsertar );
    else
      raiz.insertar( valorInsertar );
  }


  /*
  *IMPLEMENTAR
  *Método que genera el recorrido preorden del árbol.
  */
  public void recorridoPreorden() {
    auxPreOrden(raiz);
  }

  private void auxPreOrden(NodoArbol aux){
    if(aux == null)
      return;
    System.out.print(aux.datos+ " , ");
    auxPreOrden(aux.nodoIzq);
    auxPreOrden(aux.nodoDer);
  }

  /*
  *IMPLEMENTAR
  *Método que genera el recorrido Inorden del árbol.
  */

  public void recorridoInorden(){
    auxPreInorden(raiz);
  }

  private void auxPreInorden(NodoArbol aux){
    if (aux == null) {
      return;
    }
    auxPreInorden(aux.nodoIzq);
    System.out.print(aux.datos+" , " );
    auxPreInorden(aux.nodoDer);    
  }

  /*
  *IMPLEMENTAR.
  *Método que genera el recorrido postorden del árbol.
  */
  public void recorridoPostorden(){
    auxPostOrden(raiz);
  }

  public void auxPostOrden(NodoArbol aux){
    if (aux == null) {
      return;
    }
    auxPostOrden(aux.nodoIzq);
    auxPostOrden(aux.nodoDer);
    System.out.print(aux.datos+" , ");
  }

}
