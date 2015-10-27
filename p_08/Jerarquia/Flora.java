public abstract class Flora extends Vida{

	protected String reino;
	protected String nombreCientifico;
	protected String familia;

	public Flora(int diasDeVivo, String reino, String familia){
		super(diasDeVivo);
		this.reino = reino;
		this.nombreCientifico = nombreCientifico;
		this.familia = familia;
	}

	public abstract String formaDeAlimentarse();

	public abstract String colorDePetalos();

	public abstract String formaDeFlor();

}