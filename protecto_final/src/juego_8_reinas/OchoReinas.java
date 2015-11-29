import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * <p>Proyecto Final: Juego de las Ocho Reinas</p>
 *
 * Clase que muestra la implementacion del juego de las Ocho reinas.
 *
 * <p>El problema de las ocho reinas es un pasatiempo en el que se colocan ocho reinas sin que se amenacen.
 * Fue propuesto por el ajedrecista alemán Max Bezzel en 1848. En el juego del ajedrez la
 * reina amenaza a aquellas piezas que se encuentren en su misma fila, columna o diagonal.
 * El juego de las 8 reinas consiste en colocar sobre un tablero de ajedrez ocho
 * reinas sin que estas se amenacen entre ellas.</p>
 *
 * En la misma carpetar existen un par de soluciones y no soluciones solo debera ejecutarse de esta
 * manera:   <p><code>java OchoReinas < soluciones/sol1.txt </code></p>
 *
 * @author Angel Ivan Gladin Garcia
 * @date 31-11-15
 * @version 1.0
 */
public class OchoReinas {

	static char[][] tablero = { {'░', '█', '░', '█', '░', '█', '░', '█'},
								{'█', '░', '█', '░', '█', '░', '█', '░'},
								{'░', '█', '░', '█', '░', '█', '░', '█'},
								{'█', '░', '█', '░', '█', '░', '█', '░'},
								{'░', '█', '░', '█', '░', '█', '░', '█'},
								{'█', '░', '█', '░', '█', '░', '█', '░'},
								{'░', '█', '░', '█', '░', '█', '░', '█'},
								{'█', '░', '█', '░', '█', '░', '█', '░'} };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/**
		 * Posicion i que se preguntara al usuario para tratar de poner la reina
		 */
		int i = 0;
		/**
		 *Posicion j que se preguntara al usuario para tratar de poner la reina
		 */
		int j = 0;

		/**
		 * Esta variable sera usada ya que cuando se acabe de tirar, iteramos sobre nuestro
		 * tablero y si encuentra 1 corana ira incrementando.
		 */
		int contador = 0;

		System.out.println("Da la primera coordenada y da un espacio e ingresa la segunda, despues "
		                   + "presiona la tecla [Enter]");
		System.out.println("Las cordenadas empizan desde el 0 hasta el 7");

		for (int k = 0; k < 8; k++) {
			
			try {
				System.out.print("Coordenada " + '[' + (k + 1) + ']' + " -> ");
				i = sc.nextInt();
				j = sc.nextInt();

				if (j > 8 || i > 8) throw new NumberIsBiggerThanExpectedException("Too big");

				if (j < 0 || i < 0) throw new NegativeNumberException("Please don't give negative numbers");

				verificar(i, j);

			} catch (InputMismatchException e1) {
				System.out.println("¡Chispas! Solo se aceptan numeros");
				k--;
				sc.next();
			} catch (NumberIsBiggerThanExpectedException e) {
				System.out.println("¡Chispas! Te pasaste de la longitud del tablero");
				k--;
				sc.reset();
			} catch (NegativeNumberException e) {
				System.out.println("¡Chispas! No puedes dar numeros negativos");
				k--;
				sc.reset();
			}

		}

		//Se recorrera el tablero en busca de reina e ira incrementando el contador.
		for (int k = 0; k < 8 ; k++) {
			for (int l = 0; l < 8 ; l++) {
				if (tablero[l][k] == '♛') {
					contador++;
				}
			}
		}

		System.out.println(contador == 8 ? "¡¡GANASTE!! :3" : "¡Chispas! Perdiste :(");
	}

	/**
	 *	Metodo que recibe la coordenada donde sera colocada la reina.
	 *	@param i recibe la la coordenada para posicionar la reina
	 *	@param j recibe la la coordenada para posicionar la reina
	 */
	public static void verificar(int i, int j) {

		System.out.println();

		//Iterar sobre el tablero
		for (int k = 0; k < tablero.length; k++) {

			//Verificare si donde se pondra la pieza no hay ninguna que lo amenace
			if (tablero[i][j] == '░' || tablero[i][j] == '█') {
				tablero[i][j] = '♛';
			}

			//Columna
			//para de esta manera solo modificar una fila.
			//Se iterara sobre la posicion de las fila pero el de las columnas permanece estatico.
			//Validacion para que en el renglon donde no esta la reina se rellenen.
			if (j != k) {
				tablero[i][k] = '—';
			}

			//Fila
			//Se iterara sobre la posicion de las columna pero el de las fila permanece estatico.
			//para de esta manera solo modificar una columna.
			//Validacion para que en la fila donde no esta la reina se rellenen.
			if (i != k) {
				tablero[k][j] = '|';
			}

			//Esto se hace para que el primer valor no lo ponga al pricipio donde
			//va la reina al momento de dibujar diagonales
			if (k != 0) {

				//Diagonal inferior izquierdas
				//Se comparar si la suma de la posicion de la Reina y el iterador es menor que la
				//longitud y lo mismo para la hara posision.
				//Se modificara los valores en diagonal inferiores.
				if (i + k < tablero.length && j + k < tablero.length) {
					tablero[i + k][j + k] = '\\';
				}

				//Diagonal superior izquierda
				//Se comparar si la resta de la posision es menos o igual a 0. Las casillas superiores
				//seran modificadas, ya que estamos obteniendo el rango.
				//Y a la posicion en diagonal superior sera modificada.
				if (i - k >= 0 && j - k >= 0) {
					tablero[i - k][j - k] = '\\';
				}

				//sup diag der
				if (i - k >= 0 && j + k < tablero.length) {
					tablero[i - k][j + k] = '/';
				}

				//inf diag izq
				if (i + k < tablero.length && j - k >= 0) {
					tablero[i + k][j - k] = '/';
				}
			}//end if

		}

		//Imprimir tablero
		for (int m = 0; m < tablero.length; m++) {
			for (int k = 0; k < tablero[m].length; k++) {
				System.out.print(tablero[m][k] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

}//end class