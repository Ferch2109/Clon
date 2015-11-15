/**
 * Clase abstracta padre que sera usada para que hereden de ella.
 * Es abstracta por que solamente decimos "Productos" y ya cuando heredemos
 * de ella diremos mejor que producto es.
 */
public abstract class Productos{

	private int fechaCaducidad;
	private int numeroDeLote;

	public Productos(int fechaCaducidad, int numeroDeLote){
		this.fechaCaducidad = fechaCaducidad;
		this.numeroDeLote = numeroDeLote;
	}

	public int getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(int fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumeroDeLote() {
		return numeroDeLote;
	}

	public void setNumeroDeLote(int numeroDeLote) {
		this.numeroDeLote = numeroDeLote;
	}
}