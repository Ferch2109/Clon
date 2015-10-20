/**
* Objecto Animal que nos servira para modelarlo despues en una lista.
* @author Angel Ivan Gladin G
* @version 1.0
* @date 18-ago-15.
*/
public class Animal{
	
	String nombre;
	String tipo;
	String movilidad;
	String habitat;
	String alimentacion;

	public Animal(String nombre, String tipo, String movilidad, String habitat, String alimentacion){
		this.nombre = nombre;
		this.tipo = tipo;
		this.movilidad = movilidad;
		this.habitat = habitat;
		this.alimentacion = alimentacion;
	}

	@Override public String toString(){
		return nombre + " " + tipo + " " + movilidad + " " + habitat 
			+ " " + " " + alimentacion + "\n";
	}

    @Override public boolean equals(Object o) {
    // Aquí va su código.
    if(o instanceof Animal && (((Animal) o).nombre == this.nombre) &&
    	(((Animal) o).tipo == this.tipo) && (((Animal) o).movilidad == this.movilidad)
		&& (((Animal) o).habitat == this.habitat)){
        return true;    
    }
    return false;
}

	
}