import java.util.Scanner;

/**
 * <p>Clase que sera usada para la conversion de una linea por el BufferReader</p>
 *
 * @author Angel Ivan Gladin G
 * @version 1.0
 * @date 08-ago-15.
 */
public class Converter{

	/**
	 * Metodo que toma una cadena del bufferReader y lo convirte al resultado.
	 * @param c La cadena que es leida en el bufferReader.
	 * @return La suma de los digitos.
	 */
	public static int converter(String c){
		
		int limInf = getFirstAndSecond(c)[0];
		int limSup = getFirstAndSecond(c)[1];

		String[] arrTot = new String[limSup-limInf + 1];

		int tot = 0;
		int aux = limInf;

		for (int i = 0; i<arrTot.length; i++, aux++) {
			arrTot[i] = ""+aux;
		}

		for (int i = 0; i<arrTot.length; i++) {
			for (int k = 0; k<arrTot[i].length() ; k++) {
				tot += Integer.parseInt(""+arrTot[i].charAt(k));
			}
		}
		return tot;
	}

	/**
	 * Metodo auxiliar que descompone la cadena
	 * @param c Cadena que sera descompuesta
	 * @return numbers Un arreglo de dos numeros que me devuelve el primer y 
	 * segundo digito.
	 */
	private static int[] getFirstAndSecond(String c){
		int[] numbers = new int[2];

		numbers[0] = Integer.parseInt(c.substring(0, c.indexOf(" ")));
		numbers[1] = Integer.parseInt(c.substring(c.indexOf(" ")+1, c.length()));
		
		return numbers;

	}


}