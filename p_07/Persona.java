/**
* Objecto Persona que nos servira para modelarlo despues en una lista.
* @author Angel Ivan Gladin G
* @version 1.0
* @date 18-ago-15.
*/
public class Persona{
	
	String nombre;

	public Persona(String nombre){
		this.nombre = nombre;
	}
	
	/**
	* Sobreescribir el metodo toSTring en orden de tener los atributos y nos devuelva un STring con los datos
	*/
	@Override public String toString(){
		return nombre + "\n";
	}

	@Override public boolean equals(Object o) {
    if(o instanceof Persona && (((Persona) o).nombre == this.nombre) ){
        return true;    
    }
    return false;
	}

}