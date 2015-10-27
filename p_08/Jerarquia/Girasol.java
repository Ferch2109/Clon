public class Girasol extends Flora{

	String nombre;
	String nombreCientifico;

	public Girasol(String nombre, String nombreCientifico, int diasDeVivo, String reino, String familia){
		super(diasDeVivo, reino, familia);
		this.nombre = nombre;
		this.nombreCientifico = nombreCientifico;
	}

	@Override public int diasDeVivo(){
		return diasDeVivo;
	}

	@Override public String tipoDeVida(){
		return "vive por el sol";
	}

	@Override public String formaDeAlimentarse(){
		return "autotrofo";
	}

	@Override public String colorDePetalos(){
		return "Blancos";
	}

	@Override public String formaDeFlor(){
		return "Flor blanca con centro amarillo";
	}

	@Override public String toString(){
		return nombre + ", su nombre cientifico es " + nombreCientifico +
			"tiene dias de vivo " + diasDeVivo() + ", su tipo de vida es " + tipoDeVida() + 
			", su forma de alimentarse es " + formaDeAlimentarse() + ", su color de petalos es " + 
			colorDePetalos() + ", y la forma de la flor es" + formaDeFlor() + "\n";
	} 
}