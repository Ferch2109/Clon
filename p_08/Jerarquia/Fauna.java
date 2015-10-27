public abstract class Fauna extends Vida{

	protected String reino;
	protected String filo;
	protected String clase;

	public Fauna(int diasDeVivo, String reino,String filo
		, String clase){
		super(diasDeVivo);
		this.reino = reino;
		this.filo = filo;
		this.clase = clase;
	}

	public abstract String formaDeCaminar();

	public abstract String comer(); 

	public abstract String ritualDeApareamiento(); 

}