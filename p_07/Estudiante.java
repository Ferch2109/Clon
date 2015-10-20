
/**
* Objecto Estudiante que nos servira para modelarlo despues en una lista.
* @author Angel Ivan Gladin G
* @version 1.0
* @date 18-ago-15.
*/
public class Estudiante{
	
	String nombre;
	int nCuenta;

	public Estudiante(String nombre, int nCuenta){
		this.nombre = nombre;
		this.nCuenta = nCuenta;
	}
	/**
	* Sobreescribir el metodo toSTring en orden de tener los atributos y nos devuelva un STring con los datos
	*/
	@Override public String toString(){
		return nombre + " " + nCuenta + "\n";
	}
	
	@Override public boolean equals(Object o) {
    if(o instanceof Estudiante && (((Estudiante) o).nombre == this.nombre) &&
    	(((Estudiante) o).nCuenta == this.nCuenta) ){
        return true;    
    }
    return false;
	}
	
}