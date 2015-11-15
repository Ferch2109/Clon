/**
 * <p>Tarea 10: Herencia</p>
 *
 * Clase que muestra ejemplos de Objetos con herencias
 *
 * @author Angel Ivan Gladin G
 * @version 1.0
 * @date 16-nov-15.
 */
public class PruebaFiguras{

	static final int[] recCoorA  = {5,  3};
	static final int[] recCoorB  = {1,  3};
	static final int[] recCoorC  = {1, -3};
	static final int[] recCoorD  = {5, -3};
	
	static final int[] cuaCoorA  = { 2,  2};
	static final int[] cuaCoorB  = {-2,  2};
	static final int[] cuaCoorC  = {-2,  2};
	static final int[] cuaCoorD  = {-2, -2};
	
	static final int[] trapCoorA = { 3, -4};
	static final int[] trapCoorB = {-2,  5};
	static final int[] trapCoorC = {-3,  1};
	static final int[] trapCoorD = {-1, -2};
	
	public static void main(String[] args) {

		Cuadrado cuadrado = 
			new Cuadrado(cuaCoorA, cuaCoorB, cuaCoorC, cuaCoorD);

		Rectangulo rectangulo = 
			new Rectangulo(recCoorA, recCoorB, recCoorC, recCoorD);

		Trapezoide trapezoide = 
			new Trapezoide(trapCoorA, trapCoorB, trapCoorC, trapCoorD);

		System.out.println(cuadrado);
		System.out.println(rectangulo);
		System.out.println(trapezoide);
	
	}

}