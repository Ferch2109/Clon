/**
 *
 * <p>Tarea 10: Herencia</p>
 *
 * Clase que muestra ejemplos de Objetos con herencias
 * 
 * Hay un metodo llamado {@link #getArea() getArea()} en la tarea decia que debia 
 * implementarse en cada clase pero es el mismo codigo asi que decidi ponerlo aqui y 
 * que los demas lo heredaran.
 *
 * Fuentes:
 *
 *<a href="https://www.youtube.com/watch?v=RSIlyMQkg0A">Area poligonos 1</a>.
 *<a href="https://www.youtube.com/watch?v=8vg_SwjLW5U">Area poligonos 2</a>.
 *
 * @author Angel Ivan Gladin G
 * @version 1.0
 * @date 16-nov-15.
 */
public abstract class Cuadrilatero{
	
	private int[] coorA = new int [2];
	private int[] coorB = new int [2];
	private int[] coorC = new int [2];
	private int[] coorD = new int [2];

	public Cuadrilatero(int[] coorA, int[] coorB, int[] coorC, int[] coorD){
		this.coorA = coorA;
		this.coorB = coorB;
		this.coorC = coorC;
		this.coorD = coorD;
	}

	public double getArea() {
        
        final int[][] det = {coorA, coorB, coorC, coorD, coorA};

        int diagSup = 0;
        int diagInf = 0;

        for (int i = 1; i < det.length; i++) {
            if (i > 0) {
                diagSup += det[i][0] * det[i - 1][1];
            } if (i < det.length) {
                diagInf += det[i - 1][0] * det[i][1];
            }
        }
        
        return .5 * (diagInf - diagSup);
    }

	public String getTodasCoor() {
		return getStrCoorA() + ' ' + getStrCoorB() + ' ' + getStrCoorC() +
				' ' + getStrCoorD();
	}

	public String getStrCoorA() {
		return "A " + '(' + coorA[0] + ',' + coorA[1] + ')' ;
	}

	public String getStrCoorB() {
		return "B " + '(' + coorB[0] + ',' + coorB[1] + ')' ;
	}

	public String getStrCoorC() {
		return "C " + '(' + coorC[0] + ',' + coorC[1] + ')' ;
	}

	public String getStrCoorD() {
		return "D " + '(' + coorD[0] + ',' + coorD[1] + ')' ;
	}

}