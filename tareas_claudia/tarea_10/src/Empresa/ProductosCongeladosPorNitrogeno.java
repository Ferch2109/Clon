/**
 * Clase que hereda de ProductosCongelados y  nos servira para reutilizar codigo, en el constructor
 * usaremos la palabra super para indicar que estamos utilizando el constructor
 * de su padre.
 */
public class ProductosCongeladosPorNitrogeno extends ProductosCongelados {

	private String metodoCongelacion;
	private double tiempoExposicion;

	public ProductosCongeladosPorNitrogeno(String metodoCongelacion, double tiempoExposicion,
											 int fechaCaducidad, int numeroDeLote, int fechaDeEnvasado,
										String paisDeOrigen, int temperaturaRecomendada){
		super(fechaCaducidad, numeroDeLote, fechaDeEnvasado, paisDeOrigen, temperaturaRecomendada);
		this.metodoCongelacion = metodoCongelacion;
		this.metodoCongelacion = metodoCongelacion;
	}

	@Override public String toString() {
		return "Fecha caducidad: " + getFechaCaducidad() +
				", numero de lote: " + getNumeroDeLote() +
				", fecha de envasado: " + getFechaDeEnvasado() +
				", pais de origen: " + getPaisDeOrigen() +
				", teperatura rcomendada: " + getTemperaturaRecomendada() +
				", metodo de Congelacion: " + getMetodoCongelacion() +
				", tiempo de Exposicion" + getTiempoExposicion();
	}

	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}

	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}

	public double getTiempoExposicion() {
		return tiempoExposicion;
	}

	public void setTiempoExposicion(double tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}

}