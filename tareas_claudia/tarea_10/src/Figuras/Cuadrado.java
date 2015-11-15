/**
 * Clase que hereda de paralelogramo y que ademas trae los metodos de su padre.
 */
public class Cuadrado extends Paralelogramo{

	public Cuadrado(int[] coorA, int[] coorB, int[] coorC, int[] coorD){
		super(coorA, coorB, coorC, coorD);
	}

	@Override public String toString(){
		return "Cuadrado: " + getTodasCoor() + " ||  Su area es : " + getArea();
	}
	
}