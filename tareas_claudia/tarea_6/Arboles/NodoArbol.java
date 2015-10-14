public class NodoArbol {

    NodoArbol nodoIzq;
    int datos;
    NodoArbol nodoDer;

    /*
     * Constructor que inicializa los datos y hace de este nodo un nodo raíz.
     *@params datosNodo: Valor del nodo.
     *@return: void
    */
    public NodoArbol( int datosNodo )
    {
    datos = datosNodo;
    nodoIzq = nodoDer = null; // el nodo no tiene hijos
    }

    /*
     *Localiza el punto de inserción e inserta un nuevo nodo,
     *ignora los valores duplicados
     *@param valorInsertar valor del nuevo nodo
    */
    public void insertar( int valorInsertar ) {
      //inserta en el subárbol izquierdo pues es menor que el valor del nodo.
      if ( valorInsertar < datos ) {
        if ( nodoIzq == null )
            nodoIzq = new NodoArbol( valorInsertar );
        else
            nodoIzq.insertar( valorInsertar );
      }

      //Insertar en el subárbol derecho pues es mayor que el valor del nodo.
      else if ( valorInsertar > datos ) {
      if ( nodoDer == null )
          nodoDer = new NodoArbol( valorInsertar );
      else // continúa recorriendo el subárbol derecho
          nodoDer.insertar( valorInsertar );
      }
  }
}
