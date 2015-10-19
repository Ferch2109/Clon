/**
 * <p>Clase para listas doblemente ligadas de cadenas.</p>
 *
 * <p>Las listas nos permiten agregar elementos al inicio o final de la lista,
 * eliminar elementos de la lista, comprobar si un elemento está o no en la
 * lista, y otras operaciones básicas.</p>
 *
 * <p>Las listas tienen un iterador para poder recorrerlas.</p>
 *
 * @author Angel Ivan Gladin G
 * @author Eduardo Eder Vazquez Salcedo
 * @version 1.0
 * @date 02-ago-15.
 */
public class ListaCadena {

    /* Clase Nodo privada para uso interno de la clase ListaCadena. */
    private class Nodo {
        public String elemento;
        public Nodo anterior;
        public Nodo siguiente;

        public Nodo(String elemento) {
            this.elemento = elemento;
        }
    }

    /* Primer elemento de la lista. */
    private Nodo cabeza = null;
    /* Último elemento de la lista. */
    private Nodo rabo = null;
    /* Nodo iterador. */
    private Nodo iterador = this.cabeza;
    /* Número de elementos en la lista. */
    private int longitud = 0;

    /**
     * Regresa la longitud de la lista.
     * @return la longitud de la lista, el número de elementos que contiene.
     */
    public int getLongitud() {
        return this.longitud;
    }

    /**
     * Nos dice si la lista es vacía.
     * @return <code>true</code> si la lista es vacía, <code>false</code> en
     *         otro caso.
     */
    public boolean esVacia() {
        return this.longitud == 0;
    }

    /**
     * Agrega un elemento al final de la lista. Si la lista no tiene elementos,
     * el elemento a agregar será el primero y último. Después de llamar este
     * método, el iterador apunta a la cabeza de la lista.
     * @param elemento el elemento a agregar.
     */
    public void agregaFinal(String elemento) {
        Nodo rabo_anterior = null;
        if (this.longitud > 0){
            rabo_anterior = this.rabo;
        }

        this.rabo = new Nodo(elemento);
        this.rabo.siguiente = null;
        if (this.longitud < 1){
            this.cabeza = this.rabo;
            this.rabo.anterior = null;
        } else {
            this.rabo.anterior = rabo_anterior;
            rabo_anterior.siguiente = this.rabo;
        }
        this.iterador = this.cabeza;
        this.longitud += 1;
    }

    /**
     * Agrega un elemento al inicio de la lista. Si la lista no tiene elementos,
     * el elemento a agregar será el primero y último. Después de llamar este
     * método, el iterador apunta a la cabeza de la lista.
     * @param elemento el elemento a agregar.
     */
    public void agregaInicio(String elemento) {
        Nodo cabeza_anterior = null;
        if (this.longitud > 0){
            cabeza_anterior = this.cabeza;
        }

        this.cabeza = new Nodo(elemento);
        this.cabeza.anterior = null;
        if (this.longitud < 1){
            this.rabo = this.cabeza;
            this.cabeza.siguiente = null;
        } else {
            this.cabeza.siguiente = cabeza_anterior;
            cabeza_anterior.anterior = this.cabeza;
        }
        this.iterador = this.cabeza;
        this.longitud += 1;
    }

    /**
     * Elimina un elemento de la lista. Si el elemento no está contenido en la
     * lista, el método no la modifica. Si un elemento de la lista es
     * modificado, el iterador se mueve al primer elemento.
     * @param elemento el elemento a eliminar.
     */
    public void elimina(String elemento) {
        this.primero();
        while (this.iteradorValido()) {
            if(this.iterador.elemento.equals(elemento))
            {
                if(this.longitud == 1){
                    this.cabeza = null;
                    this.rabo = null;
                } else if (this.iterador.equals(this.cabeza)) {
                    this.cabeza = this.cabeza.siguiente;
                    this.cabeza.anterior = null;
                } else if (this.iterador.equals(this.rabo)){
                    this.rabo = this.rabo.anterior;
                    this.rabo.siguiente = null;
                } else {
                    Nodo siguiente = this.iterador.siguiente;
                    this.iterador = this.iterador.anterior;
                    siguiente.anterior = this.iterador;
                    this.iterador.siguiente = siguiente;
                }
                this.longitud -= 1;
                break;
            }
            this.iterador = this.iterador.siguiente;
        }
        this.primero();
    }

    /**
     * Elimina el primer elemento de la lista y lo regresa.
     * @return el primer elemento de la lista antes de eliminarlo, o
     *         <code>null</code> si la lista está vacía.
     */
    public String eliminaPrimero() {
        if (this.cabeza != null) {
            Nodo anterior = this.cabeza;
            this.cabeza = this.cabeza.siguiente;   
            this.cabeza.anterior = null;
            this.longitud -= 1;
            return anterior.elemento;
        }
        return null;
    }

    /**
     * Elimina el último elemento de la lista y lo regresa.
     * @return el último elemento de la lista antes de eliminarlo, o
     *         <code>null</code> si la lista está vacía.
     */
    public String eliminaUltimo() {
        // Aquí va su código.
        if (this.rabo != null) {
            Nodo anterior = this.rabo;
            this.rabo = this.rabo.anterior;   
            this.rabo.siguiente = null;
            this.longitud -= 1;
            return anterior.elemento;
        }
        return null;
    }

    /**
     * Nos dice si un elemento está en la lista. El iterador no se mueve.
     * @param elemento el elemento que queremos saber si está en la lista.
     * @return <tt>true</tt> si <tt>elemento</tt> está en la lista,
     *         <tt>false</tt> en otro caso.
     */
    public boolean contiene(String elemento) {
        this.primero();
        while (this.iteradorValido()) {
            if (this.iterador.elemento.equals(elemento)) {
                return true; 
            }
            this.iterador = this.iterador.siguiente;
        }
        this.primero();
        return false;
    }

    /**
     * Regresa la reversa de la lista.
     * @return una nueva lista que es la reversa la que manda llamar el método.
     */
    public ListaCadena reversa() {
        ListaCadena reversa = new ListaCadena();
        this.ultimo();
        while (this.iteradorValido()) {
            reversa.agregaFinal(this.iterador.elemento);
            this.iterador = this.iterador.anterior;
        }
        this.primero();
        return reversa;
    }

    /**
     * Regresa una copia de la lista. La copia tiene los mismos elementos que la
     * lista que manda llamar el método, en el mismo orden.
     * @return una copiad de la lista.
     */
    public ListaCadena copia() {
        ListaCadena copia = new ListaCadena();
        this.primero();
        while (this.iteradorValido()) {
            copia.agregaFinal(this.iterador.elemento);
            this.iterador = this.iterador.siguiente;
        }
        this.primero();
        return copia;
    }

    /**
     * Limpia la lista de elementos. El llamar este método es equivalente a
     * eliminar todos los elementos de la lista.
     */
    public void limpia() {
        this.primero();
        while (this.iteradorValido()) {
            if(this.longitud == 1){
                this.cabeza = null;
                this.rabo = null;
                this.longitud = 0;
                break;
            } else {
                Nodo anterior = this.cabeza;
                this.cabeza = this.cabeza.siguiente;   
                this.cabeza.anterior = null;
                this.primero();
                this.longitud -= 1;
            }
        }
    }

    /**
     * Regresa el primer elemento de la lista.
     * @return el primer elemento de la lista, o <code>null</code> si la lista
     *         es vacía.
     */
    public String getPrimero() {
        if (this.longitud == 0) {
            return null;
        }
        return this.cabeza.elemento;
    }

    /**
     * Regresa el último elemento de la lista.
     * @return el primer elemento de la lista, o <code>null</code> si la lista
     *         es vacía.
     */
    public String getUltimo() {
        if (this.longitud == 0) {
            return null;
        }
        return this.rabo.elemento;
    }

    /**
     * Regresa el <em>i</em>-ésimo elemento de la lista. Si el índice es menor
     * que cero o mayor o igual que el número de elementos de la lista, el
     * método regresa <tt>null</tt>.
     * @param i el índice del elemento que queremos.
     * @return el <em>i</em>-ésimo elemento de la lista, si <em>i</em> es mayor
     *         o igual que cero y menor que el número de elementos en la lista;
     *         <tt>null</tt> en otro caso.
     */
    public String get(int i) {
        this.primero();
        int x = 0;
        while (this.iteradorValido() && x < i) {
            this.siguiente();
            x += 1;
        }
        if (x == i && this.iteradorValido()){
            return this.iterador.elemento;
        }
        return null;

    }

    /**
     * Regresa el índice del elemento recibido en la lista.
     * @param elemento el elemento del que se busca el índice.
     * @return el índice del elemento recibido en la lista, o -1 si el elemento
     *         no está contenido en la lista.
     */
    public int indiceDe(String elemento) {
        this.primero();
        int i = 0;
        while (this.iteradorValido()) {
            if (this.iterador.elemento.equals(elemento)) {
                return i; 
            }
            this.iterador = this.iterador.siguiente;
            i += 1;
        }
        this.primero();
        return -1;
    }

    /**
     * Regresa una representación en cadena de la lista.
     * @return una representación en cadena de la lista.
     */
    public String toString() {
        // Aquí va su código.
        String cadena = "";
        this.primero();
        while (this.iteradorValido()) {
            cadena += this.get() + " ";
            this.siguiente();
        }
        return cadena;
    }

    /**
     * Mueve el iterador de la lista a su primer elemento.
     */
    public void primero() {
        this.iterador = this.cabeza;
    }

    /**
     * Mueve el iterador de la lista a su último elemento.
     */
    public void ultimo() {
        this.iterador = this.rabo;
    }

    /**
     * Mueve el iterador al siguiente elemento.
     */
    public void siguiente() {
        this.iterador = this.iterador.siguiente;
    }

    /**
     * Mueve el iterador al elemento anterior.
     */
    public void anterior() {
        this.iterador = this.iterador.anterior;
    }

    /**
     * Regresa el elemento al que el iterador apunta.
     * @return el elemento al que el iterador apunta, o <tt>null</tt> si el
     *         iterador es inválido.
     */
    public String get() {
        return this.iterador.elemento;
    }

    /**
     * Nos dice si el iterador es válido.
     * @return <tt>true</tt> si el iterador es válido; <tt>false</tt> en otro
     *         caso.
     */
    public boolean iteradorValido() {
        // Aquí va su código.
        return this.iterador != null;
    }
}
