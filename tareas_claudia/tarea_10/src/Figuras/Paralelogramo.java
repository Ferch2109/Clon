/**
 * Clase abstracta que hereda de Cuadrilatero, es abstracta por que hay muchos 
 * tipos de paralelogramos y debemos especificar bien que tipo es, ademas trae todos sus metodos,
 * usamos la palabra super para mandar a llamar al constructor de la clase base
 */
public abstract class Paralelogramo extends Cuadrilatero{
	
	public Paralelogramo(int[] coorA, int[] coorB, int[] coorC, int[] coorD){
		super(coorA, coorB, coorC,coorD);
	}

}