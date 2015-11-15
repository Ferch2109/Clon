/**
 * Clase que hereda de ProductosCongelados y  nos servira para reutilizar codigo, en el constructor
 * usaremos la palabra super para indicar que estamos utilizando el constructor
 * de su padre.
 */
public class ProductosCongeladosPorAire extends ProductosCongelados{
	
	/**
	 * Un arreglo que en cada posicion trae diferente informacion.
	 * En [0] es el % de nitogeno.
	 * En [1] es el % de oxigeno.
	 * En [2] es el % de dioxido de carbono.
	 * En [3] es el % de vapor de agua.
	 */
	private String[] informacionComposicion = new String[4];

	public ProductosCongeladosPorAire(String[] informacionComposicion, int fechaCaducidad,
										int numeroDeLote, int fechaDeEnvasado,
										String paisDeOrigen, int temperaturaRecomendada){
		super(fechaCaducidad, numeroDeLote, fechaDeEnvasado, paisDeOrigen, temperaturaRecomendada);
		this.informacionComposicion = informacionComposicion;
	}

	@Override public String toString() {
		return "Fecha caducidad: " + getFechaCaducidad() +
				", numero de lote: " + getNumeroDeLote() +
				", fecha de envasado: " + getFechaDeEnvasado() +
				", pais de origen: " + getPaisDeOrigen() +
				", teperatura rcomendada: " + getTemperaturaRecomendada() +
				", informacion composicion: " + getInformacionComposicion();
	}

	public String getInformacionComposicion() {
		return "Nitrogeno: " + informacionComposicion[0] +
				"Oxigeno: " + informacionComposicion[1] +
				"Dioxido de carbono: " + informacionComposicion[2] +
				"Vapor de aguar: " + informacionComposicion[3];
	}

	public void setInformacionComposicion(String[] informacionComposicion) {
		this.informacionComposicion = informacionComposicion;
	}
}