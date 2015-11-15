/**
 * Clase que hereda de paralelogramo y que ademas trae los metodos de su padre.
 */
public class Rectangulo extends Paralelogramo{
	
	public Rectangulo(int[] coorA, int[] coorB, int[] coorC, int[] coorD){
		super(coorA, coorB, coorC, coorD);
	}

	@Override public String toString(){
		return "Rectangulo: " + getTodasCoor() + " || Su area es : " + getArea();
	}

}