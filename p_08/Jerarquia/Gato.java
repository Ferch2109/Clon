public class Gato extends Fauna{
	
	String nombre;
	String nombreCientifico;
	
	public Gato(String nombre, String nombreCientifico,int diasDeVivo, String reino,
		String filo, String clase){
		super(diasDeVivo, reino, filo, clase);
		this.nombre = nombre;
		this.nombreCientifico = nombreCientifico;
	}
	
	@Override public int diasDeVivo(){
		return diasDeVivo;
	}

	@Override public String formaDeCaminar(){
		return "En cuatro patas y con la cola enrollada";
	}

	@Override public String comer(){
		return "Comen ratones";
	} 

	@Override public String ritualDeApareamiento(){
		return "Llama al macho";
	}

	@Override public String tipoDeVida(){
		return "7 vidas";
	}

	@Override public String toString(){
		return nombre + ", su nombre cientifico es " + nombreCientifico +
			"tiene dias de vivo " + diasDeVivo() + ", su forma de caminar es" + formaDeCaminar() + 
			", come de esta manera" + comer() + ", su ritual de apareamiento es " + 
			ritualDeApareamiento() + ", y su tipo de vida es " + tipoDeVida() + "\n";
	}

}