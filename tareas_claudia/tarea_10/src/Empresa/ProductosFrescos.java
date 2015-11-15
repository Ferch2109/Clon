/**
 * Clase que hereda de Productos y  nos servira para reutilizar codigo, en el constructor
 * usaremos la palabra super para indicar que estamos utilizando el constructor
 * de su padre. Es ta clase no se hizo abstracta por que ya no tiene
 * un nivel mas profundo a diferencia de ProductosRefrigerados
 */
public class ProductosFrescos extends Productos {
	
	private int fechaEnvasado;
	private String paisDeOrigen;

	public ProductosFrescos(int fechaCaducidad, int numeroDeLote, int fechaEnvasado,
								String paisDeOrigen){
		super(fechaCaducidad, numeroDeLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisDeOrigen = paisDeOrigen;
	}

	@Override public String toString() {
		return "Fecha caducidad: " + getFechaCaducidad() +
				", numero de lote: " + getNumeroDeLote() +
				", fecha de envasado: "+ getFechaEnvasado() +
				", pais de origen: " + getPaisDeOrigen();
	}

	public int getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(int fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisDeOrigen() {
		return paisDeOrigen;
	}

	public void setPaisDeOrigen(String paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}
}