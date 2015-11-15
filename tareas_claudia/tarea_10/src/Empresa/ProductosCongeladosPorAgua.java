/**
 * Clase que hereda de ProductosCongelados y  nos servira para reutilizar codigo, en el constructor
 * usaremos la palabra super para indicar que estamos utilizando el constructor
 * de su padre.
 */
public class ProductosCongeladosPorAgua extends ProductosCongelados{

	private double informacionSalinidad;	

	public ProductosCongeladosPorAgua(double informacionSalinidad, int fechaCaducidad,
										int numeroDeLote, int fechaDeEnvasado,
										String paisDeOrigen, int temperaturaRecomendada){
		super(fechaCaducidad, numeroDeLote, fechaDeEnvasado, paisDeOrigen, temperaturaRecomendada);
		this.informacionSalinidad = informacionSalinidad;
	}

	@Override public String toString() {
		return "Fecha caducidad: " + getFechaCaducidad() +
				", numero de lote: " + getNumeroDeLote() +
				", fecha de envasado: " + getFechaDeEnvasado() +
				", pais de origen: " + getPaisDeOrigen() +
				", teperatura rcomendada: " + getTemperaturaRecomendada() +
				", informacion de salinidad: " + getInformacionSalinidad();
	}

	public double getInformacionSalinidad() {
		return informacionSalinidad;
	}

	public void setInformacionSalinidad(double informacionSalinidad) {
		this.informacionSalinidad = informacionSalinidad;
	}

}