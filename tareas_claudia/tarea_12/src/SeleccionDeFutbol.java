public abstract class SeleccionDeFutbol{

	private int numID;
	private int edad;
	private String nombre;
	private String apellido;
	
	public SeleccionDeFutbol(int numID, int edad, String nombre, String apellido){
		this.numID = numID;
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public abstract String viajar();

	public abstract String concentrarse();

	public abstract String presentesEnPartido();

	public int getNumID() {
		return numID;
	}

	public void setNumID(int numID) {
		this.numID = numID;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}