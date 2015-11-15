/**
 * Clase que hereda de no paralelogramo y que ademas trae los metodos de su padre.
 */
public class Trapezoide extends NoParalelogramo{

	public Trapezoide(int[] coorA, int[] coorB, int[] coorC, int[] coorD){
		super(coorA, coorB, coorC, coorD);
	}

	@Override public String toString(){
		return "Trapezoide: " + getTodasCoor() + " || Su area es : " + getArea();
	}

}