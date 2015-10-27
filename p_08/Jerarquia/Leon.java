public class Leon extends Fauna{

	private String nombre;
	private String nombreCientifico;

	public Leon(String nombre, String nombreCientifico,int diasDeVivo, String reino,
		String filo, String clase){
		super(diasDeVivo, reino, filo, clase);
		this.nombre = nombre;
		this.nombreCientifico = nombreCientifico;
	}

	@Override public int diasDeVivo(){
		return diasDeVivo;
	}

	@Override public String formaDeCaminar(){
		return "Como el rey de la manada";
	}

	@Override public String comer(){
		return "Come a todos los animales en Africa";
	} 

	@Override public String ritualDeApareamiento(){
		return "El es el dominante";
	}

	@Override public String tipoDeVida(){
		return " muy buena";
	}

	@Override public String toString(){
		return nombre + ", su nombre cientifico es " + nombreCientifico +
			"tiene dias de vivo " + diasDeVivo() + ", su forma de caminar es" + formaDeCaminar() + 
			", come de esta manera" + comer() + ", su ritual de apareamiento es " + 
			ritualDeApareamiento() + ", y su tipo de vida es " + tipoDeVida() + "\n";
	}
}