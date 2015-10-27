public abstract class Vida{
	
	boolean vivo;
	int diasDeVivo;

	public Vida(int diasDeVivo){
		this.vivo = true;
		this.diasDeVivo = diasDeVivo; 
	}

	public boolean estaVivo(){
		return true;
	}

	public abstract int diasDeVivo(); 

	public abstract String tipoDeVida(); 

}