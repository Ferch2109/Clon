package mx.unam.ciencias.icc;

import java.util.NoSuchElementException;

/**
 * <p>Clase genérica para listas doblemente ligadas.</p>
 *
 * <p>Las listas nos permiten agregar elementos al inicio o final de la lista,
 * eliminar elementos de la lista, comprobar si un elemento está o no en la
 * lista, y otras operaciones básicas.</p>
 *
 * <p>Las listas tienen un iterador para poder recorrerlas, y no aceptan a
 * <code>null</code> como elemento.</p>
 */
public class Lista<T> {

    /* Clase Nodo privada para uso interno de la clase Lista. */
    private class Nodo {
        public T elemento;
        public Nodo anterior;
        public Nodo siguiente;

        public Nodo(T elemento) {
			this.elemento = elemento;
            // Aquí va su código.
        }
    }

    /* Primer elemento de la lista. */
    private Nodo cabeza;
    /* Último elemento de la lista. */
    private Nodo rabo;
    /* Nodo iterador. */
    private Nodo iterador;
    /* Número de elementos en la lista. */
    private int longitud;

	/**
     * Busca si existe un nodo con el parametro de entrada de tipo cadena.
     * Regresa el nodo que contiene el elemento.
     * @return el nodo en caso de que exista y <code>null</code> en caso de que no.
     */
    private Nodo buscaCadena( T elemento , Nodo n ){
		if( n == null )
			return null;
		if( n.elemento.equals( elemento ) )
			return n;
		return buscaCadena( elemento , n.siguiente );
	}
	
	/**
	 * Elimina todos los nodos con elementos coincidentes al que se recibe como parametro.
	 * @param el elemento a eliminar y el nodo en el que se busca.
	 */
	private void elimina( T elemento , Nodo n ){
		if( n != null ){
			if( n.elemento.equals( elemento ) ){
				if( n.anterior == null )
					eliminaPrimero();
				else if( n.siguiente == null )
					eliminaUltimo();
				else{
					n.siguiente.anterior = n.anterior;
					n.anterior.siguiente = n.siguiente;
					longitud--;
				}
				iterador = cabeza;
			}
			elimina( elemento , n.siguiente );
		}
	}
	
	/**
	 * Regresa una nueva lista, en caso de que la direccion sea 1 la lista sera una copia
	 * en caso de que la direccion sea 0 la lista sera una copia invertida.
	 * @param Referencia a la nueva lista, nodo que contiene el elemento a agregar y direccion de la copia.
	 * @return nueva lista
	 */
	private Lista<T> nuevaLista( Lista<T> l , Nodo n , int direccion ){
		if( n == null )
			return l;
		l.agregaFinal( n.elemento );
		return nuevaLista( l , ( ( direccion == 1 ) ? n.siguiente : n.anterior ) , direccion );
	}
	
	/**
	 * Obtiene el indice del nodo que contiene al elemento.
	 * @param elemento el elemento del nodo del que se busca su indice,
	 * nodo del que se comparara su elemento con el elemento parametro,
	 * indice el contador de la posicion del nodo contenedor del elemento parametro.
	 * @return indice del nodo que contiene el elemento parametro.
	 */
	private int indiceDe( T elemento , Nodo n , int indice ){
		if( contiene( elemento ) )
			if( !n.elemento.equals( elemento ) ){
				indice++;
				return indiceDe( elemento , n.siguiente , indice );
			}
			else
				return indice;
		return -1;
	}
	
	/**
	 * Regresa el elemento del nodo que esta en la posicion del indice i.
	 * @param i, donde i es el indice del nodo que contiene el elemento a regresar
	 * y n que es la referencia que apunta al objeto de tipo Nodo que se evalua.
	 * @return el elemento del Nodo en la posicion indice i.
	 * @throws ExcepcionIndiceInvalido si <em>i</em> es menor que cero o mayor o
     *         igual que el número de elementos en la lista.
	 */
	private T get( int i , Nodo n ){
		if( i < 0 || i >= longitud )
			throw new ExcepcionIndiceInvalido();
		if( i == 0 )
			return n.elemento;
		return get( i-1 , n.siguiente );
	}
	
	/**
     * Regresa una representación en cadena de la lista.
     * @return una representación en cadena de la lista.
     */
    private String toString( String lista , Nodo n ){
		if( n == null )
			return lista+= String.format( "]" );
		if( n != rabo ){
			lista += String.format( "%s, " , n.elemento );
			return toString( lista , n.siguiente );
		}
		return lista+= String.format( "%s]" , n.elemento );
	}
	
    /**
     * Regresa la longitud de la lista.
     * @return la longitud de la lista, el número de elementos que contiene.
     */
    public int getLongitud() {
		return longitud;
        // Aquí va su código.
    }

    /**
     * Nos dice si la lista es vacía.
     * @return <code>true</code> si la lista es vacía, <code>false</code> en
     *         otro caso.
     */
    public boolean esVacia() {
		return longitud == 0;
        // Aquí va su código.
    }

    /**
     * Agrega un elemento al final de la lista. Si la lista no tiene elementos,
     * el elemento a agregar será el primero y último. Después de llamar este
     * método, el iterador apunta a la cabeza de la lista.
     * @param elemento el elemento a agregar.
     * @throws IllegalArgumentException si <code>elemento</code> es
     *         <code>null</code>.
     */
    public void agregaFinal(T elemento) {
		if( elemento == null ) 
			throw new IllegalArgumentException();
		Nodo ultimo = new Nodo( elemento );
		if( longitud == 0 )
			cabeza = rabo = ultimo;
		else{
			ultimo.anterior = rabo;
			rabo.siguiente = ultimo;
			rabo = ultimo;
		}
		longitud++;
		iterador = cabeza;
        // Aquí va su código.
    }

    /**
     * Agrega un elemento al inicio de la lista. Si la lista no tiene elementos,
     * el elemento a agregar será el primero y último. Después de llamar este
     * método, el iterador apunta a la cabeza de la lista.
     * @param elemento el elemento a agregar.
     * @throws IllegalArgumentException si <code>elemento</code> es
     *         <code>null</code>.
     */
    public void agregaInicio(T elemento) {
		if( elemento != null ){
			Nodo primero = new Nodo( elemento );
			if( longitud == 0 )
				cabeza = rabo = primero;
			else{
				cabeza.anterior = primero;
				primero.siguiente = cabeza;
				cabeza = primero;
			}
			longitud++;
			iterador = cabeza;
		}
		else
			throw new IllegalArgumentException();
        // Aquí va su código.
    }

    /**
     * Elimina un elemento de la lista. Si el elemento no está contenido en la
     * lista, el método no la modifica. Si un elemento de la lista es
     * modificado, el iterador se mueve al primer elemento.
     * @param elemento el elemento a eliminar.
     */
    public void elimina(T elemento) {
		elimina( elemento , cabeza );
        // Aquí va su código.
    }

    /**
     * Elimina el primer elemento de la lista y lo regresa.
     * @return el primer elemento de la lista antes de eliminarlo.
     * @throws NoSuchElementException si la lista es vacía.
     */
    public T eliminaPrimero() {
		if( cabeza != null ){
			T e = cabeza.elemento;
			if( cabeza != rabo ){
				cabeza = cabeza.siguiente;
				cabeza.anterior = null;
			}
			else
				cabeza = rabo = null;
			longitud--;
			return e;
		}
		else
			throw new NoSuchElementException();
        // Aquí va su código.
    }

    /**
     * Elimina el último elemento de la lista y lo regresa.
     * @return el último elemento de la lista antes de eliminarlo.
     * @throws NoSuchElementException si la lista es vacía.
     */
    public T eliminaUltimo() {
		if( rabo != null ){
			T e = rabo.elemento;
			if( rabo.equals(cabeza) )
				rabo = cabeza = null;
			else{
				rabo = rabo.anterior;
				rabo.siguiente = null;
			}
			longitud--;
			return e;
		}
		else
			throw new NoSuchElementException();
        // Aquí va su código.
    }

    /**
     * Nos dice si un elemento está en la lista. El iterador no se mueve.
     * @param elemento el elemento que queremos saber si está en la lista.
     * @return <tt>true</tt> si <tt>elemento</tt> está en la lista,
     *         <tt>false</tt> en otro caso.
     */
    public boolean contiene(T elemento) {
		return buscaCadena( elemento , cabeza ) != null;
        // Aquí va su código.
    }

    /**
     * Regresa la reversa de la lista.
     * @return una nueva lista que es la reversa la que manda llamar el método.
     */
    public Lista<T> reversa() {
		Lista<T> l = new Lista<T>();
		return nuevaLista( l , rabo , 0 );
        // Aquí va su código.
    }

    /**
     * Regresa una copia de la lista. La copia tiene los mismos elementos que la
     * lista que manda llamar el método, en el mismo orden.
     * @return una copiad de la lista.
     */
    public Lista<T> copia() {
		Lista<T> l = new Lista<T>();
		return nuevaLista( l , cabeza , 1 );
        // Aquí va su código.
    }

    /**
     * Limpia la lista de elementos. El llamar este método es equivalente a
     * eliminar todos los elementos de la lista.
     */
    public void limpia() {
		cabeza = rabo = null;
		longitud = 0;
        // Aquí va su código.
    }

    /**
     * Regresa el primer elemento de la lista.
     * @return el primer elemento de la lista.
     * @throws NoSuchElementException si la lista es vacía.
     */
    public T getPrimero() {
		if( cabeza != null )
			return cabeza.elemento;
		throw new NoSuchElementException();
        // Aquí va su código.
    }

    /**
     * Regresa el último elemento de la lista.
     * @return el primer elemento de la lista.
     * @throws NoSuchElementException si la lista es vacía.
     */
    public T getUltimo() {
		if( rabo != null )
			return rabo.elemento;
		throw new NoSuchElementException();
        // Aquí va su código.
    }

    /**
     * Regresa el <em>i</em>-ésimo elemento de la lista.
     * @param i el índice del elemento que queremos.
     * @return el <em>i</em>-ésimo elemento de la lista.
     * @throws ExcepcionIndiceInvalido si <em>i</em> es menor que cero o mayor o
     *         igual que el número de elementos en la lista.
     */
    public T get(int i) {
		return get( i , cabeza );
        // Aquí va su código.
    }

    /**
     * Regresa el índice del elemento recibido en la lista.
     * @param elemento el elemento del que se busca el índice.
     * @return el índice del elemento recibido en la lista, o -1 si
     *         el elemento no está contenido en la lista.
     */
    public int indiceDe(T elemento) {
		return indiceDe( elemento , cabeza , 0 );
        // Aquí va su código.
    }

    /**
     * Regresa una representación en cadena de la lista.
     * @return una representación en cadena de la lista.
     */
    @Override public String toString() {
		return toString( "[" , cabeza );
        // Aquí va su código.
    }

    /**
     * Mueve el iterador de la lista a su primer elemento.
     */
    public void primero() {
		iterador = cabeza;
        // Aquí va su código.
    }

    /**
     * Mueve el iterador de la lista a su último elemento.
     */
    public void ultimo() {
		iterador = rabo;
        // Aquí va su código.
    }

    /**
     * Mueve el iterador al siguiente elemento.
     */
    public void siguiente() {
		if( iterador == null )
			throw new NoSuchElementException();
		iterador = iterador.siguiente;
        // Aquí va su código.
    }

    /**
     * Mueve el iterador al elemento anterior.
     */
    public void anterior() {
		if( iterador == null )
			throw new NoSuchElementException();
		iterador = iterador.anterior;
        // Aquí va su código.
    }

    /**
     * Regresa el elemento al que el iterador apunta.
     * @return el elemento al que el iterador apunta.
     * @throws NoSuchElementException si el iterador es inválido.
     */
    public T get() {
		if( iterador == null )
			throw new NoSuchElementException();
		return iterador.elemento;
        // Aquí va su código.
    }

    /**
     * Nos dice si el iterador es válido.
     * @return <tt>true</tt> si el iterador es válido; <tt>false</tt> en otro
     *         caso.
     */
    public boolean iteradorValido() {
		return iterador != null;
        // Aquí va su código.
    }

    /**
     * Nos dice si la lista es igual al objeto recibido.
     * @param o el objeto con el que hay que comparar.
     * @return <tt>true</tt> si la lista es igual al objeto recibido;
     *         <tt>false</tt> en otro caso.
     */
    @Override public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof Lista))
            return false;
        @SuppressWarnings("unchecked") Lista<T> lista = (Lista<T>)o;
        
		if( lista.longitud != longitud )
			return false;
		Nodo n = cabeza;
		Nodo n2 = lista.cabeza;
		while( n != null ){
			if( !n.elemento.equals( n2.elemento ) )
				return false;
			n = n.siguiente;
			n2 = n2.siguiente;
		}
		return true;
        // Aquí va su código.
    }
}
