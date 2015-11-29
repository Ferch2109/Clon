/**
 * <p>Clase para crear una excepción propia que servirá para cuando
 * el usuario de un numero mayor que el esperado.</p>
 *
 * @author Angel Ivan Gladin Garcia
 * @date 31-11-15
 * @version 1.0
 */
public class NumberIsBiggerThanExpectedException extends Exception {

	public NumberIsBiggerThanExpectedException(String message) {
		super(message);
	}

}